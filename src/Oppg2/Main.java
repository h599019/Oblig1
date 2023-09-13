package Oppg2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static Oppg2.Kjonn.*;


public class Main {
    public static void main(String[] args){

        List<Ansatt> ansatte = new ArrayList<>();

        ansatte.add(new Ansatt("Bob","Bob",MANN,"Macern",200000 ));
        ansatte.add(new Ansatt("BkBob","BkBob",MANN,"BK",220000 ));
        ansatte.add(new Ansatt("Bobine","Bobine",KVINNE,"Macern",100000 ));
        ansatte.add(new Ansatt("BkBobine","BkBobine",KVINNE,"BK",120000 ));
        ansatte.add(new Ansatt("Patrik","Hætta",PATRIK,"AA",999999 ));

        //Skriver ut alle oppretett ansatte
        System.out.println();
        System.out.println("Ansatte:");
        skrivUtAlle(ansatte);

        //Fast kronetilleg
        System.out.println();
        System.out.println("Kronetilleg på 5kr:");
        lonnsoppgjor(ansatte, x->x.getAarsloon()+5);
        skrivUtAlle(ansatte);

        //Fast prosenttilleg
        System.out.println();
        System.out.println("Prosenttilleg på 1%:");
        lonnsoppgjor(ansatte, x-> (int) (x.getAarsloon()*1.01));
        skrivUtAlle(ansatte);

        //Fast kronetilleg ved lav lønn
        System.out.println();
        System.out.println("Lavlønntilleg ved lav lønn på 10kr:");
        lonnsoppgjor(ansatte, x->x.getAarsloon()<200000?x.getAarsloon()+10: x.getAarsloon());
        skrivUtAlle(ansatte);

        //Fast prosenttilleg mann
        System.out.println();
        System.out.println("Prosenttilleg til menn på 10%:");
        lonnsoppgjor(ansatte, x-> x.getKjonn()==MANN? (int) (x.getAarsloon() * 1.1) :x.getAarsloon());
        skrivUtAlle(ansatte);

        //Patriktilleg
        System.out.println();
        System.out.println("Patriktilleg på 100%:");
        lonnsoppgjor(ansatte, x-> x.getKjonn()==PATRIK? (x.getAarsloon() * 2) :x.getAarsloon());
        skrivUtAlle(ansatte);
    }

    //Skrive ut alle annsatte fra listen
    private static void skrivUtAlle(List<Ansatt> ansatte) {
        for(Ansatt ansatt:ansatte){ //for-loop som går gjennom hele liten
            System.out.println(ansatt);
        }
    }

    //Endre lønn på ansatte
    private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> operator ){
        for (Ansatt ansatt:ansatte){
            int nyLoon=operator.apply(ansatt); //Bergegner operator (f.eks getAnsattlonn*2(2000*2 i dette oppg))
            ansatt.setAarsloon(nyLoon);
        }


    }
}
