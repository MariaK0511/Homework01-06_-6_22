package strings_task2_5;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        /*
        2. Дана строка произвольной длины с произвольными словами.
Найти самое короткое слово в строке и вывести его на экран.
Найти самое длинное слово в строке и вывести его на экран.
Если таких слов несколько, то вывести последнее из них.
         */
       // int numWords = new Scanner(System.in).nextInt();
         String str = "Дана строка произвольной длины с произвольными словами";
        String[] words = str.split(" ");
        String shortestword = words[0];
        for (int i = 0; i < str.length(); i++){
            if (str.length() > shortestword.length()){
                shortestword = words[i];

            }
        }
        System.out.printf(shortestword);

        } {


            }

        }



