import java.util.Scanner;

public class barisAritmatika {
    public static void main(String[] args) {
        //Rumusnya adalah Sn = n/2 * (2a+(n-1)b)
        Scanner p = new Scanner(System.in);
        System.out.println("Masukkan nilai suku pertama: ");
        int a = p.nextInt();
        System.out.println("Masukkan nilai beda: ");
        int b = p.nextInt();
        System.out.println("Masukkan jumlah suku: ");
        int n = p.nextInt();
        int jumlah= (n/2 * (2*a+((n-1)*b)));
        System.out.println("Jumlah deret aritmatikanya adalah "+jumlah);




        
        Scanner w = new Scanner(System.in);
        System.out.println("Masukkan nilai suku pertama: ");
        int nilaiA = w.nextInt();
        System.out.println("Masukkan nilai beda: ");
        int nilaiB = w.nextInt();
        System.out.println("Masukkan jumlah suku: ");
        int sukuKeN = w.nextInt();

        int awal = 2;
        for (int i = 0; i <5; i+=3) {
            i=awal;
            awal+= 3;
            System.out.println(awal+" .");
        }
    }
}