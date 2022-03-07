package ija.homework1.uml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UMLClass extends UMLClassifier {
    private boolean isAbstract;
    private List<UMLAttribute> attributes;


    public UMLClass(String name) {
        super(name);
        this.isAbstract = false;
        this.attributes = new ArrayList<>();
    }

    public boolean isAbstract() {
        return this.isAbstract;
    }

    public void setAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    public boolean addAttribute(UMLAttribute attr) {
        for (UMLAttribute attribute : this.attributes) {
            if (attribute.equals(attr)) {
                return false;
            }
        }
        this.attributes.add(attr);
        return true;
    }

    public int getAttrPosition(UMLAttribute attr) {
        int i = 0;
        for (UMLAttribute attribute : this.attributes) {
            if (attribute.equals(attr)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int moveAttrAtPosition(UMLAttribute attr, int pos) {
        int oldPos = getAttrPosition(attr);
        UMLAttribute tmp;
        if (oldPos == -1 || oldPos == pos) {
            return oldPos;
        }
        for (int i = pos; i < oldPos; i++) {
            tmp = this.attributes.get(i);
            this.attributes.set(i, this.attributes.get(oldPos));
            this.attributes.set(oldPos, tmp);
        }
        return 0;
    }

    public List<UMLAttribute> getAttributes() {
        return Collections.unmodifiableList(this.attributes);
    }

}