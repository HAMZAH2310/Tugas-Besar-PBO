public class PesananSablon extends Sablon implements Urutkan {
    private int[] hargaSablon = {40000, 23000, 11000, 33000, 22000, 38000, 45000};
    private String jenisSablon;
    private int jumlahPesanan;
    private boolean selesai;


    // Implementasi dari interface Urutan menggunakan InsertionSort
    public void urut(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public void tampilkanDaftarSablon() {
        System.out.println("===================================================================");
        System.out.println("                         Pemesanan Sablon                          ");
        System.out.println("===================================================================");
        System.out.println();
        System.out.println("                         Jenis Sablon                              ");
        System.out.println("===================================================================");
        System.out.println("                   [1]. Sablon Glow In The Dark = 40000            ");
        System.out.println("                   [2]. Sablon Pigmen           = 23000            ");
        System.out.println("                   [3]. Sablon Rubber           = 11000            ");
        System.out.println("                   [4]. Sablon Glitter          = 33000            ");
        System.out.println("                   [5]. Sablon Flocking         = 22000            ");
        System.out.println("                   [6]. Sablon DTG              = 38000            ");
        System.out.println("                   [7]. Sablon Super White      = 45000            ");
        System.out.println("===================================================================");
        System.out.println();
        System.out.println();
    }

    public void urutHargaSablon() {
        // Memanggil metode urut dari Urutan interface untuk mengurutkan harga sablon
        urut(hargaSablon);
    }

    public int[] dapatkanHargaSablon() {
        return hargaSablon;
    }


        public String getJenisSablon() {
            return jenisSablon;
        }

        public void setJenisSablon(String jenisSablon) {
            this.jenisSablon = jenisSablon;
        }

        public int getJumlahPesanan() {
            return jumlahPesanan;
        }

        public void setJumlahPesanan(int jumlahPesanan) {
            this.jumlahPesanan = jumlahPesanan;
        }

        public boolean isSelesai() {
            return selesai;
        }

        public void setSelesai(boolean selesai) {
            this.selesai = selesai;
        }
}

