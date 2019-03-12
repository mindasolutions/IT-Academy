import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        int[] array = {10, 15, 5, 10, 3, 3, 12, 10, 5, 8, 2, 1};

        System.out.println("Start array: " + Arrays.toString(array));
        System.out.println("Duplicate values: " + Arrays.toString(findDuplicates(array)));
        System.out.println("Sorted duplicate values: " + Arrays.toString(mergeSort(0, findDuplicates(array).length - 1, findDuplicates(array))));


        System.out.println("Let check it out by yourself! Tell me how much numbers do you wanna wrote, then type that numbers separate it by spacebar: ");
        int[] numbers = readNumsFromCommandLine();

        System.out.println("Your type: " + Arrays.toString(numbers));
        System.out.println("Duplicate values: " + Arrays.toString(findDuplicates(numbers)));
        System.out.println("Sorted duplicate values: " + Arrays.toString(mergeSort(0, findDuplicates(numbers).length - 1, findDuplicates(numbers))));

    }

    public static int[] findDuplicates(int[] arrayToSearch) {

        ArrayList arrayUnique = new ArrayList<Integer>();
        ArrayList arrayDuplicates = new ArrayList<Integer>();

        for (int i : arrayToSearch) {
            if(arrayUnique.contains(i)) {
                if(!arrayDuplicates.contains(i))
                    arrayDuplicates.add(i);
            } else {
                arrayUnique.add(i);
            }
        }

        int[] sendReturn = new int[arrayDuplicates.size()];
        for(int i = 0; i < arrayDuplicates.size(); i++) { // convert object to int[]
            sendReturn[i] = (int)arrayDuplicates.get(i);
        }
        return sendReturn;
    }

    public static int[] readNumsFromCommandLine() {

        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        s.nextLine(); // throw away the newline.

        int [] numbers = new int[count];
        System.out.print("Please type " + count + " numbers: ");
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }

        return numbers;
    }

    public static int[] mergeSort(int first, int last, int array[]) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(first, middle, array);
            mergeSort(middle + 1, last, array);
            array = merge(first, middle, last, array);
        }

        return array;
    }

    public static int[] merge(int first, int middle, int last, int[] array) {
        int[] temp = new int[last+1];
        for (int i = first; i <= last; i++) {
            temp[i] = array[i];
        }
        int i = first;
        int j = middle + 1;
        int q = first;

        while (i <= middle && j <= last) {
            if (temp[i] < temp[j])
                array[q++] = temp[i++];
            else
                array[q++] = temp[j++];
        }
        while (i <= middle) {
            array[q++] = temp[i++];
        }

        return array;
    }
}
