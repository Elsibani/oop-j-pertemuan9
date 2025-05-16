package pertemuan901;

/**
 *
 * @author Elsinta
 * TGL: 16 Mei 2025
 */
public class mahasiswa {
    private String nim,jkel;
    protected String nama;   
    
    public void setNIM(String nval){
        this.nim = nval;
    }
    public void setJKEL(String nval){
    this.jkel = nval;
    }
      public String getNIM(){
        return this.nim;
    }
      public String getJKEL(){
          return this.jkel;
      }
}
