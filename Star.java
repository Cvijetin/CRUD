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
         DisplayMenu();
    }
    public static void DisplayMenu() {
        Scanner ulaz = new Scanner(System.in);
        String READ_MENU;

       
        System.out.println("| Opcije:                              |");
        System.out.println("Za unos podataka unesite 1");
        System.out.println("Za pregled podataka unesite 2");
        System.out.println("Za promjenu podataka unesite 3");
        System.out.println("Za brisanje podataka unesite 4");
      

        System.out.print("Unesite broj opcije: ");

        READ_MENU = ulaz.next();

//display menu based on user selection
        switch (READ_MENU) {
            case "1":
                Create create = new Create();
                break;
             case "2":
                Read read = new Read();
                break;
            default:
                System.out.println("Invalid selection");
                break; 
        }
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
