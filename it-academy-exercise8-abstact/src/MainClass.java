public class MainClass {
    public static void main(String[] args) {
        CompuyterFactory computer = new CompuyterFactory();

        Processor amdProcessor = new AmdProcessor();
        Processor intelProcessor = new IntelProcessor();

        Gpu nVidiaGpu = new NvidiaGpu();
        Gpu radeonGpu = new RadeonGpu();

        computer.installProcessor(amdProcessor);
        computer.installGpu(nVidiaGpu);

        System.out.println(computer.toString());

        computer.installProcessor(intelProcessor);
        System.out.println(computer.toString());

        computer.installGpu(radeonGpu);
        System.out.println(computer.toString());
    }
}
