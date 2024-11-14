public class pesawat {
    private int nomorpenerbangan;
    private String tujuan;
    private int waktukeberangkatan;
    private boolean ditunda;

    public pesawat(int nomorpenerbangan, String tujuan, int waktukeberangkatan) {
        this.nomorpenerbangan = nomorpenerbangan;
        this.tujuan = tujuan;
        this.waktukeberangkatan = waktukeberangkatan;
        this.ditunda = false;
    }

    public int getNomorpenerbangan() {
        return nomorpenerbangan;
    }

    public void setNomorpenerbangan(int nomorpenerbangan) {
        this.nomorpenerbangan = nomorpenerbangan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getWaktupenerbangan() {
        return waktukeberangkatan;
    }

    public void getWaktukeberangkatan(int waktukeberangkatan) {
        this.waktukeberangkatan = waktukeberangkatan;
    }

    public String cekStatus() {
        if (ditunda) {
            return ("penerbangan " + nomorpenerbangan + "ke" + tujuan + "sesuai jadwal");
        } else {
            return ("penerbangan" + nomorpenerbangan + "ke" + tujuan + "tdk sesuai jadwal");
        }
    }

    public void tundaPenerbangan(int menit) {
        waktukeberangkatan = waktukeberangkatan;
        ditunda = true;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Penerbangan: " + nomorpenerbangan);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Waktu Keberangkatan: " + waktukeberangkatan);
        System.out.println(cekStatus());
    }
}
