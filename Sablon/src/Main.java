import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staff staffYangBerjaga = new Staff("Tanlia Gunawan", "Jalan Bunga", 18);

        boolean inginPesananLagi = true;

        while (inginPesananLagi) {
            Pesanan pesanan = new Pesanan(staffYangBerjaga, 0); // Set estimasi awal menjadi 0
            PesananSablon pesananSablon = new PesananSablon();

            System.out.println("Staff yang sedang bertugas: " + pesanan.getStaff().getNama());

            System.out.println("Masukkan Nama Anda: ");
            String nama = scanner.nextLine();

            pesananSablon.tampilkanDaftarSablon(); // Menampilkan daftar sablon

            System.out.println("Masukkan Jenis Sablon yang Anda Inginkan (1-7): ");
            int pilihanSablon = scanner.nextInt();
            scanner.nextLine(); // Membersihkan new line setelah nextInt()

            switch (pilihanSablon) {
                case 1:
                    pesanan.setEstimasiPengerjaan(5); // Estimasi 5 hari untuk jenis sablon 1
                    break;
                case 2:
                    pesanan.setEstimasiPengerjaan(7); // Estimasi 7 hari untuk jenis sablon 2
                    break;
                case 3:
                    pesanan.setEstimasiPengerjaan(3); // Estimasi 3 hari untuk jenis sablon 3
                    break;
                case 4:
                    pesanan.setEstimasiPengerjaan(5); // Estimasi 5 hari untuk jenis sablon 4
                    break;
                case 5:
                    pesanan.setEstimasiPengerjaan(4); // Estimasi 4 hari untuk jenis sablon 5
                    break;
                case 6:
                    pesanan.setEstimasiPengerjaan(7); // Estimasi 7 hari untuk jenis sablon 6
                    break;
                case 7:
                    pesanan.setEstimasiPengerjaan(6); // Estimasi 6 hari untuk jenis sablon 7
                    break;
                default:
                    System.out.println("Nomor yang Anda masukkan tidak valid.");
            }

            int hargaPerBaju = pesananSablon.dapatkanHargaSablon()[pilihanSablon - 1];

            System.out.println("Masukkan jumlah baju yang dipesan: ");
            int jumlahBaju = scanner.nextInt();
            scanner.nextLine(); // Membersihkan new line setelah nextInt()

            int totalHarga = hargaPerBaju * jumlahBaju;

            System.out.println("Total harga yang harus dibayar: Rp" + totalHarga);
            System.out.println("Estimasi waktu pemesanan: " + pesanan.getEstimasiPengerjaan() + " hari");

            // Lakukan operasi lain yang diperlukan, seperti proses pembayaran
            Pembayaran pembayaran = new Pembayaran();
            pembayaran.prosesPembayaran(totalHarga);

            // Menampilkan konfirmasi setelah pembayaran
            System.out.println("Ingin melakukan pesanan lagi? [y/t]");
            String jawaban = scanner.next();
            scanner.nextLine(); // Membersihkan new line setelah next()

            if (jawaban.equalsIgnoreCase("t")) {
                inginPesananLagi = false;
                System.out.println("Terima kasih telah berbelanja!");
            }
        }
    }
}
