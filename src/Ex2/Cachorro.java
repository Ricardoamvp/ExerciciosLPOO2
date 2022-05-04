package Ex2;

public class Cachorro extends Mamiferos {

    public Cachorro() {
        this.nome = "Cachorro";
        this.idadeMedia = 11;

        emiteSom();
    }

    @Override
    public void emiteSom() {
        System.out.println("O " + nome + " que vive em média " + idadeMedia + " anos, late");
    }
}
