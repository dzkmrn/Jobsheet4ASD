import java.util.Scanner;
public class TugasMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=======================================================");
            System.out.println("\t PEMILIHAN KETUA BEM KOTA MALANG");
            System.out.println("=======================================================");
            System.out.println("Kandidat BEM = 4 ");
            Tugas tgs = new Tugas();
            Tugas[] bem = new Tugas[tgs.jumlahKandidat];
            
            for(int i = 0; i < tgs.jumlahKandidat; i++) {
                bem[i] = new Tugas();
                System.out.println("Nama Kandidat BEM ke- " + (i+1) + ": ");
                bem[i].kandidat = sc.nextLine();
            }
            for (int i = 0; i < tgs.jumlahKandidat; i++) {
                System.out.println("Jumlah Pemilih Suara Kandidat BEM ke = " + (i+1) + ": ");
                bem[i].vote = sc.nextInt();
                tgs.jumlahVote += bem[i].vote;
            }
            System.out.println("=======================================================");
            int hasil_bem = tgs.hitungHasil(tgs.jumlahVote, bem[0].vote, bem[1].vote, bem[2].vote, bem[3].vote);
            if(hasil_bem == 0) {
                System.out.println("Kandidat memiliki mayoritas hampir sama");
            }else{
                System.out.println("Ketua BEM Kota Malang Adalah " + bem[hasil_bem-1].kandidat);
            }
        }
    }
    
