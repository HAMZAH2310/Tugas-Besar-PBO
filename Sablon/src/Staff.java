public class Staff {
    private String nama;
    private String alamat;
    private int umur;

    public Staff(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
