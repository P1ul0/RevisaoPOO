package entidade;

public class Peixe extends Animal implements  InterfaceAnimal{
    private String scientificName;

    public Peixe() {

    }

    public Peixe(String name, int age, double weight, String scientificName) {
        super(name, age, weight);
        this.scientificName = scientificName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    @Override
    public String emitirSom() {
        return "glub* glub*";
    }
}
