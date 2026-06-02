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
                "Moh. Ali Wafi",
                "250631100074",
                "Pendidikn Informatika"
        );


        Mahasiswa mhs2 = new Mahasiswa(
                "Relrel",
                "25063110167",
                "Teknik Informatika"
        );
      
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
