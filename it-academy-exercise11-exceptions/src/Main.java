public class Main {

    public static void main(String[] args) {
        try {
            other();
            System.out.println("main ofter method");
        } catch (MyCompiletimeExc ex) {    // FIXME 1
            System.out.println("main catch");
        } finally {
            System.out.println("main finally");
        }

        System.out.println("main after try-catch");
    }

    private static void other() throws MyCompiletimeExc {
        try {
            some();
        } catch (MyRuntimeExc ex) {    // FIXME 2
            System.out.println("other catch");
        } finally {
            System.out.println("other finally");
        }

        System.out.println("other after try-catch");
    }

    private static void some() throws MyCompiletimeExc {
        throw new MyRuntimeExc("this is my exception");
    }

    private static class MyRuntimeExc extends RuntimeException {

        public MyRuntimeExc(String message) {
            super(message);
        }

        public MyRuntimeExc(String message, Throwable cause) {
            super(message, cause);
        }
    }

    private static class MyCompiletimeExc extends Exception {

        public MyCompiletimeExc(String message) {
            super(message);
        }

        public MyCompiletimeExc(String message, Throwable cause) {
            super(message, cause);
        }
    }

}
