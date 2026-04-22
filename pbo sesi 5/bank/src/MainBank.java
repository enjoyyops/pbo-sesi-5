import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {

        // Membuat objek
        Tabungan t1 = new Tabungan("Yopi", "001", 5000000, 5);
        Giro g1 = new Giro("Budi", "002", 3000000, 2000000);
        Deposito d1 = new Deposito("Siti", "003", 10000000, 12, 6);

        // Transaksi
        t1.setor(1000000);
        t1.setor(500000, true);
        t1.tarik(200000);

        g1.tarik(4000000);

        double bungaTabungan = t1.hitungBunga(6);
        System.out.println("Bunga Tabungan 6 bulan: " + bungaTabungan);

        double bungaDeposito = d1.hitungBunga();
        System.out.println("Bunga Deposito: " + bungaDeposito);

        d1.tarik(1000000);

        // ArrayList (Polimorfisme)
        ArrayList<Rekening> daftar = new ArrayList<>();
        daftar.add(t1);
        daftar.add(g1);
        daftar.add(d1);

        System.out.println("\n=== DATA REKENING ===");
        for (Rekening r : daftar) {
            r.tampilkanInfo();
            System.out.println("------------------");
        }

        // Cari saldo tertinggi & terendah
        Rekening max = daftar.get(0);
        Rekening min = daftar.get(0);

        for (Rekening r : daftar) {
            if (r.saldo > max.saldo) {
                max = r;
            }
            if (r.saldo < min.saldo) {
                min = r;
            }
        }

        System.out.println("Saldo Tertinggi: " + max.namaPemilik + " = " + max.saldo);
        System.out.println("Saldo Terendah: " + min.namaPemilik + " = " + min.saldo);
    }
}