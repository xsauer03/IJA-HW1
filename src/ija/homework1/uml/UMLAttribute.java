package ija.homework1.uml;

public class UMLAttribute extends Element {
    UMLClassifier type;
    String name;

    public UMLAttribute(String name, UMLClassifier type) {
        super(name);
        this.type = type;
        this.name = name;
    }

    public UMLClassifier getType() {
        return this.type;
    }


    @Override
    public String toString() {
       return this.name + ":" + this.getType().toString();
    }

}
