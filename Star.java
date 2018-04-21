/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import static java.time.temporal.TemporalAdjusters.next;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Cvijetin
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       List<Vijesti> vijesti = new ArrayList<>();
        Scanner ulaz = new Scanner(System.in);
        Vijesti v;
        Kategorija k;
        Autor a;
        
        for (;;){
            v = new Vijesti();
            System.out.println("Unesite novu vijest");
            System.out.println("Unesite naslov vijesti");
            v.setNaslov(ucitajTest(ulaz));
            System.out.println("Unesite sadržaj vijesti");
            v.setSadrzaj(ucitajTest(ulaz));
            
            v.setKategorija(new ArrayList<>());           
            while (true){
                System.out.println("Unos kategorije");
                k = new Kategorija();
                System.out.println("Unesi naziv kategorije");
                k.setNaziv(ucitajTest(ulaz));              
                v.getKategorija().add(k);
                System.out.println("Za prekid unosa kategorija unesite ne");
                if (ulaz.nextLine().equalsIgnoreCase("Ne")) {
                    break;
                } 
                vijesti.add(v);
            }
            v.setAutor(new ArrayList<>());
            while (true){
            a = new Autor();
            System.out.println("Unesite ime autora");
            a.setIme(ucitajTest(ulaz));
            System.out.println("Unesite prezime autora");
            a.setPrezime(ucitajTest(ulaz));
            System.out.println("Unesite OIB autora");
            a.setOib(ucitajTest(ulaz));
            v.getAutor().add(a);
            System.out.println("Za prekid unosa autora unesite ne");
                if (ulaz.nextLine().equalsIgnoreCase("Ne")) {
                    break;
                }vijesti.add(v);
            }
            
            System.out.println("Za prekid unosa vijesti unesite ne");
            if (ulaz.nextLine().equalsIgnoreCase("Ne")) {
                break;
            }
            
        }  
        
        Map<Kategorija, Integer> s = new HashMap<>();
        Integer i;
        for (Vijesti news : vijesti) {
            for (Kategorija kk : news.getKategorija()) {
                if(s.containsKey(kk)){
                    i=s.get(kk);
                    s.put(kk, ++i);
                    }else{
                    s.put(kk, 1);
                }
            }
            
        }
        
         Map<Autor, Integer> o = new HashMap<>();
        Integer t;
        for (Vijesti news : vijesti) {
            for (Autor oo : news.getAutor()) {
                if(s.containsKey(oo)){
                    t=s.get(oo);
                    o.put(oo, ++t);
                    }else{
                    o.put(oo, 1);
                }
            }
            
        }
        
        
         Iterator<Kategorija> it = s.keySet().iterator();
         Iterator<Autor> io = o.keySet().iterator();
         
         
        while(it.hasNext()){
            Kategorija next = it.next();
            if(s.get(next)>=0){
                System.out.println(next.getNaziv()+  "  " + v.getNaslov() + " " + v.getSadrzaj() + " " + a.getIme() + " " + s.get(next) );
            }
        }
        //Iterator<Autor> io = o.keySet().iterator();
        //while(it.hasNext()){
          //  Autor nexti = io.next();
            //if(o.get(nexti)>1){
              //  System.out.println(nexti.getIme()+  "  " + nexti.getPrezime() + o.get(nexti) );
           // }
        //}
        //System.out.println(v.getSadrzaj() + " " + k.getNaziv() + " " + a.getIme() + " " + a.getPrezime() + " " + v.getNaslov() + " " + a.getOib());
        
    }
    private static String ucitajTest(Scanner ulaz){
        String s;
        do{
            s=ulaz.nextLine();
            if(s.trim().length()==0){
                System.out.println("Obavezan unos");
                continue;
               
            } return s;
        }while(true);
       
        
    }
    
}
