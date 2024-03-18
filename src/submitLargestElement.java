import  java.util.*;
public class submitLargestElement {
    public static void main(String args[] ) throws Exception {


        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i=0; i<size; i++ ){
            //	System.out.print("element "+ (i+1) + ":");
            numbers[i] = scanner.nextInt();
        }

        int largest = findLargest(numbers);
        System.out.println(largest);
        scanner.close();
    }

    public static int findLargest(int[] arr){


        int largest = arr[0];

        for (int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }
}
