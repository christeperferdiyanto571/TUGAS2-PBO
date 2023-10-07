import java.util.Scanner;

class Karyawan {
    private String nama;
    private int gajiTetap;

    public Karyawan(String nama, int gajiTetap) {
        this.nama = nama;
        this.gajiTetap = gajiTetap;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiTetap() {
        return gajiTetap;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiTetap(int gajiTetap) {
        this.gajiTetap = gajiTetap;
    }
}

class KaryawanEdukatif extends Karyawan {
    private String NIDN;
    private int honorMengajar;
    private int tunjangan;

    public KaryawanEdukatif(String nama, int gajiTetap, String NIDN, int honorMengajar, int tunjangan) {
        super(nama, gajiTetap);
        this.NIDN = NIDN;
        this.honorMengajar = honorMengajar;
        this.tunjangan = tunjangan;
    }

    public String getNIDN() {
        return NIDN;
    }

    public int getHonorMengajar() {
        return honorMengajar;
    }

    public int getTunjangan() {
        return tunjangan;
    }
}

class KaryawanNonEdukatif extends Karyawan {
    private String NIK;
    private int honorKehadiran;
    private int uangLembur;

    public KaryawanNonEdukatif(String nama, int gajiTetap, String NIK, int honorKehadiran, int uangLembur) {
        super(nama, gajiTetap);
        this.NIK = NIK;
        this.honorKehadiran = honorKehadiran;
        this.uangLembur = uangLembur;
    }

    public String getNIK() {
        return NIK;
    }

    public int getHonorKehadiran() {
        return honorKehadiran;
    }

    public int getUangLembur() {
        return uangLembur;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objek 1: KaryawanEdukatif
        System.out.println("Masukkan data untuk Objek 1 (KaryawanEdukatif)");
        System.out.print("Nama: ");
        String nama1 = scanner.nextLine();
        System.out.print("Gaji Tetap: ");
        int gajiTetap1 = scanner.nextInt();
        System.out.print("NIDN: ");
        scanner.nextLine(); // Membersihkan newline
        String NIDN1 = scanner.nextLine();
        System.out.print("Honor Mengajar: ");
        int honorMengajar1 = scanner.nextInt();
        System.out.print("Tunjangan: ");
        int tunjangan1 = scanner.nextInt();
        KaryawanEdukatif karyawan1 = new KaryawanEdukatif(nama1, gajiTetap1, NIDN1, honorMengajar1, tunjangan1);

        // Objek 2: KaryawanNonEdukatif
        System.out.println("Masukkan data untuk Objek 2 (KaryawanNonEdukatif)");
        System.out.print("Nama: ");
        scanner.nextLine(); // Membersihkan newline
        String nama2 = scanner.nextLine();
        System.out.print("Gaji Tetap: ");
        int gajiTetap2 = scanner.nextInt();
        System.out.print("NIK: ");
        scanner.nextLine(); // Membersihkan newline
        String NIK2 = scanner.nextLine();
        System.out.print("Honor Kehadiran: ");
        int honorKehadiran2 = scanner.nextInt();
        System.out.print("Uang Lembur: ");
        int uangLembur2 = scanner.nextInt();
        KaryawanNonEdukatif karyawan2 = new KaryawanNonEdukatif(nama2, gajiTetap2, NIK2, honorKehadiran2, uangLembur2);

        // Objek 3: KaryawanNonEdukatif
        System.out.println("Masukkan data untuk Objek 3 (KaryawanNonEdukatif)");
        System.out.print("Nama: ");
        scanner.nextLine(); // Membersihkan newline
        String nama3 = scanner.nextLine();
        System.out.print("Gaji Tetap: ");
        int gajiTetap3 = scanner.nextInt();
        System.out.print("NIK: ");
        scanner.nextLine(); // Membersihkan newline
        String NIK3 = scanner.nextLine();
        System.out.print("Honor Kehadiran: ");
        int honorKehadiran3 = scanner.nextInt();
        KaryawanNonEdukatif karyawan3 = new KaryawanNonEdukatif(nama3, gajiTetap3, NIK3, honorKehadiran3, 0);

        // Objek 4: KaryawanEdukatif
        System.out.println("Masukkan data untuk Objek 4 (KaryawanEdukatif)");
        System.out.print("Nama: ");
        scanner.nextLine(); // Membersihkan newline
        String nama4 = scanner.nextLine();
        System.out.print("Gaji Tetap: ");
        int gajiTetap4 = scanner.nextInt();
        System.out.print("NIDN: ");
        scanner.nextLine(); // Membersihkan newline
        String NIDN4 = scanner.nextLine();
        System.out.print("Honor Mengajar: ");
        int honorMengajar4 = scanner.nextInt();
        KaryawanEdukatif karyawan4 = new KaryawanEdukatif(nama4, gajiTetap4, NIDN4, honorMengajar4, 0);

        scanner.close();

        // Tampilkan informasi objek
        System.out.println("Informasi Objek 1 (KaryawanEdukatif)");
        System.out.println("Nama: " + karyawan1.getNama());
        System.out.println("Total Gaji: " + (karyawan1.getGajiTetap() + karyawan1.getHonorMengajar() + karyawan1.getTunjangan()));
        System.out.println();

        System.out.println("Informasi Objek 2 (KaryawanNonEdukatif)");
        System.out.println("Nama: " + karyawan2.getNama());
        System.out.println("Total Gaji: " + (karyawan2.getGajiTetap() + karyawan2.getHonorKehadiran() + karyawan2.getUangLembur()));
        System.out.println();

        System.out.println("Informasi Objek 3 (KaryawanNonEdukatif)");
        System.out.println("Nama: " + karyawan3.getNama());
        System.out.println("Total Gaji: " + (karyawan3.getGajiTetap() + karyawan3.getHonorKehadiran()));
        System.out.println();

        System.out.println("Informasi Objek 4 (KaryawanEdukatif)");
        System.out.println("Nama: " + karyawan4.getNama());
        System.out.println("Total Gaji: " + (karyawan4.getGajiTetap() + karyawan4.getHonorMengajar()));
    }
}
