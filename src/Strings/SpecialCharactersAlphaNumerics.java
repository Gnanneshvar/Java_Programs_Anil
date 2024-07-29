package Strings;

public class SpecialCharactersAlphaNumerics {
    static String alpha="",numerics="",specialCharacters="";
    public static int a=10;
    static public final int b=20;
    public static void main(String[] args) {
        String str = "Hello12+Welcome34 - To56=Training78%Selenium#Training910 ";
        getAlphaBetics(str);
        getNumerics(str);
        getSpecialCharacters(str);
        System.out.println("Main String::"+str);
        replaceAllMethod(str);
        System.out.println("Alphas is::"+alpha);
        System.out.println("Numerics::"+numerics);
        System.out.println("Special Characters::"+specialCharacters);

        // get only alphabetics
        // get only numerics
        // get only special characters
    }
   public static void getAlphaBetics(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i)))
            {
                alpha=alpha+str.charAt(i);
            }
        }
    }

    public final void test9()
    {
        System.out.println("Inside SpecialCharactersAlphaNumerics class");
    }

    public final void test9(int a)
    {
        System.out.println("Inside SpecialCharactersAlphaNumerics class");
    }
    static void getNumerics(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
            {
                numerics=numerics+str.charAt(i);
            }
        }
    }
    static void getSpecialCharacters(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isLetterOrDigit(str.charAt(i)))
            {
                specialCharacters=specialCharacters+str.charAt(i);
            }
        }
    }
    static void replaceAllMethod(String str) {
        System.out.println("Replace Numerics::"+str.replaceAll("\\d",""));
        System.out.println("Get numerics::"+str.replaceAll("\\D",""));
        System.out.println("Non Alpha::"+str.replaceAll("[a-zA-Z]",""));
        System.out.println("Get Alpha::"+str.replaceAll("[^a-zA-Z]",""));
        System.out.println("Get Special Characters::"+str.replaceAll("\\w","")); // Special Characters
        System.out.println("Non Special Characters::"+str.replaceAll("\\W","")); // non special
    }
}
