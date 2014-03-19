public class Telefone{
    private String tipo;
    private int codArea;
    private int n1, n2;
    
    //Método Construtor
    public Telefone(String tipo, int codArea, int n1, int n2){
        this.setTipo(tipo);
        this.setCodArea(codArea);
        this.setN1(n1);        
        this.setN2(n2);        
    }

    //Métodos Acessores
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setCodArea(int cod){
        this.codArea = cod;
    }
    public void setN1(int n1){
        this.n1 = n1;
    }    
    public void setN2(int n2){
        this.n2 = n2;
    }        
    
    public String getTipo(){
        return this.tipo;
    }
    public int getCodArea(){
        return this.codArea;
    }
    public int getN1(){
        return this.n1;
    }    
    public int getN2(){
        return this.n2;
    }    

    //Método toString (para gerar uma String que possa ser exibida)
    public String toString(){
        return "Tipo:"+ this.tipo +"(" + this.codArea + ")"+this.n1+"-"+this.n2;
    }
}