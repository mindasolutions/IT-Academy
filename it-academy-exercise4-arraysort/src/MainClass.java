public class MainClass {

    static Users user1 = new Users("Dawid", "Minda", 26);
    static Users user2 = new Users("Jan", "Nowak", 30);
    static Users user3 = new Users("Anna", "Maj", 18);
    static Users user4 = new Users("Magda", "Kuzia", 21);
    static Users user5 = new Users("Robert", "Strzelczyk", 23);
    static Users[] arrayObject = {user1, user2, user3, user4, user5};
    static Users[] arrayObject2 = arrayObject.clone();

    public static void main(String[] args) {

        System.out.println("-- BUBBLE SORTING --");
        printArray(arrayObject);
        bubbleSort(arrayObject);
        printArray(arrayObject);

        System.out.println("-- MERGE SORTING --");
        printArray(arrayObject2);
        mergeSort(0, arrayObject2.length - 1);
        printArray(arrayObject2);

    }

    public static Users[] bubbleSort(Users[] arrayToSort) {
        boolean checker;
        do {
            checker = false;
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i].getAge() > arrayToSort[i + 1].getAge()) {
                    Users temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                    checker = true;
                }
            }
        } while (checker);

        return arrayToSort;
    }

    public static void printArray(Users[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getFirstname() + " " + array[i].getLastname() + " " + array[i].getAge() + " ");
        }
        System.out.println(" ");
    }

    public static void mergeSort(int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(first, middle);
            mergeSort(middle + 1, last);
            merge(first, middle, last);
        }
    }

    public static void merge(int first, int middle, int last) {
        Users[] temp = new Users[last+1];
        for (int i = first; i <= last; i++) {
            temp[i] = arrayObject2[i];
        }
        int i = first;
        int j = middle + 1;
        int q = first;

        while (i <= middle && j <= last) {
            if (temp[i].getAge() < temp[j].getAge())
                arrayObject2[q++] = temp[i++];
            else
                arrayObject2[q++] = temp[j++];
        }
        while (i <= middle) {
            arrayObject2[q++] = temp[i++];
        }
    }

}
