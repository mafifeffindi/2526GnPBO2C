
public class Mahasiswa {

    String nama, nim, jurusan;

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println("Informasi Mahasiswa: ");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("");
    }

    public static void main(String[] args) {
        Mahasiswa mhs_1 = new Mahasiswa("M. Hamzah Fansuri", "250631100052", "Pendidikan Informatika");
        Mahasiswa mhs_2 = new Mahasiswa("Daniyarta Nuzulul Hidayah", "250631100073", "Pendidikan Informatika");

        mhs_1.tampilData();
        mhs_2.tampilData();
    }

}
