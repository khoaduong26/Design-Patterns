public class VideoProxy implements VideoService {
    private RealVideoService realService;
    private boolean isLoggedIn;

    public VideoProxy(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
    public VideoProxy(){}
    @Override
    public void watchVideo() {
        if (!isLoggedIn) {
            System.out.println("Bạn cần đăng nhập ");
            return;
        }

        // Virtual Proxy - chỉ tạo đối tượng RealVideoService khi cần thiết
        if (realService == null) {
            realService = new RealVideoService();
        }

        realService.watchVideo();
    }
}
