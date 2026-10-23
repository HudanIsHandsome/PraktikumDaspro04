package JOBSHEET5;
import java.util.Scanner;

public class tugas1pemilihan04{
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("====CETAK KRS SIAKAD====");
     System.out.println("APAKAH UKT SUDAH LUNAS?(TRUE / FALSE):");
     boolean ukt_lunas=sc.nextBoolean();
     String pesan=ukt_lunas ?"Silahkan Cetak KRS Dan Meminta TTD DPA.":"Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
     if (ukt_lunas) {
      System.out.println("===PEMBAYARAN UKT TELAH LUNAS===");
      System.out.println("Silahkan Cetak KRS Dan Meminta TTD DPA.");
      }else{
      System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
      }
    }