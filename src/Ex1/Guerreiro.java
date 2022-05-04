package Ex1;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        this.nome = nome;
        this.classe = "Guerreiro";
        this.estilo = EstiloAtq.MELEE;
        this.lvl = 1;
        this.vida = 200;
        this.danoBase = 10;
        this.vivo = true;
    }

    @Override
    public void lvlUp() {
        super.lvlUp();
        vida *= 1.25;
        danoBase *= 1.05;
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

        if (distancia <= estilo.getRange()) {
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

