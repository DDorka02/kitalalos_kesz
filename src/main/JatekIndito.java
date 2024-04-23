package main;

public class JatekIndito {
    
    public static void main(String[] args) {
        /* nincs referencia az objektumra: */
        //new Jatek().start();
        
        /* adunk referenciát az objektumra: */
        //Jatek referencia = new Jatek();
        /* a referencián keresztül elérjük az objektum tagfüggvényeit: */
        //referencia.start();
        
        /* nincs referencia, csak az objektum konstruktorát hívjuk: */
        //new KitalalosJatek();
        
        /* 3 játékos 1-1 tippel */
//        new Jatekos().tippel();
//        new Jatekos().tippel();
//        new Jatekos().tippel();
        
        /* 1 játékos tippel háromszor */
//        Jatekos jatekos1 = new Jatekos();
//        jatekos1.tippel();
//        jatekos1.tippel();
//        jatekos1.tippel();


        //new CsigaversenyJatek();
        Jatek kitalalos = new KitalalosJatek();
        Jatek csigas = new CsigaversenyJatek();
        
        Jatek[] jatekok = {kitalalos, csigas};
        
        /*Bekérhetnénk, hogy melyik játékot indítsunk*/
        for(Jatek jatek : jatekok){
            /* hibás tervezés, nincs közös metódus */
//            if(jatek instanceof KitalalosJatek){
//                ((KitalalosJatek)jatek).start();
//            }
//            else if (jatek instanceof CsigaversenyJatek){
//                ((CsigaversenyJatek)jatek).start();
//            }
            
            jatek.start();
        }
        
    }
}
