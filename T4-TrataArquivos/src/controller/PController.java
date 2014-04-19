package controller;
import view.PView;
import model.Pessoa;
import model.Telefone;
import java.util.Random;
public class PController{
    //Atributos
    private Random geradorRandom;
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
        this.geradorRandom = new Random();
    }
     

    
    private String gerarTelefone(){
    	int nRandom = this.geradorRandom.nextInt(20);
    	String numeros = this.listaTelefone[nRandom];
    	return numeros;
    }
    
    public String escolhe(int tipo){   	    	        
    	int nr = this.geradorRandom.nextInt(20);    	
        
    	//verifica qual lista deve ser pesquisada
    	if(tipo == 1){// o tipo 1 corresponde a nome
            return this.listaNomes[nr];
        }else if(tipo == 0){// o tipo 1 corresponde a sobrenome
            return this.listaSobrenomes[nr];
        }else{// o tipo 1 corresponde a endereco
            return this.listaEnderecos[nr];
        }
    	
    }
        
    public Telefone retornarTelefone(){
    	Telefone t = new Telefone("residencial",gerarTelefone().substring(0,2),gerarTelefone().substring(0,3),gerarTelefone());
    	return t;
    }
    
    public Pessoa retornarPessoa(Telefone t){
        //Pessoa Parametros: nome, sobrenome, endere�o, telefone
        Pessoa p = new Pessoa(this.escolhe(1), this.escolhe(0),this.escolhe(2), t);                    
        return p;
    }
    
   public void gerar(){
	   Telefone t = retornarTelefone();
	   Pessoa p = retornarPessoa(t);
       pv.exibePessoa(p.getNome(), p.getSobrenome(), p.getEndereco(), p.getTelefone().toString());

   }
}