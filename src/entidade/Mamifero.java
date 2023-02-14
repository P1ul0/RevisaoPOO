package entidade;

public class Mamifero extends  Animal implements InterfaceAnimal {
    private String typePelage;

    private String mamaryGlands;

    public Mamifero() {

    }

    public Mamifero(String name, int age, double weight, String typePelage, String mamaryGlands) {
        super(name, age, weight);
        this.typePelage = typePelage;
        this.mamaryGlands = mamaryGlands;
    }

    public String getTypePelage() {
        return typePelage;
    }

    public void setTypePelage(String typePelage) {
        this.typePelage = typePelage;
    }

    public String getMamaryGlands() {
        return mamaryGlands;
    }

    public void setMamaryGlands(String mamaryGlands) {
        this.mamaryGlands = mamaryGlands;
    }

    @Override
    public String emitirSom() {
        return "rwaaaaannnnnnn* rwaaaaannnnnnn*";
    }
}
