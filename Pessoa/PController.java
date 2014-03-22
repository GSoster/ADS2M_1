import java.util.Calendar;
//import java.util.Random;
public class PController{
    //Atributos
    private PView pv;
    private String listaNomes[] = {"Adalberto", "Aldair", "Aldir", "Bruno", "Breno", "Bernardo", "Bartolomeu",
        "Carlos", "Diego", "Dagoberto", "Denise", "Daiana", "Elaine", "Estevan", "Fabio", "Felipe", "Fabricia", "Fernanda",
        "Guilherme", "Gustavo"};
       
    private String listaSobrenomes[] = {"Soster", "Santos", "Marinho", "Silveira", "Machado", "Pereira", "Ribeiro", "de Jesus",
        "Schimitz", "Muller", "Sosnowisk", "Trukisinsky", "Pedroso", "Martinez", "Valentino", "Bountielli", "Melo", "Casa Grande",
        "StoffenHouer", "Pegglow"};
        
    private String listaEnderecos[] = {"Av. Assis. Brasil", "Rua Alendrina", "Rua Stephn", "Av.Coronel Valadares", "Rua Pernambuco", "Rua Amazonas",//6
        "Rua Andrade Neves", "Av. Salvatorri Trulliano", "Av Porca Maddona", "Rua Gari", "St. San Martin", "St. Correa", "Rua Rio de Janeiro", "Av. Rio Grande",//8
        "Rua Sao Paulo", "Rua San Sebastian", "Av. Pallermo", "Av. Zumbi dos Palmares", "Av. Isaura","Rua Mathias"};//6
    
    private String listaTelefone[] = {"3432", "3312", "3321", "3365","3356","3345","4321","4312","4567","8853","4845","4456","4512",
    		"3431","4123","3214","3894","7895","4561","3154","3527"};
    
    //Metodo Construtor    
    public PController(){
        this.pv = new PView();
    }
     
    /*
     * para que o método fique o mais próximo de ser aleatório possível, o mesmo receberá um valor que multiplicará pelo resultado.
     */
    private int gerarRandom(int val){    	
    	//primeiro se pega os segundos da hora atual do sistema
    	Calendar data = Calendar.getInstance(); 
    	int segundos = data.get(Calendar.SECOND);
    	String seg;
    	//converte o valor interger em String concatenando ele com uma string
    	seg = segundos + "i";
    	//separamos os valores dos segundos
    	String sn1 = seg.substring(0,1);
    	String sn2 = seg.substring(1,2);
    	int n1 = Integer.parseInt(sn1);
    	int n2 = Integer.parseInt(sn2);
    	int nRandom = 0;    	
    	if((n1!=0) && (n2!=0)){
    		//caso o valor recebido seja par, faremos com que multiplique pelo n1
    		if(val%2 == 0){
    			n1 = n1*val;    		
    		}else{ //se o valor do parâmetro for impar, multiplicaremos o n2 por ele.
    			n2 = n2*val;    			
    		}
    		nRandom = n1*n2;    		    	
    	}
    	//como o array só contem 20 valores, o indice não pode ser superior a 20 (0-19)
    	while(nRandom > 20){
			nRandom -= 3;
		}
    	return nRandom;
    }
    
    
    private String gerarTelefone(){
    	int nRandom = this.gerarRandom(3);
    	String numeros = this.listaTelefone[nRandom];
    	return numeros;
    }
    
    public String escolhe(int tipo){
    	//Pega os milesegundos da data, e os soma (não multiplica para não zerar, caso algum seja zero).
    	int parametro = 0;
    	do{
	    	Calendar data = Calendar.getInstance();
	    	int mils = data.get(Calendar.MILLISECOND);
	    	String milseg = mils + "i";
	    	String sn1 =  milseg.substring(0,1);
	    	String sn2 =  milseg.substring(1,2);
	    	int n1 = Integer.parseInt(sn1);
	    	int n2 = Integer.parseInt(sn2);	    	
	    	if(n1 != 0){
	    		parametro += n1;
	    	}
	    	if(n2 != 0){
	    		parametro += n2;
	    	}
    	}while(parametro == 0);
    	//para garantir a aleatoridade do número, será passado um parâmetro (que é a soma dos milisegundos da data)        	
    	int nr = this.gerarRandom(parametro);    	
        
    	//verifica qual lista deve ser pesquisada
    	if(tipo == 1){// o tipo 1 corresponde a nome
            return this.listaNomes[nr];
        }else if(tipo == 0){// o tipo 1 corresponde a sobrenome
            return this.listaSobrenomes[nr];
        }else{// o tipo 1 corresponde a endereco
            return this.listaEnderecos[nr];
        }
    	
    }
        
   public void gerar(){
        //Telefone t = new Telefone("residencial",51,343,2787);
	   Telefone t = new Telefone("residencial",gerarTelefone().substring(0,2),gerarTelefone().substring(0,3),gerarTelefone());
        //Pessoa Parametros: nome, sobrenome, endereço, telefone
        Pessoa p = new Pessoa(this.escolhe(1), this.escolhe(0),this.escolhe(2), t);                    
        pv.exibePessoa(p.getNome(), p.getSobrenome(), p.getEndereco(), p.getTelefone().toString());

   }
}