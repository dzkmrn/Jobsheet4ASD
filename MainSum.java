import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan jumlah Perusahaan : ");
        int per = sc.nextInt();
        Sum peru[] = new Sum[per];
        for (int i=0; i<peru.length; i++){
            peru[i] = new Sum();
            System.out.println("============================================================");
            System.out.println("Perusahaan ke-"+(i+1));
            System.out.print("Masukkan jumlah bulan : ");
            peru[i].elemen = sc.nextInt();
            System.out.println("============================================================");
            peru[i].keuntungan = new double [peru[i].elemen];
            for (int j=0; j<peru[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke-"+(j+1)+" = ");
                peru[i].keuntungan[j] = sc.nextDouble();
            }
        } 
        System.out.println("============================================================");
        Sum dat = new Sum();
        for(int i=0; i<peru.length; i++){
            System.out.println("Perusahaan ke-"+(i+1));
            System.out.println("Jumlah Bulan : "+ peru[i].elemen);
            System.out.println("");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selama "+ peru[i].elemen  + " bulan adalah = %.2f ", dat.totalBF(peru[i].keuntungan));
            System.out.println("\n");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama "+ peru[i].elemen  + " bulan adalah = %.2f ", dat.totalDC(peru[i].keuntungan, 0, peru[i].elemen-1));
            System.out.println("\n============================================================");
        }
    }
}
