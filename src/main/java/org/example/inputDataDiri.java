package org.example;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class inputDataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("tMasukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        String jenisKelamin = scanner.nextLine();

        if (jenisKelamin.equalsIgnoreCase("P")) {
            jenisKelamin = "Perempuan";
        } else if (jenisKelamin.equalsIgnoreCase("L")) {
            jenisKelamin = "Laki-laki";
        } else {

            System.out.println("Jenis Kelamin tidak dapat ditentukan");
        }

        System.out.print("Masukkan tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirString = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        LocalDate tanggalSekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, tanggalSekarang);


        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        System.out.println("==== Informasi Pengguna ====");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan " + umur.getDays() + " hari");


        scanner.close();
    }
}