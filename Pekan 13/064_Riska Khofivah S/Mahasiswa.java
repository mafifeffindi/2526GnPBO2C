public class mahasiswa {

    String nama;
    String nim;
    String jurusan;

    public mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println();
    }

    public static void main(String[] args) {

        mahasiswa mhs1 = new mahasiswa("Sasi", "054", "Pendidikan Infrmatika");
        mahasiswa mhs2 = new mahasiswa("Anisa", "060", "Pendidikan Informatika");

        mhs1.tampilData();
        mhs2.tampilData();
    }
}
