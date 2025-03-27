package collections;

import java.util.*;

public class Col_Task {
    public static void main(String[] args) {
        /*
        verilen string listdeki en uzun sozu yazdir
        eger eyni sayda 2 soz varsa axrincini yazdir
         */
        List<String> meyveler = new ArrayList<>(Arrays.asList("armud", "nar", "heyva", ""));
        String enuzunsoz = "";

        for (String i : meyveler) {
            if (i.length() >= enuzunsoz.length()) {
                enuzunsoz = i;
            }
        }
        System.out.println("En uzun soz: " + enuzunsoz);
    }
}





