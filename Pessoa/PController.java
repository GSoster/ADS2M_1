import java.util.Random;
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
    
    //Método Construtor    
    public PController(){
        this.pv = new PView();
    }
        
    public String escolhe(int tipo){
        Random r = new Random();  
        int nr = r.nextInt(20);  
        if(tipo == 1){
            return this.listaNomes[nr];
        }else if(tipo == 0){
            return this.listaSobrenomes[nr];
        }else{
            return this.listaEnderecos[nr];
        }
    }
        
   public void gerar(){
        Telefone t = new Telefone("residencial",51,343,2787);
        Pessoa p = new Pessoa(this.escolhe(1), this.escolhe(0),this.escolhe(2), t);                    
        pv.exibePessoa(p.getNome(), p.getSobrenome(), p.getEndereco(), p.getTelefone().toString());

   }
}