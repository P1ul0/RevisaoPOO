package entidade;


public class Ave extends Animal implements InterfaceAnimal {
    private String widthWing;

    private String typeFeather;

    public Ave() {

    }

    public Ave(String name, int age, double weight, String widthWing, String typeFeather) {
        super(name, age, weight);
        this.widthWing = widthWing;
        this.typeFeather = typeFeather;
    }

    public String getWidthWing() {
        return widthWing;
    }

    public void setWidthWing(String widthWing) {
        this.widthWing = widthWing;
    }

    public String getTypeFeather() {
        return typeFeather;
    }

    public void setTypeFeather(String typeFeather) {
        this.typeFeather = typeFeather;
    }

    @Override
    public String emitirSom() {
        return  "Som não reconhecido pelos criadores. pocó";
    }
}
