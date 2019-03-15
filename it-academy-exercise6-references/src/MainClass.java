import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] myRef = {1,2,3};
        System.out.println(myRef.hashCode());
        testRef(myRef);
        System.out.println(Arrays.toString(myRef));

        if(myRef.hashCode() == testRef(myRef).hashCode()) {
            System.out.println("Yes, it's same point");
        } else {
            System.out.println("No, it's diferent point");
        }
    }

    static int[] testRef(int[] arrayRef) {
        System.out.println(arrayRef.hashCode());
        arrayRef[0] = 10;
        System.out.println(Arrays.toString(arrayRef));

        return arrayRef;
    }
}
