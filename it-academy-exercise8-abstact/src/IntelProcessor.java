public class IntelProcessor extends Processor {
    @Override
    int getMhz() {
        return 3700;
    }

    @Override
    public String toString() {
        return "Intel Processor " +
                getMhz();
    }
}
