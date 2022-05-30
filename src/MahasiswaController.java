public class MahasiswaController {
  private Mahasiswa model;
  private MahasiswaView view;

  public MahasiswaController(Mahasiswa model, MahasiswaView view) {
    this.model = model;
    this.view = view;
  }

  public void setNamaMahasiswa(String nama) {
    model.setNama(nama);
  }

  public String getNamaMahasiswa() {
    return model.getNama();
  }

  public void setNimMahasiswa(String id) {
    model.setNim(id);
  }

  public String getNimMahasiswa() {
    return model.getNim();
  }

  public void setFakultasMahasiswa(String fakultas) {
    model.setFakultas(fakultas);
  }

  public String getFakultasMahasiswa() {
    return model.getFakultas();
  }

  public void setProdiMahasiswa(String prodi) {
    model.setProdi(prodi);
  }

  public String getProdiMahasiswa() {
    return model.getProdi();
  }

  public void updateView() {
    view.printDetailMahasiswa(model.getNama(), model.getNim(), model.getFakultas(), model.getProdi());
  }
}
