package dvl.mrodica.lab2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrieti o propozitie care se termina cu punct:");
        String value = scanner.nextLine();

        System.out.println("-----------------------------------");
        System.out.println("Native:");
        countWordsWithNativeImpl(value.toCharArray());

        System.out.println("\n-----------------------------------");
        System.out.println("String methods:");
        countWithStringMethods(value);
    }

    static void countWordsWithNativeImpl(char [] array){
        int nrWords = 0;
        int nrCharacters = 0;

        for (char c: array) {
            if (c != ' ' && c != '.') {
                nrCharacters++;
            } else {
                nrWords++;
            }
        }

        System.out.println("Nr words: " + nrWords);
        System.out.println("Nr characters: " + nrCharacters);
    }

    static  void countWithStringMethods(String value) {
        int nrChars = 0;
        String[] strings = value.split(" ");

        for (String string : strings) {
            if(string.contains(".")) {
                nrChars += (string.length() - 1);
            } else {
                nrChars += string.length();
            }
        }

        System.out.println("Nr words: " + strings.length);
        System.out.println("Nr characters: " + nrChars);
    }
}
