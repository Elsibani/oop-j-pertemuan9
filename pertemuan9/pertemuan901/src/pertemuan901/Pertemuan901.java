package pertemuan901;

/**
 *
 * @author elsinta
 * TGL: 16 MEI 2025
 */
public class Pertemuan901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mhsturunan elsi = new mhsturunan();
        elsi.setNIM("2301010407");
        elsi.setJKEL("P");
        elsi.setNAMA("Elsinta Bani");
        
        System.out.println("Data Mahasiswa");
        System.out.printf("Nama : %s\n",elsi.nama);
        System.out.printf("NIM : %s\n",elsi.getNIM() );
        System.out.printf("Jenis kelamin : %s\n",elsi.getJKEL() );
               
    }
    
}

