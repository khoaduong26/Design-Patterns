public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("User chưa login:");
        VideoService video1 = new VideoProxy(false);
        video1.watchVideo();

        System.out.println("-----");

        System.out.println("User đã login:");
        VideoService video2 = new VideoProxy(true);
        video2.watchVideo();
    }
}
