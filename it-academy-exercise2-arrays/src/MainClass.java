public class MainClass {
    public static void main(String[] args) {
        int[] array = ArrOperate.generateArray();

        ArrOperate arr = new ArrOperate(array);

        arr.listingArray();
        arr.peaksArray();
        arr.maxValue();
    }
}
