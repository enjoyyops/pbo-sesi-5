class Giro extends Rekening {
    double limitPenarikan;

    Giro(String nama, String noRek, double saldo, double limit) {
        super(nama, noRek, saldo);
        this.limitPenarikan = limit;
    }

    // Override tarik
    @Override
    void tarik(double jumlah) {
        if (jumlah <= saldo + limitPenarikan) {
            saldo -= jumlah;
            System.out.println("Penarikan giro berhasil: " + jumlah);
        } else {
            System.out.println("Melebihi limit giro!");
        }
    }
}