package ControlStructure;

public class SwitchStatement {
    public static void main(String[] args) {
        String str = "hello";
        switch (str.toLowerCase()) {
            case "hello":
                System.out.println("hello");
                break;
            case "hi":
                System.out.println("hi");
                break;
            case "welcome":
                System.out.println("welcome");
                break;
            default:
                System.out.println("Default");

        }
    }
}
