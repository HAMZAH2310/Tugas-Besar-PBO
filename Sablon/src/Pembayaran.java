import java.util.Scanner;

public class Pembayaran {
    public void prosesPembayaran(int totalHarga) {
        Scanner scanner = new Scanner(System.in);
        boolean pembayaranSukses = false;

        while (!pembayaranSukses) {
            System.out.println("Silakan masukkan jumlah uang yang akan dibayarkan: ");
            int jumlahBayar = scanner.nextInt();

            if (jumlahBayar >= totalHarga) {
                int kembalian = jumlahBayar - totalHarga;
                System.out.println("Pembayaran berhasil. Kembalian Anda: " + kembalian);
                pembayaranSukses = true;
            } else {
                System.out.println("Pembayaran kurang. Silakan bayar dengan jumlah yang lebih besar.");
            }
        }
    }
}
