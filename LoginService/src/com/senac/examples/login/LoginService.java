package com.senac.examples.login;

public class LoginService {
	private AccountDB accountDB;
	private int failedAttempts;
	private Account previousAccount; 
	public LoginService(AccountDB accountDB){
		this.accountDB = accountDB;
		
	}
	
	public void login(String username, String password) throws AccountLoginLimitReachedException, AccountNotFoundException, AccountLockedExcpetion{
		Account account = accountDB.find(username);
		
		if(account == null){
			throw new AccountNotFoundException();
		}
		
		if(account.isLoggedIn()){
			throw new AccountLoginLimitReachedException();
		}
		if(account.isLocked()){
			throw new AccountLockedExcpetion();
		}
		if(account.passwordMatches(password)){
			account.setLoggedIn(true);
		}else{
			if(account.equals(previousAccount)){
				failedAttempts ++;
			}else{
				previousAccount = account;
				failedAttempts = 1;
			}
			
			
		}
		if(failedAttempts == 3){
			account.setLocked(true);
		}
	}
	
	

}
