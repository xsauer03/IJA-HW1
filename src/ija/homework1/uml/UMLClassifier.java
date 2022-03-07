package ija.homework1.uml;

public class UMLClassifier extends Element {
    private String name;
    private final boolean isUserDefined;

    public UMLClassifier(String name) {
        this(name, true);
    }

    public UMLClassifier(String name, boolean isUserDefined) {
        super(name);
        this.name = name;
        this.isUserDefined = isUserDefined;
    }


    public static UMLClassifier forName(String name) {
        return new UMLClassifier(name, false);
    }

    public boolean isUserDefined() {
        return isUserDefined;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.isUserDefined + ")";
    }
}
