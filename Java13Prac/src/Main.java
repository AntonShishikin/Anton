import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone = sc.next();

        TelProcessor telProcessor = new TelProcessor(phone);
        System.out.println(telProcessor. phoneConventer());
    }
}