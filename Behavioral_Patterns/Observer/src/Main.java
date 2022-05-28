public class Main {

    public static void main(String[] args) {
        VideoData videoData = new VideoData();
        new EmailNotifier(videoData);
        new PhoneNotifier(videoData);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(videoData);

        videoData.setTitle("Observer Design Pattern");

        videoData.DetachObserver(youtubeNotifier);
        System.out.println("------------------------");
        videoData.setDescription("Hello World");
    }
}
