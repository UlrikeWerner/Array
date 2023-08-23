import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = createArray(10, 1);

        // Aufgabe 1
        System.out.println("Aufgabe 1");
        printValue_s(numbers);

        System.out.println("------");
        // Aufgabe 2
        System.out.println("Aufgabe 2");
        sumOfArray(numbers);

        System.out.println("------");
        // Aufgabe 3
        System.out.println("Aufgabe 3");
        largesNumberOfArray(numbers);

        System.out.println("------");
        // Aufgabe 4
        System.out.println("Aufgabe 4");
        int[] largerNumbers = createArray(10, 11);
        printValue_s(largerNumbers);

        System.out.println("------");
        System.out.println("Aufgabe 5");
        // Aufgabe 5
        printValue_s(addTwoArrays(numbers, largerNumbers));

        System.out.println("------");
        System.out.println("Test");
        int[] test= {7, 4,2};
        System.out.println(addTwoArrays(numbers, test).length);

        System.out.println("------");
        System.out.println("Konsolen Input");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        printValue_s(word);

    }
    public static int[] createArray(int length, int startValue){
        int[] result = new int[length];
        for(int i = 0; i < length; i++){
            result[i] = i+startValue;
        }
        return result;
    }

    public static void printValue_s(int[] values){
        for (int value : values){
            System.out.println(value);
        }
    }

    public static void printValue_s(String values){
        for (int i = 0; i < values.length(); i++){
            System.out.println(values.charAt(i));
        }
    }

    public static void sumOfArray(int[] values){
        int sum = 0;
        for (int value : values){
            sum += value;
        }
        System.out.println(sum);
    }

    public static void largesNumberOfArray(int[] values){
        int result = 0;
        for (int value : values){
            if(value > result) {
                result = value;
            }
        }
        System.out.println(result);
    }

    public static int[] addTwoArrays(int[] para1, int[] para2){
        if(para1.length != para2.length){
            return new int[] {};
        }

        int[] result = new int[para1.length];
        for(int i = 0; i < para1.length; i++){
            result[i] = para1[i] + para2[i];
        }
        return result;
    }
}
