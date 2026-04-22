class Rekening {
    String namaPemilik;
    String nomorRekening;
    double saldo;

    // Constructor
    Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    // Method setor (overloading nanti ditambahkan)
    void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor berhasil: " + jumlah);
    }

    // Overloading setor
    void setor(double jumlah, boolean transfer) {
        if (transfer) {
            saldo += (jumlah - 2500);
            System.out.println("Setor transfer: " + jumlah + " (biaya admin 2500)");
        } else {
            setor(jumlah);
        }
    }

    // Method tarik
    void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    // Tampilkan info
    void tampilkanInfo() {
        System.out.println("Nama: " + namaPemilik);
        System.out.println("No Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }
}