package main;

import java.util.Random;
import java.util.Scanner;

public class CsigaversenyJatek extends Jatek{
    
    public CsigaversenyJatek(){
        //start();
    }
    
    @Override
    void start(){
        Scanner be = new Scanner(System.in);
        Random rnd = new Random();
        int korSzama = 5;
        Csiga zoldCs = new Csiga();
        Csiga pirosCs = new Csiga();
        Csiga kekCs = new Csiga();
        
        String zold = "\u001B[32m";
        String piros = "\u001B[31m";
        String kek = "\u001B[34m";
        
        zoldCs.szin = zold;
        pirosCs.szin = piros;
        kekCs.szin = kek;

        System.out.println("A Csigaverseny elindult...");
        
        System.out.println("Kire fogadsz (z,k,p)?");
        String fogadas = be.nextLine();
        while(!"p".equals(fogadas) && !"z".equals(fogadas) && !"k".equals(fogadas)){
            System.out.println("Hibás fogadás! Kire fogadsz (z,k,p)?");
            fogadas = be.nextLine();
        }
        
        zoldCs.ennyit_ment = rnd.nextInt(4);
        pirosCs.ennyit_ment = rnd.nextInt(4);
        kekCs.ennyit_ment = rnd.nextInt(4);
        
        for (int i = 0; i < korSzama; i++) {
            zoldCs.ennyit_ment += rnd.nextInt(4);
            pirosCs.ennyit_ment += rnd.nextInt(4);
            kekCs.ennyit_ment += rnd.nextInt(4);
            
            System.out.println((i+1) + ". kör");
            if(rnd.nextInt(100) <= 20){
                zoldCs.ennyit_ment ++;
                System.out.println("A zöld csiga gyorsul egyet!");
            }
            else if(rnd.nextInt(100) <= 20){
                kekCs.ennyit_ment ++;
                System.out.println("A kék csiga gyorsul egyet!");
            }
            else if(rnd.nextInt(100) <= 20){
                pirosCs.ennyit_ment ++;
                System.out.println("A piros csiga gyorsul egyet!");
            }
            else{
                System.out.println("Egyik csiga sem gyorsult!");
            }
            
            
            zoldCs.megy();
            kekCs.megy();
            pirosCs.megy();
            
            
            System.out.println("Kör vége!");
            
        }
        if(zoldCs.ennyit_ment > pirosCs.ennyit_ment && zoldCs.ennyit_ment > kekCs.ennyit_ment){
            System.out.println("\u001B[32mA zöld csiga nyert!");
            if("z".equals(fogadas)){
                System.out.println("Jól fogadtál!");
            }
            else{
                System.out.println("Nem nyertél semmit");
            }
        }
        else if(pirosCs.ennyit_ment > zoldCs.ennyit_ment && pirosCs.ennyit_ment > kekCs.ennyit_ment){
            System.out.println("\u001B[31mA piros csiga nyert!");
            if("p".equals(fogadas)){
                System.out.println("Jól fogadtál!");
            }
            else{
                System.out.println("Nem nyertél semmit");
            }
        }
        else if(kekCs.ennyit_ment > zoldCs.ennyit_ment && kekCs.ennyit_ment > pirosCs.ennyit_ment ){
            System.out.println("\u001B[34mA kék csiga nyert!");
            if("k".equals(fogadas)){
                System.out.println("Jól fogadtál!");
            }
            else{
                System.out.println("Nem nyertél semmit");
            }
        }
        else{
            System.out.println("Döntetlen");
            System.out.println("A fogadásokat visszatérítjük");
        }
    }
    
}
