package model;
public class Pessoa{
    private String nome;
    private String sobrenome;
    private String endereco;
    private Telefone telefone;
    
    //construtor
    public Pessoa(String n, String sn, String e, Telefone t){
        this.setNome(n);
        this.setSobrenome(sn);
        this.setEndereco(e);
        this.setTelefone(t);        
    }
    //Sobrecarga de construtor.
    public Pessoa(String nome, String endereco){
    	this.setNome(nome);
    	this.setEndereco(endereco);
    }
    
    //metodos acessores
    public void setNome(String n){
        this.nome =  n;   
    }
    public void setSobrenome(String sn){
        this.sobrenome =  sn;   
    }    
    public void setEndereco(String e){
        this.endereco =  e;   
    }    
    public void setTelefone(Telefone t){
        this.telefone = t;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public String getEndereco(){
        return this.endereco;
    }    
    public Telefone getTelefone(){
        return this.telefone;
    }
    
    public String getTelefoneTratado(){
    	return "("+this.telefone.getCodArea()+")" + this.telefone.getN1()+"-"+this.telefone.getN2();
    }
    
    public String getNomeCompleto(){
    	return this.getNome() + " " + this.getSobrenome();
    }
    
}