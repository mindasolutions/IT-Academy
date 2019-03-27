public class CompuyterFactory {
    private Processor proc;
    private Gpu gpu;

    void installProcessor(Processor proc){
        this.proc = proc;
    };

    Processor getProcessor(){
        return proc;
    };

    void installGpu(Gpu gpu){
        this.gpu = gpu;
    };

    Gpu getGpu(){
        return gpu;
    };


    public String toString(){

        return "You successfully configure Your computer with " + proc.getModel() + ", " + proc.getMhz() + " MHz processor and " + gpu.getModel() + " with " + gpu.getG3dMark() + " points in G3dMark.";
    };

}
