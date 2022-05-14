package Ex1;

public class Teste {

    public static void main(String[] args) {

        Arqueiro arqueiro = new Arqueiro("Robin Hood");
        Guerreiro guerreiro = new Guerreiro("Rei Arthur");

        arqueiro.aproximar(guerreiro);
        guerreiro.aproximar(arqueiro);
        arqueiro.aproximar(guerreiro);
        guerreiro.aproximar(arqueiro);
        arqueiro.aproximar(guerreiro);
        guerreiro.aproximar(arqueiro);
        arqueiro.aproximar(guerreiro);
        guerreiro.aproximar(arqueiro);

        System.out.println("");

        arqueiro.atacar(guerreiro);
        guerreiro.atacar(arqueiro);
        guerreiro.aproximar(arqueiro);

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            guerreiro.atacar(arqueiro);
        }


    }

}
