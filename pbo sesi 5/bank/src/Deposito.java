class Deposito extends Rekening {
    int jangkaWaktuBulan;
    double sukuBunga;

    Deposito(String nama, String noRek, double saldo, int waktu, double bunga) {
        super(nama, noRek, saldo);
        this.jangkaWaktuBulan = waktu;
        this.sukuBunga = bunga;
    }

    // Hitung bunga
    double hitungBunga() {
        return saldo * (sukuBunga / 100) * jangkaWaktuBulan / 12;
    }

    // Override tarik
    @Override
    void tarik(double jumlah) {
        double denda = saldo * 0.10;
        saldo -= (jumlah + denda);
        System.out.println("Penarikan deposito sebelum jatuh tempo!");
        System.out.println("Denda: " + denda);
    }
}