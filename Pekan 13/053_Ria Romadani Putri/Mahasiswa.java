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
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println();
    }

    public static void main(String[] args) {

      
        Mahasiswa mhs1 = new Mahasiswa(
                "Ria Romadani Putri",
                "250631100053",
                "Pendidikan Informatika"
        );

        
        Mahasiswa mhs2 = new Mahasiswa(
                "Rassya Hidayah",
                "250631100052",
                "Teknik Informatika"
        );

        // Menampilkan data
        mhs1.tampilData();
        mhs2.tampilData();
    }
