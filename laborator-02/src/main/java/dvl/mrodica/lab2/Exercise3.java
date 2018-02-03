package dvl.mrodica.lab2;

import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        int nr = 10;
        int[] array = new int[nr];

        generateTable(array, nr);
        printTable(array);
        sort(array);
    }

    static void generateTable(int[] array, int nr) {
        Random random = new Random();
        for (int i = 0; i < nr; ++i) {
            array[i] = random.nextInt(10);
        }
    }

    static void sort(int[] array) {
        int aux = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] > array[j]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
    }

    static void printTable(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
