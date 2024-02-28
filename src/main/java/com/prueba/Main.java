package com.prueba;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

public class Main {

    private void stringInvertido(String string) {
        //forma rapida
        String text = new StringBuilder(string).reverse().toString();
        System.out.println(text);

        //forma con algoritmos
        String[] array = string.split("");
        StringBuilder newtex = new StringBuilder();
        for (int i = array.length; i > 0; i--) {
            newtex.append(array[i - 1]);
        }
        System.out.println(newtex);
    }

    private void capicua(int num) {
        String num1 = String.valueOf(num);
        String num2 = new StringBuilder(num1).reverse().toString();

        if (num1.equals(num2)) {
            System.out.println("numero es capicua");
        } else {
            System.out.println("numero no es capicua");
        }


    }

    private void countLetter(String string) {
        int i, length, counter[] = new int[256];
        length = string.length();
        for (i = 0; i < length; i++) {
            //counter[string.charAt(i)] = counter[string.charAt(i)] + 1;
            counter[string.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }

    private void letterRepeat(String string) {
        int i, length, counter[] = new int[256];
        length = string.length();
        for (i = 0; i < length; i++) {
            //counter[string.charAt(i)] = counter[string.charAt(i)] + 1;
            counter[string.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (counter[i] > 1) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }

    private void numMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("numero es multiplo");
        } else {
            System.out.println("numero no es multiplo");
        }
    }

    private void yearBiciesto(int year) {
        Boolean isLeapYear = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(isLeapYear);
    }
    private void desordenarCadena(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }
private void sacarRepetidos(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
}

    private void revisarVocales(String text){
        boolean result = text.matches(".*[aeiou].*");
        System.out.println(result);
    }
    public static void main(String[] args) {
        Main main = new Main();
        //main.stringInvertido("luis_fernando");
        //main.capicua(526);
        //main.countLetter("otorrinolaringologo");
        //main.letterRepeat("otorrinolaringologo");
        //main.numMultiplo(9,3);
        //main.yearBiciesto(2056);
        //main.desordenarCadena("luis");
        //main.sacarRepetidos(Arrays.asList(1,2,3,4,4,4,5,5,6,7,8,8,9,10,10,10,12,13));
        //main.revisarVocales("murcielago");
    }
}