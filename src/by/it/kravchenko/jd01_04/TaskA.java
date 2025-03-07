package by.it.kravchenko.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        printMulTable();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        buildOneDimArray(string);
    }
    static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                int sum = i * j;
                System.out.printf("%1d*%1d=%-2d ", i, j, sum);
            }
            System.out.println();
        }
    }
    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        double first = array[0];
        double last = array[array.length - 1];
        InOut.printArray(array, "V", 5);
        Helper.sort(array);
        InOut.printArray(array, "V", 4);
        int indexfirst = Arrays.binarySearch(array, first);
                System.out.println("Index of first element=" + indexfirst);
        int indexlast = Arrays.binarySearch(array, last);
                    System.out.println("Index of last element=" + indexlast);


                }
            }

