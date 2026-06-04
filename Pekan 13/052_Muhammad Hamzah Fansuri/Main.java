
class Siswa{
    String asal_sekolah, jurusan;
}


class Mahasiswa extends Siswa{

    String nama, nim, prodi;

    Mahasiswa(String nama, String nim, String prodi, String asal_sekolah, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        
        this.asal_sekolah = asal_sekolah;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.println("Informasi Mahasiswa: ");
        System.out.println("Nama         : " + nama);
        System.out.println("NIM          : " + nim);
        System.out.println("Prodi        : " + prodi);
        System.out.println("Asal Sekolah : " + asal_sekolah);
        System.out.println("Jurusan      : " + jurusan);
        System.out.println();
    }

 
}


public class Main {
      public static void main(String[] args) {
        Mahasiswa mhs_1 = new Mahasiswa("M. Hamzah Fansuri",
                "250631100052", "Pendidikan Informatika", 
                "SMKN 1 Blega", "RPL");
        
        Mahasiswa mhs_2 = new Mahasiswa("Daniyarta Nuzulul Hidayah",
                "250631100073", "Pendidikan Informatika", 
                "SMKN 2 Bangkalan", "TKJ");

        mhs_1.tampilData();
        mhs_2.tampilData();
    }
 
}
