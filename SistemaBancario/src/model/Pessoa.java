package model;

public class Pessoa{
    protected String nome;
    protected String sobrenome;
    protected String endereco;    
    
    //construtor
    public Pessoa(String n, String sn, String e){
        this.setNome(n);
        this.setSobrenome(sn);
        this.setEndereco(e);        
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
    
    
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public String getEndereco(){
        return this.endereco;
    }    
    
}