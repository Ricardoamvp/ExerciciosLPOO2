package Ex1;

//Classe Abstrata
public abstract class Personagem {

    protected String nome;
    protected String classe;
    protected EstiloAtq estilo;
    protected int lvl;
    protected int vida;
    protected int danoBase;
    protected boolean vivo;
    protected int distancia = 10;


    public void lvlUp() {
        this.lvl += 1;
        System.out.println("O " + classe + " " + nome + " upou para o level " + lvl);
    }

    public abstract void atacar(Personagem personagem);

    public void aproximar(Personagem personagem) {
        if(!vivo) {
            System.out.println("Você está morto");
            return;
        }

        if(distancia == 1) {
            System.out.println("Vocês estão proximos demais");
        } else {
            distancia -= 1;
            personagem.distancia -= 1;
            System.out.println(nome + " deu uma passo a frente.");
        }

    }

    public void afastar(Personagem personagem) {
        if(!vivo){
            System.out.println(nome + " está morto");
            return;
        }

        if(distancia == 10) {
            System.out.println("Vocês estão longes demais");
        } else {
            distancia += 1;
            personagem.distancia += 1;
            System.out.println(nome + "deu um passo para trás.");
        }

    }


}
