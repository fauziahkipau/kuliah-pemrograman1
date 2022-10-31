// UTS Pemrograman 1 - Risky Fauziah
import javax.swing.JOptionPane;
public class Biodata {
    public static void main( String[] args ){ 
        String nama = "";
        nama = JOptionPane.showInputDialog("Ketik nama anda: ");
        String msg = "Nama: "+ nama 
        + "\nKelas: 04TPLE002"
        + "\nAlamat: Jl. H. Jaeran, Cinere, Depok"
        + "\nNo. Tlp: 082123053690"
        + "\nEmail: riskyfauziah5@gmail.com"
        + "\nProdi: TI"
        + "\nSemester: 10";
        JOptionPane.showMessageDialog(null, msg);
    }
}