import java.util.Scanner;

public class arrayChall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_length = scanner.nextInt();
        int[] array = getIntegers(array_length);
        sortIntegers(array);
        printArray(array);
       //printArray(sortIntegers(getIntegers(array_length)));


    }
    public static int[] getIntegers(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length+1];
        for (int i=1; i<=length; i++) {
            array[i] = scanner.nextInt();
        }
    return array;
    }
    public static int[] sortIntegers(int[] array) {
        for (int i=1; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] < array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
    public  static void printArray(int[] array) {
        for (int i=1; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
