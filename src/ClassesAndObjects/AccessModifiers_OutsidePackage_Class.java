package ClassesAndObjects;

import ControlStructure.PyramindPrinting;
public class AccessModifiers_OutsidePackage_Class {
    public static void main(String[] args) {
        PyramindPrinting obj = new PyramindPrinting();
        System.out.println(obj.i); // this is public
        obj.reversePyramid(); // this is public mehod
        System.out.println(PyramindPrinting.l);
    }
}
