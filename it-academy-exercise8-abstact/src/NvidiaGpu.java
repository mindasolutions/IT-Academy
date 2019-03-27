public class NvidiaGpu extends Gpu {

    @Override
    int getG3dMark() {
        return 10;
    }

    @Override
    String getModel() {
        return "NVidia TITAN V ";
    }
}
