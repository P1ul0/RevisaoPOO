import entidade.Ave;
import entidade.Mamifero;
import entidade.Peixe;

public class Main {
    public static void main(String[] args) {
        Ave ave = new Ave();
        Peixe peixe = new Peixe();
        Mamifero mamifero = new Mamifero();

        System.out.println(ave.emitirSom());
        System.out.println(peixe.emitirSom());
        System.out.println(mamifero.emitirSom());

    }
}