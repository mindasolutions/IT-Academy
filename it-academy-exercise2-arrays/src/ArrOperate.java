import java.util.concurrent.ThreadLocalRandom;

public class ArrOperate extends Config {

    private int[] array = new int[Config.getArrayLength()];

    /**
     * constructor save param as private array
     *
     * @param array
     */
    public ArrOperate(int[] array) {
        this.array = array;
    }

    /**
     * method generate random numbers to defined array.
     * size of array and range defined in Config.java class
     *
     * @return
     */
    public static int[] generateArray() {
        int[] array = new int[Config.getArrayLength()];
        for (int pointer = 0; pointer < Config.getArrayLength(); pointer++) {
            array[pointer] = ThreadLocalRandom.current().nextInt(Config.getMinValue(), Config.getMaxValue() + 1);
        }

        return array;
    }

    /**
     * method print all values of array
     */
    public void listingArray() {
        System.out.println("Numbers in this array is: ");
        for (int pointer = 0; pointer < array.length; pointer++) {
            System.out.print(array[pointer] + " ");
        }
        System.out.println(" ");
    }

    /**
     * method print all peaks of array collection
     */
    public void peaksArray() {
        System.out.println("-- Peaks Array --");
        if (isBiggerFirst()) {
            System.out.print(array[0] + " ");
        }
        for (int pointer = 1; pointer < array.length - 1; pointer++) {
            if (isBiggerBetween(pointer)) {
                System.out.print(array[pointer] + " ");
            }
        }
        if (isBiggerLast()) {
            System.out.print(array[array.length - 1] + " ");
        }
        System.out.println(" ");
    }

    /**
     * method print highest value of array collection
     */
    public void maxValue() {
        System.out.println("-- Highest Value --");
        System.out.println(getHigestValue());
    }

    /**
     * method check highest value of array collection
     *
     * @return
     */
    private int getHigestValue() {
        int maxValue = 0;
        for (int pointer = 0; pointer < array.length; pointer++) {
            if (array[pointer] > maxValue) {
                maxValue = array[pointer];
            }
        }

        return maxValue;
    }

    /**
     * method check are current param of array collection is peak
     *
     * @param pointer
     * @return
     */
    private boolean isBiggerBetween(int pointer) {
        return (array[pointer - 1] < array[pointer] && array[pointer] > array[pointer + 1]);
    }

    /**
     * method check are first param of array collection is peak
     *
     * @return
     */
    private boolean isBiggerFirst() {
        return (array[0] > array[1]);
    }

    /**
     * method check are last param of array collection is peak
     *
     * @return
     */
    private boolean isBiggerLast() {
        return (array[array.length - 2] < array[array.length - 1]);
    }
}
