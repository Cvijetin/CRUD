/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.List;

/**
 *
 * @author Cvijetin
 */
public class Vijesti {
    private String naslov;
    private String sadrzaj;
    private List<Kategorija>kategorija;
    private List<Autor> autor;

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public List<Kategorija> getKategorija() {
        return kategorija;
    }

    public void setKategorija(List<Kategorija> kategorija) {
        this.kategorija = kategorija;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }
    
}
