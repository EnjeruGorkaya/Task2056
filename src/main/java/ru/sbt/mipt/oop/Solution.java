package main.java.ru.sbt.mipt.oop;
import javax.print.DocFlavor;
import java.io.*;
import java.util.*;

/**
 * Created by 11007122 on 13.12.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Map<String, Integer> wordsInText = new TreeMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        String word;
        Integer amount = 1, maxAmount = 0;
        // заполнение Мапы
        while(in.hasNext()){
            word = in.next();
            if (wordsInText.containsKey(word)) {
                amount = wordsInText.get(word) + 1;
            } else
                amount = 1;
            wordsInText.put(word, amount);

            if (amount > maxAmount)
                maxAmount = amount;
        }

        System.out.println(wordsInText);

        for( Map.Entry<String, Integer> entry : wordsInText.entrySet() ){
            if (entry.getValue() == maxAmount)
                System.out.println(entry.getKey());
        }

    }

}
