public class MahasiswaView {
  public void printDetailMahasiswa(String namaMahasiswa, String nimMahasiswa, String fakultasMahasiswa, String prodiMahasiswa) {
    System.out.println("|-----------------------------------------------|");
    System.out.println("| Detail Mahasiswa\t\t\t\t|");
    System.out.println("|-----------------------------------------------|");
    System.out.println("| NIM\t\t: " + nimMahasiswa + "\t\t|");
    System.out.println("| Nama\t\t: " + namaMahasiswa + "\t|");
    System.out.println("| Fakultas\t: " + fakultasMahasiswa + " |");
    System.out.println("| Program Studi\t: " + prodiMahasiswa  + "\t\t\t|");
    System.out.println("|-----------------------------------------------|");
  }
}
