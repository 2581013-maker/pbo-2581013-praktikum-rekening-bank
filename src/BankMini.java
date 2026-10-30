import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        Rekening rekening = new Rekening("001", "Ani", 100000);
        Scanner in = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n1. Setor  2. Tarik  3. Info  0. Keluar");
            System.out.print("Pilih: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Jumlah setor: ");
                    int s = in.nextInt();
                    System.out.println(rekening.setor(s) ? "Setor berhasil" : "Setor ditolak");
                    break;
                case 2:
                    System.out.print("Jumlah tarik: ");
                    int t = in.nextInt();
                    System.out.println(rekening.tarik(t) ? "Tarik berhasil" : "Tarik ditolak");
                    break;
                case 3:
                    rekening.cetakInfo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Menu tidak dikenal");
            }
        } while (pilihan != 0);

        System.out.println("Saldo akhir:");
        rekening.cetakInfo();
// rekening.saldo = 1000000;
// Error: 'saldo' has private access in 'Rekening'
        // rekening.saldo = 1000000;
        // Pesan error: saldo has private access in Rekening
    }
}
