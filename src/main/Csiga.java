package main;

public class Csiga {
    public Csiga(){
        
    }
    
    int ennyit_ment;
    String szin;
    
    void megy(){
        String palya = "_";
        System.out.printf("%s"+szin+"@\u001B[0m\n", palya.repeat(ennyit_ment));
    }
}
