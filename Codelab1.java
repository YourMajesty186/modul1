import java.util.Scanner;
import java.time.*;

public class Codelab1 {
    public static void main(String[] args) {
        String nama;
        String jenis_kelamin;
        LocalDate tanggal_lahir;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        nama = input.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        jenis_kelamin = input.nextLine();
        if (jenis_kelamin.equalsIgnoreCase("L")) {
            jenis_kelamin = "Laki-laki";
        } else if (jenis_kelamin.equalsIgnoreCase("P")) {
            jenis_kelamin = "Perempuan";
        } else {
            jenis_kelamin = "tidak diketahui";
        }

        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String tanggalInput = input.nextLine();
        tanggal_lahir = LocalDate.parse(tanggalInput);

        LocalDate today = LocalDate.now();
        Period umur = Period.between(tanggal_lahir, today);

        int umurTahun = umur.getYears();
        int umurBulan = umur.getMonths();

        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenis_kelamin);
        System.out.println("Umur Anda : " + umurTahun + " tahun " + umurBulan + " bulan");
    }
}