/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119043.ferminaufalakbar.no3;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program Lagu
 */
public class UTSIF210119043FERMINAUFALAKBARNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rnb rnb = new Rnb();
        MusicGenre musicgenre = new MusicGenre();
        rnb.setArtistName("Jimmy Hendriks");
        rnb.genreBlues(rnb.getArtistName());
    }
    
}
