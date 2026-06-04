public class Mahasiswa {

    String nama;
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println("=================================");
        System.out.println("       DATA MAHASISWA");
        System.out.println("=================================");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("=================================\n");
    }

    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa(
                "Amirotul Subaidah",
                "250631100057",
                "Pendidikan Informatika");

        Mahasiswa mahasiswa2 = new Mahasiswa(
                "Mohammad Zulfikar Riski",
                "250111100181",
                "Ilmu Hukum");

        mahasiswa1.tampilData();
        mahasiswa2.tampilData();
    }
} 

