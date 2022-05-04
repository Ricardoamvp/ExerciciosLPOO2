package Ex2;

public class Lobo extends Mamiferos {

    public Lobo() {
        this.nome = "Lobo";
        this.idadeMedia = 16;

        emiteSom();
    }

    @Override
    public void emiteSom() {
        System.out.println("O " + nome + " que vive em média " + idadeMedia + " anos, uiva");
    }

}
