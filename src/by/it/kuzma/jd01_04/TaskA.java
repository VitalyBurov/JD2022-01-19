package by.it.kuzma.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        printMulTable();
        buildOneDimArray(line);
    }
    static void printMulTable(){
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-2d ",i,j,i*j);
            }
            System.out.println();
        }

    }

    static void buildOneDimArray(String line){
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);
        double firtElement = array[0];
        double lastElement = array[array.length-1];
        Arrays.sort(array);
        InOut.printArray(array, "V", 4);
        int indexFirst = Arrays.binarySearch(array, firtElement);
        System.out.printf("Index of first element=%d%n", indexFirst);
        int indexLast = Arrays.binarySearch(array, lastElement);
        System.out.printf("Index of last element=%d%n", indexLast);
    }
}
