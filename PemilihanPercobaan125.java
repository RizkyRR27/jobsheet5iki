import java.util.Scanner;
public class PemilihanPercobaan125 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.println("Masukan angka: ");
     int angka = input25.nextInt();
     
     String message = angka % 2 == 0 ? "angka "+angka+" bilangan genap" : "Angka"+angka+" bilangan ganjil";
     System.out.println(message);

     }
}
