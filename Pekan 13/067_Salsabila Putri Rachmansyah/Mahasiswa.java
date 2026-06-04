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
        System.out.println();
    }

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa(
                "Salsabila Putri Rachmansyah",
                "230067",
                "Pendidikan Informatika"
        );

        Mahasiswa mhs2 = new Mahasiswa(
                "Mastufah",
                "230018",
                "Sistem Informasi"
        );

        mhs1.tampilData();
        mhs2.tampilData();
    }
}
