public class VideoProxy implements VideoService {
    private RealVideoService realService;
    private boolean isLoggedIn;

    public VideoProxy(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    @Override
    public void watchVideo() {
        if (!isLoggedIn) {
            System.out.println("Bạn cần đăng nhập ");
            return;
        }

        // Lazy init (chỉ tạo khi cần)
        if (realService == null) {
            realService = new RealVideoService();
        }

        realService.watchVideo();
    }
}
