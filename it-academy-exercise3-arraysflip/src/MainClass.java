public class MainClass {
    public static void main(String[] args) {
        int[] arrayToFlip = generateArrayFrom1(10);
        int[] arrayMissed1 = {1,2,3,5,6};
        int[] arrayMissed2 = {1,2,3,4,5,6,7,8,9,11};
        int[] arrayMissed3 = {10,11,12,13,14,16,17};

        System.out.println("Default array: ");
        printArray(arrayToFlip);

        System.out.println("Array after flip: ");
        printArray(flipArray(arrayToFlip));

        System.out.println("Average of array is: ");
        System.out.println(averageArray(arrayToFlip));

        System.out.println("---MISING ARRAYS---");

        System.out.print("Array arrayMissed1: ");
        printArray(arrayMissed1);
        System.out.print("Missed value of arrayMissed1: ");
        System.out.println(missedValueOfArray(arrayMissed1));

        System.out.print("Array arrayMissed2: ");
        printArray(arrayMissed2);
        System.out.print("Missed value of arrayMissed2: ");
        System.out.println(missedValueOfArray(arrayMissed2));

        System.out.print("Array arrayMissed3: ");
        printArray(arrayMissed3);
        System.out.print("Missed value of arrayMissed3: ");
        System.out.println(missedValueOfArray(arrayMissed3));

    }

    public static int[] flipArray(int[] array) {
        for(int pointer = 0; pointer < array.length/2; pointer++) {
            int temp = array[pointer];
            array[pointer] = array[array.length -pointer -1];
            array[array.length -pointer -1] = temp;
        }

        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static double averageArray(int[] array) {
        int arraySum = 0;
        for(int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }

        return arraySum / array.length;
    }

    public static int missedValueOfArray(int[] array) {
        //int total = (array.length+1) * (array.length + 2) / 2; -- can be overloaded, when array don't start from 1
        int total = (array.length + 1) * (array[0] + array[array.length-1]) / 2;
        for(int i = 0; i < array.length; i++) {
            total -= array[i];
        }
        return total;
    }

    public static int[] generateArrayFrom1(int sizeOfArray) {
        int[] array = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray;) {
            array[i] = ++i;
        }
        return array;
    }
}
