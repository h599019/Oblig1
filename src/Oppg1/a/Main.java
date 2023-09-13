package Oppg1.a;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");

        Collections.sort(listen, Comparator.comparingInt(Integer::parseInt)); //Bruker Collections.sort og Comperator for å sortere gjennom liten.
        System.out.println(listen);
    }
}
