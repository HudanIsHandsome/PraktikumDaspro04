package JOBSHEET5;
import java.util.Scanner;

public class tugasparkir04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lama_parkir,biaya_awal=2000,biaya_tambahan=1000;
        System.out.println("LAMA PARKIR :");
        lama_parkir=sc.nextInt();
        if (lama_parkir<=2){
            System.out.println(biaya_awal);
        }else{
            System.out.println("TOTAL BIAYA PARKIR ADALAH"+ (biaya_tambahan*(lama_parkir-2)+biaya_awal));

        }
    }
}