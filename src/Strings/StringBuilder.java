package Strings;

public class StringBuilder {
    public static void main(String[] args) {
        String str = "G K Gnaneshwar";
        java.lang.StringBuilder builder = new java.lang.StringBuilder("G K Gnaneshwar");
        builder.append("GKG");
        System.out.println(builder);
        builder.delete(str.length(), builder.length());
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
