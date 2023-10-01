import java.util.Scanner;
public class loginkel525 {
    public static void main(String[] args) {
        // Email dan password yang benar
        String emailBenar = "rizkyroza2005@gmail.com";
        String passwordBenar = "gabahayata";

        // Membaca input email dan password dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();
// Memeriksa apakah email dan password sesuai
        if (email.equals(emailBenar) && password.equals(passwordBenar)) {
            System.out.println("Silahkan Masuk!");
        } else {
            System.out.println("Email dan Password Salah.");
        }

        // Menutup scanner
        scanner.close();



    }
}
