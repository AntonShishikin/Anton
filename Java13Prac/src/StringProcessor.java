import java.util.Scanner;

public class StringProcessor {

    public void printString(String s){
        System.out.println(s);
    }

    public static void printLastSymbol(String s){
        System.out.println(s.charAt(s.length()-1));
    }

    public static boolean checkLastSubString(String s){
        if (s.length() >= 3) {
            return s.substring(s.length() - 3) == "!!!";
        }else{
            return false;
        }
    }

    public static boolean checkEndsWith(String s){
        if (s.length() >= 3){
            return s.endsWith("!!!");
        }else{
            return false;
        }
    }

    public static boolean checkStartWith(String s){
        if (s.length() >= 5){
            return s.startsWith("I like");
        }else{
            return false;
        }
    }

    public static String replace(String s){
        return s.replace('a', 'o');
    }

    public static String toUpCase(String s){
        return s.toUpperCase();
    }

    public static String toLowCase(String s){
        return s.toLowerCase();
    }

    public static String cut(String s){
        String original = s;
        int startIndex = original.indexOf("Java");

        if (startIndex != -1) {
            int endIndex = startIndex + "Java".length();

            String beforeJava = original.substring(0, startIndex);
            String afterJava = original.substring(endIndex);

            String result = beforeJava + afterJava;
            System.out.println(result);
        } else {
            System.out.println("Sunstring 'Java' can not founded.");
        }
        return "Error while finding substring";
    }

    public static boolean checkSubString(String s){
        return s.contains("Java");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //printLastSymbol(s);
        System.out.println(checkLastSubString(s));
    }
}
