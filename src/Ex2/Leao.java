package Ex2;

public class Leao extends Mamiferos {

    public Leao() {
        this.nome = "Leão";
        this.idadeMedia = 15;

        emiteSom();
    }

    @Override
    public void emiteSom() {
        System.out.println("O " + nome + " que vive em média " + idadeMedia + " anos, ruge");
    }

}
