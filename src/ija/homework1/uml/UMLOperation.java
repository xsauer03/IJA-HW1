package ija.homework1.uml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UMLOperation extends UMLAttribute {
    private String name;
    private UMLClassifier type;
    private List<UMLAttribute> attributeList;

    public UMLOperation(String name, UMLClassifier type) {
        super(name, type);
        this.name = name;
        this.type = type;
        attributeList = new ArrayList<>();
    }

    public static UMLOperation create(String name, UMLClassifier type, UMLAttribute... args) {
        UMLOperation newOperation = new UMLOperation(name,type);
        newOperation.attributeList.addAll(Arrays.asList(args));
        return newOperation;
    }

    public boolean addArgument(UMLAttribute arg){
        for (UMLAttribute attribute : attributeList) {
            if (attribute.equals(arg)) {
                return false;
            }
        }
        attributeList.add(arg);
        return true;
    }

    public List<UMLAttribute> getArguments() {
        return Collections.unmodifiableList(this.attributeList);
    }


}
