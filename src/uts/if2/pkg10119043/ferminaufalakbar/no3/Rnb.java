/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119043.ferminaufalakbar.no3;

/**
 *
 * @author FERMI
 */
public class Rnb extends MusicGenre implements Jazz, Blues{

    @Override
    public void genreJazz(String artistName) {
        System.out.print(artistName + "adalah musisi Blues");
    }

    @Override
    public void genreBlues(String artistName) {
        System.out.print(artistName + "adalah musisi Jazz");
    }
    
}
