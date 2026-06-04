import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        
    }

    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("<------Input Mahasiswa 1------>");
        System.out.print("Nama     : ");
        String nama1 = input.nextLine();
        System.out.print("NIM      : ");
        String nim1 = input.nextLine();
        System.out.print("Jurusan  : ");
        String jurusan1 = input.nextLine();

        System.out.println("<\n------Input Mahasiswa 2------>");
        System.out.print("Nama     : ");
        String nama2 = input.nextLine();
        System.out.print("NIM      : ");
        String nim2 = input.nextLine();
        System.out.print("Jurusan  : ");
        String jurusan2 = input.nextLine();

        Mahasiswa mhs1 = new Mahasiswa(nama1, nim1, jurusan1);
        Mahasiswa mhs2 = new Mahasiswa(nama2, nim2, jurusan2);

        System.out.println("\n=========================");
        System.out.println("    Data Mahasiswa");
        System.out.println("=========================");
        mhs1.tampilData();
        mhs2.tampilData();

        input.close();
    }
}
