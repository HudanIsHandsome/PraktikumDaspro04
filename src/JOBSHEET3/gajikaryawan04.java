package JOBSHEET3;
import java.util.Scanner;
class gajikaryawan04 {
    public static void main(String[] args) {
        Scanner arga = new Scanner(System.in);

        int gajipokok;
        double bonus,totGaji;
        double tunjTransp=600000;
        double tunJmkn=400000;

        System.out.println("Masukkan Gaji Pokok =");
        gajipokok=arga.nextInt();
        bonus=(gajipokok*0.05);
        totGaji= gajipokok+ tunjTransp+ tunJmkn+ bonus-(gajipokok*0.1);
        System.out.println("Bonus Bulanan Anda adalah RP" + bonus);
        System.out.println("gaji Yang Anda Terima Adalah RP" + (int) totGaji );

        arga.close();



        
    }

    
}