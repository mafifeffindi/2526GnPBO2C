package mahasiswa;

/**
 *
 * @author ASUS
 */
class Mahasiswa {

    // Atribut
    String nama;
    String nim;
    String jurusan;

    // Constructor
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data
    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Membuat object pertama
        Mahasiswa mhs1 = new Mahasiswa(
                "Ramadany",
                "250631100051",
                "Pendidikan Informatika"
        );

        // Membuat object kedua
        Mahasiswa mhs2 = new Mahasiswa(
                "Hamzah",
                "250631100052",
                "Pendidikan Informatika"
                        + " "
        );

        // Memanggil method tampilData()
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
