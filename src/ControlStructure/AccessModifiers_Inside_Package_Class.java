package ControlStructure;

public class AccessModifiers_Inside_Package_Class {
    public static void main(String[] args) {
        PyramindPrinting obj = new PyramindPrinting();
        System.out.println(obj.i);
        obj.reversePyramid();
        obj.printPyramid();
    }
}
