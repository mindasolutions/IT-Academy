public class AmdProcessor extends Processor {

    @Override
    int getMhz() {
        return 3900;
    }

    @Override
    public String toString() {
        return "AMD Processor " +
                getMhz();
    }
}
