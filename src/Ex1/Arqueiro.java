package Ex1;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        this.nome = nome;
        this.classe = "Arqueiro";
        this.estilo = EstiloAtq.RANGED;
        this.lvl = 1;
        this.vida = 100;
        this.danoBase = 20;
    }

    @Override
    public void lvlUp() {
        super.lvlUp();
        vida *= 1.05;
        danoBase *= 1.25;
    }

    @Override
    public void atacar(Personagem personagem) {

        if (!vivo) {
            System.out.println("Você não está vivo");
            return;
        }

        if (!personagem.vivo) {
            System.out.println("O " + personagem.classe + personagem.nome + " está morto.");
            return;
        }

        if(distancia <= estilo.getRange()) {
            personagem.vida -= danoBase;
            System.out.println("Você deu " + danoBase + "de dano");
        }

        if (personagem.vida <= 0) {
            personagem.vida = 0;
            vivo = false;
            System.out.println("O " + personagem.classe + personagem.nome + " está morto.");
        }
    }

}
