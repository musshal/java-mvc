public class App {
    public static void main(String[] args) {
      Mahasiswa model = retriveMahasiswaFromDb();
      MahasiswaView view = new MahasiswaView();
      MahasiswaController controller = new MahasiswaController(model, view);

      controller.updateView();
    }

    private static Mahasiswa retriveMahasiswaFromDb() {
      Mahasiswa Mahasiswa = new Mahasiswa();
      Mahasiswa.setNim("24060118120042");
      Mahasiswa.setNama("Musthafa Kamal Faishal");
      Mahasiswa.setFakultas("Fakultas Sains dan Matematika");
      Mahasiswa.setProdi("Informatika");
      
      return Mahasiswa;
    }
}
