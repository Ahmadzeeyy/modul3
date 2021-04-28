import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String lanjut = "Y";
        while(lanjut.equals("Y")){
            Scanner input = new Scanner(System.in);
            System.out.println("|===========================|");
            System.out.println("|        INPUT DATA         |");
            System.out.println("|===========================|");
            System.out.println("  "); 
            System.out.print("UNIVERSITAS  : "); dataM.univ = input.nextLine();
            System.out.print("NIM          : "); dataM.NIM = input.nextLine();
            System.out.print("NAMA         : "); dataM.Nama = input.nextLine();
            System.out.print("ALAMAT       : "); dataM.Alamat = input.nextLine();
            System.out.println("DAFTAR KODE JURUSAN :");
            System.out.println(" MATEMATIKA          [61]");
            System.out.println(" BIOLOGI             [62]");
            System.out.println(" KIMIA               [63]");
            System.out.println(" FISIKA              [64]");
            System.out.println(" TEKNIK INFORMATIKA  [65]");
            System.out.println(" SISTEM INFORMASI    [66]");
            System.out.print("KODE JURUSAN : "); dataM.Jurusan = input.nextLine();
            System.out.println("  ");
            
            System.out.println("|===========================|");
            System.out.println("|       DATA MAHASISWA      |");
            System.out.println("|===========================|");
            System.out.println("UNIVERSITAS : " + dataM.getUniv());
            System.out.println("NIM         : " + dataU.getNIM());
            System.out.println("NAMA        : " + dataU.getNama());
            System.out.println("ALAMAT      : " + dataM.getAlamat());
            switch (dataM.getJurusan()) {
                case "61":
                    System.out.println("JURUSAN     : MATEMATIKA");
                    break;
                case "62":
                    System.out.println("JURUSAN     : BIOLOGI");
                    break;
                case "63":
                    System.out.println("JURUSAN     : KIMIA");
                    break;
                case "64":
                    System.out.println("JURUSAN     : FISIKA");
                    break;
                case "65":
                    System.out.println("JURUSAN     : TEKNIK INFORMATIKA");
                    break;
                case "66":
                    System.out.println("JURUSAN     : SISTEM INFORMASI");
                    break;
                default :
                    System.out.println("KODE JURUSAN TIDAK VALID");
            }
            System.out.println("  ");
            
            System.out.println("APAKAH ANDA INGIN MEMASUKKAN DATA LAGI ?");
            System.out.println("1. IYA   [Y] \n2. TIDAK [T]");
            System.out.print("PILIHAN : ");
            lanjut = input.nextLine();
        }
        System.out.println("|===========================|");
        System.out.println("|------  THANK YOU :) ------|");
        System.out.println("|===========================|");
        
    }
    
}

