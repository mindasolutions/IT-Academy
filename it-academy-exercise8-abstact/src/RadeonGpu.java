public class RadeonGpu extends Gpu {
    @Override
    int getG3dMark() {
        return 9;
    }

    @Override
    public String toString() {
        return "Radeon Graphic card " +
                getG3dMark();
    }
}
