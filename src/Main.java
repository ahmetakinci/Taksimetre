import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taksi ile kaç km gittiniz: ");
        double a = scanner.nextDouble();
        double ucret = a*2.2+10;
        int b = 20;
        double fiyat;
        fiyat = a<4.54 ? b : ucret;
        System.out.println("Ödemeniz Gereken Tutar: " + fiyat);

    }
}
