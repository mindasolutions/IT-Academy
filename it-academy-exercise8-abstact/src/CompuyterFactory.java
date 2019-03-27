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

        return "You successfully configure Your computer with " + proc + " MHz processor and " + gpu + " points in G3dMark.";
    };

}
