import java.util.Scanner;

public class Main extends main.mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("masukan nama lengkap anda: ");
        String nama = scanner.nextLine();

        System.out.print("masukan umur anda: ");
        String umur = scanner.nextLine();

        System.out.print("masukan nim anda: ");
        String nim = scanner.nextLine();

        System.out.print("masukan nilai akhir: ");
        String nilai = scanner.nextLine();


        try {
            int nilaiInt = Integer.parseInt(nilai.trim());
            System.out.println("halo nama saya: " + nama);
            System.out.println("umur saya: " + umur);
            System.out.println("nim anda: " + nim);
            System.out.println("nilai akhir anda: " + nilai);

            if (nilaiInt >= 75) {
                System.out.println("selamat anda lulus");
            } else {
                System.out.println("maaf anda tidak lulus");
            }
        } catch (NumberFormatException e) {
            System.out.println("Nilai tidak valid — masukkan angka yang benar.");
        }
        scanner.close();
    }


}
