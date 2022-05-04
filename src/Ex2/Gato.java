package Ex2;

public class Gato extends Mamiferos {

    public Gato() {
        this.nome = "Gato";
        this.idadeMedia = 14;

        emiteSom();
    }

    @Override
    public void emiteSom() {
        System.out.println("O " + nome + " que vive em média " + idadeMedia + " anos, mia");
    }

}
