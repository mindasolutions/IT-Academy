public class NvidiaGpu extends Gpu {

    @Override
    int getG3dMark() {
        return 10;
    }

    @Override
    public String toString() {
        return "nVidia Graphic card " +
                getG3dMark();
    }
}
