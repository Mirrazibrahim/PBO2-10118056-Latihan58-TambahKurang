/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan58.tambahkurang;

/**
 *
 * @author 
 * Nama : Mirraz Ibrahim
 * Nim : 10118056
 * Kelas: IF-2
 */
public class PBO210118056Latihan58TambahKurang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JumlahBilangan jml = new JumlahBilangan();
        int hasiljml = jml.getX()+jml.getY();
        System.out.println("Hasil Penjumlahan : "+hasiljml);
        
        SelisihBilangan sls = new SelisihBilangan();
        int hasilsls = sls.getX()-sls.getY();
        System.out.println("Hasil Selisih "+sls.getX()+"-"+sls.getY()+" : " + hasilsls);
    }
    
}
