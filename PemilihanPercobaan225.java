import java.util.Scanner;
public class PemilihanPercobaan225 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        
        System.out.print("Nilai uas     : ");
        float uas = input25.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input25.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input25.nextFloat();
        System.out.print("Nilai tugas   : ");
float tugas = input25.nextFloat();

float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

if (80<total && total<=100) {
System.out.println("Nilai Huruf A\nnilai Setara 4\nKualifikasi Sangat Baik");
} else if  (73<total && total<=80) {
    System.out.println("Nilai Huruf B+\nNilai Setara 3,5\nKualisifikasi Lebih dari Baik");
} else if  (65<total && total<=73) {
    System.out.println("Nilai huruf B\nNilai setara 3\nKualifikasi baik");
} else if  (60<total && total<=65)  {
    System.out.println("Nilai huruf C+\nNilai Setara 2,5\nKualifikasi Lebih Dari Cukup");
} else if  (50<total && total<=60) {
    System.out.println("Nilai huruf C\n Nilai setara 2\nKualifikasi Cukup"); 
} else if  (39<total && total<=50) {
    System.out.println("Nilai huruf D\nNilai setara 1\nKualifikasi Kurang");
} else {
    System.out.println("Nilai huruf E\nNilai setara 0\nKualifikasi Gagal");
}
}

}
