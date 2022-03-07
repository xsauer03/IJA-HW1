package ija.homework1.uml;

import java.util.ArrayList;
import java.util.List;

public class ClassDiagram extends Element {
    private String name;
    private List<UMLClassifier> classList;
//    private List<UMLClassifier> classifierList;

    public ClassDiagram(String name) {
        super(name);
        this.name = name;
        this.classList = new ArrayList<>();
//        this.classifierList = new ArrayList<>();
    }

    public UMLClass createClass(String name) {
        for (UMLClassifier umlClass : this.classList) {
            if (umlClass.getName().equals(name)) {
                return null;
            }
        }
        UMLClass umlClass = new UMLClass(name);
        this.classList.add(umlClass);
        return umlClass;
    }



    public UMLClassifier classifierForName(String name) {
        if (findClassifier(name) == null) {
            UMLClassifier umlClassifier = UMLClassifier.forName(name);
            this.classList.add(umlClassifier);
//            return umlClassifier;
        }
        return findClassifier(name);
    }

    public UMLClassifier findClassifier(String name) {
        for (UMLClassifier umlClassifier : this.classList) {
            if (umlClassifier.getName().equals(name)) {
                return umlClassifier;
            }
        }
        return null;
    }

}
