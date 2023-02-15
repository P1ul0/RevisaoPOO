import entidade.Animal;
import entidade.Ave;
import entidade.Mamifero;
import entidade.Peixe;

public class Main {
    public static void main(String[] args) {
        Animal ave = new Ave();
        Animal peixe = new Peixe();
        Animal mamifero = new Mamifero();

        System.out.println(ave.emitirSom());
        System.out.println(peixe.emitirSom());
        System.out.println(mamifero.emitirSom());

    }
}
