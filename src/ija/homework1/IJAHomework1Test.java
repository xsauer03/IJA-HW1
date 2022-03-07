/*
 * IJA 2021/22: Úloha č. 1
 * Testovací třída pro JUnit.
 */
package ija.homework1;

import ija.homework1.uml.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class IJAHomework1Test {

    @Test
    public void myTests() {
        ClassDiagram d = new ClassDiagram("My model");
        UMLClass cls = d.createClass("C1");
        UMLAttribute attr = new UMLAttribute("count", d.classifierForName("int"));

        d.rename("Ahoj");
        Assert.assertEquals("Test na prejmenovani elementu", "Ahoj", d.getName());

        cls.addAttribute(attr);
        Assert.assertFalse("Vraci false", cls.addAttribute(attr));
        Assert.assertEquals("Vraci stejnou pozici", 0, cls.moveAttrAtPosition(attr, 0));

        Assert.assertNull("Vraci null", d.createClass("C1"));
        Assert.assertNotNull("Vraci tridu", d.createClass("C2"));

        UMLOperation op1 = UMLOperation.create("Test", d.classifierForName("float"), new UMLAttribute("arg1", d.classifierForName("C1")));
        UMLAttribute attr3 = new UMLAttribute("test2",d.classifierForName("int"));
        Assert.assertTrue("Vraci true... uspesne pridano", op1.addArgument(attr3));
        Assert.assertFalse("Jiz je v seznamu vraci false",op1.addArgument(attr3));
    }
}
