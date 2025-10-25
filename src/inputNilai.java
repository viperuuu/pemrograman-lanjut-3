public class inputNilai {
    int nilaiAkhir;

    public void setNilaiAkhir(int nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;

        for (int i = 0; i < 1; i++) {
            if (nilaiAkhir >= 75) {
                System.out.println("selamat anda lulus");
            } else {
                System.out.println("maaf anda tidak lulus");
            }
        }
    }
}
