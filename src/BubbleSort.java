import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many different numbers you would like to enter manually?");
        int manualNumbersToBeEntered = sc.nextInt();
        System.out.println("Please input valid number for an Array length:");
        int arrayLength = sc.nextInt();
        int [] numbers = new int[arrayLength];

        if (arrayLength <= manualNumbersToBeEntered){
            System.out.println("Please input valid data for the array:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i]= sc.nextInt();
            }
        }else {
            for (int i = 0; i <numbers.length ; i++) {
                numbers[i] = ran.nextInt(342998);
            }
        }
        System.out.println("Numbers before Bubble Sort: ");
        printArray(numbers);

        boolean swap = true;
        while(swap){
            swap=false;
            for (int i = 0; i <numbers.length-1 ; i++) {
                if (numbers[i] > numbers[i+1]) {
                    swap=true;
                    int temp = numbers[i];
                    numbers[i]=numbers[i+1];
                    numbers[i+1]=temp;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Numbers After BubbleSort:");
        printArray(numbers);

    }
    public static void printArray(int[] numbers){
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
