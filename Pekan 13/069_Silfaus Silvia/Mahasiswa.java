public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method tampilData()
    public void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println();
    }
}

 class main {
    public static void main (String[] args) {

        // Membuat object mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Silfaus Silvia", "250631100069", "Pendidikan Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Ria Romadani Putri", "250631100053", "Pendidikan Informatika");

        // Menampilkan data mahasiswa
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
