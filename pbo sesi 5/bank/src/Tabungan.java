class Tabungan extends Rekening {
    double bungaTahunan;

    Tabungan(String nama, String noRek, double saldo, double bunga) {
        super(nama, noRek, saldo);
        this.bungaTahunan = bunga;
    }

    // Override tampilkanInfo
    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
    }

    // Hitung bunga
    double hitungBunga(int bulan) {
        return saldo * (bungaTahunan / 100) * bulan / 12;
    }
}