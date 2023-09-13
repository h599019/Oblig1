package Oppg3;

import Oppg2.Ansatt;
import static Oppg2.Kjonn.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){

        List<Ansatt> ansatte = new ArrayList<>();

        ansatte.add(new Ansatt("Bob","Bob",MANN,"Macern",200000 ));
        ansatte.add(new Ansatt("BkBob","BkBob",MANN,"BK",220000 ));
        ansatte.add(new Ansatt("Bobine","Bobine",KVINNE,"Macern",100000 ));
        ansatte.add(new Ansatt("BkBobine","BkBobine",KVINNE,"BK",120000 ));
        ansatte.add(new Ansatt("Patrik","Hætta",PATRIK,"AA",999999 ));

        //Liste med kun etternavn
        System.out.println();
        System.out.println("Liste med kun etternavn:");
        ansatte.stream() //fra ansatte
                .map(Ansatt::getEtternavn) //velger etternavn
                .forEach(System.out::println); //Skriver ut alle som stiller krav


        //Antall kvinner
        long antallKvinner = ansatte.stream() //fra ansatte
                .filter(x ->x.getKjonn() == KVINNE) // hvor kjønn=kvinne
                .count(); //teller antall kvinner
        System.out.println();
        System.out.println("Antall kvinner:");
        System.out.println(antallKvinner);

        //Gjennomsnittslønnen til kvinnene
        double gjennomsntitsLoonnK = ansatte.stream() //fra ansatte
                .filter(x ->x.getKjonn() == KVINNE) // hvor kjønn=kvinne
                .mapToInt(Ansatt::getAarsloon) //velger årslønn
                .average() // gir gjenomsnitt
                .orElse(0.0); // om ikke mulig 0.0
        System.out.println();
        System.out.println("Gjennomsnittslønnen til kvinnene:");
        System.out.println(gjennomsntitsLoonnK);

        //Lønnsøkning til "sjef" på 7%
        ansatte.stream() // fra ansatte
                .filter(x->x.getStilling()=="AA") //hvor stilling = AA
                .forEach(x->x.setAarsloon((int) (x.getAarsloon()*1.7))); //setter ny årslønn
        System.out.println();
        System.out.println("Lønnsøkning til sjef på 7%:");
        ansatte.stream() // fra ansatte
                .filter(x->x.getStilling()=="AA") //hvor stilling = AA
                .forEach(System.out::println); //Skriver ut alle som stiller krav

        //Tjener mer enn 800.000
        boolean merEnn = ansatte.stream() //fra ansatte
                .anyMatch(x->x.getAarsloon()>800000); //sjekker om noen tilfredstiller krav
        System.out.println();
        System.out.println("Noen tjener mer enn 800.000:");
        System.out.println(merEnn);

        //Alle ansatte uten for løkke
        System.out.println();
        System.out.println("Alle ansatte uten for løkke:");
        ansatte.forEach(System.out::println); //Skriver ut alle ansatte

        //Ansatte med laveste lønn
        System.out.println();
        System.out.println("Ansatte med laveste lønn:");
        ansatte.stream() //fra ansatte
                .min(Comparator.comparingInt(Ansatt::getAarsloon)).stream() // bruker comperator til å streame kunn de med laveste lønn
                .forEach(System.out::println); //skriver ut alle som stiller krav

        //Sum av heltall i [1, 1000> delelig med 3 eller 5
        System.out.println();
        System.out.println("Sum av heltall i [1, 1000> delelig med 3 eller 5:");
        IntStream.range(1,1000) //henter alle Int fra 1 til 1000
                .filter(x->x%3==0 || x%5==0) //hvor [1, 1000> delelig med 3 eller 5
                .forEach(System.out::println); //skriver ut alle som stiller krav
    }
}
