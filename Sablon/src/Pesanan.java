public class Pesanan implements PilihanSablon {
    private Staff staff;
    private int estimasiPengerjaan; // Estimasi waktu dalam hari

    public Pesanan(Staff staff, int estimasiPengerjaan) {
        this.staff = staff;
        this.estimasiPengerjaan = estimasiPengerjaan;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public int getEstimasiPengerjaan() {
        return estimasiPengerjaan;
    }

    public void setEstimasiPengerjaan(int estimasiPengerjaan) {
        this.estimasiPengerjaan = estimasiPengerjaan;
    }

    // Method untuk menampilkan daftar sablon
    public void tampilkanDaftarSablon() {
        System.out.println("===============================================");
        System.out.println("             Pilihan Jenis Sablon              ");
        System.out.println("===============================================");
        System.out.println("[1]. Sablon Glow In The Dark");
        System.out.println("[2]. Sablon Pigmen");
        System.out.println("[3]. Sablon Rubber");
        System.out.println("[4]. Sablon Glitter");
        System.out.println("[5]. Sablon Flocking");
        System.out.println("[6]. Sablon DTG");
        System.out.println("[7]. Sablon Super White");
        System.out.println("===============================================");
        System.out.println();
    }

    // Implementasi dari interface PilihanSablon
    public void pilihSablon(int nomorSablon) {
        switch (nomorSablon) {
            case 1:
                System.out.println("Anda memilih: Sablon Glow In The Dark");
                break;
            case 2:
                System.out.println("Anda memilih: Sablon Pigmen");
                break;
            case 3:
                System.out.println("Anda memilih: Sablon Rubber");
                break;
            case 4:
                System.out.println("Anda memilih: Sablon Glitter");
                break;
            case 5:
                System.out.println("Anda memilih: Sablon Flocking");
                break;
            case 6:
                System.out.println("Anda memilih: Sablon DTG");
                break;
            case 7:
                System.out.println("Anda memilih: Sablon Super White");
                break;
            default:
                System.out.println("Nomor yang Anda masukkan tidak valid.");
        }
    }
}
