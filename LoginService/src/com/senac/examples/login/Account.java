package com.senac.examples.login;

public interface Account {

	public boolean passwordMatches(String candidate);
	public void setLoggedIn(boolean state);
	public boolean  setLocked(boolean value);
	public boolean isLoggedIn();
	public boolean isLocked();
}
