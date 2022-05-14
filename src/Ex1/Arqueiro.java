package Ex1;

//Heranca de classe abstrata
public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        this.nome = nome;
        this.classe = "Arqueiro";
        this.estilo = EstiloAtq.RANGED;
        this.lvl = 1;
        this.vida = 100;
        this.danoBase = 20;
        this.vivo = true;
    }

    //Polimorfismo
    @Override
    public void lvlUp() {
        super.lvlUp();
        vida *= 1.05;
        danoBase *= 1.25;
    }

    //Polimorfismo
    @Override
    public void atacar(Personagem personagem) {

        if (!vivo) {
            System.out.println("Você não está vivo");
            return;
        }

        if (!personagem.vivo) {
            System.out.println("O " + personagem.classe + " " + personagem.nome + " está morto.");
            return;
        }

        if(distancia <= estilo.getRange()) {
            personagem.vida -= danoBase;
            System.out.println(nome + " deu " + danoBase + " de dano em " + personagem.nome);
        } else {
            System.out.println(nome + "não está perto o suficiente para atacar.");
        }

        if (personagem.vida <= 0) {
            personagem.vida = 0;
            vivo = false;
            System.out.println("O " + personagem.classe + " " + personagem.nome + " está morto.");
        }
    }

}
