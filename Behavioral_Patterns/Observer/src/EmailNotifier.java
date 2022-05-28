public class EmailNotifier extends Observer {
    VideoData videoData = new VideoData();

    public EmailNotifier(Subject subject) {
        this.subject = subject;
        this.subject.AttachObserver(this);
    }

    @Override
    public void Notify(Subject subject, Object arg) {
        if (subject != null) {
            videoData = (VideoData) subject;
            System.out.println("Notify all subscriber via EMAIL with new data ");
            System.out.println(" Name : " + videoData.getTitle());
            System.out.println(" Description : " + videoData.getDescription());
            System.out.println(" FileName : " + videoData.getFileName());
        }
    }
    /*public void Notify(String name, String description, String fileName) {
        System.out.println("Notify all subscriber via EMAIL with new data ");
        System.out.println(" Name : " + name);
        System.out.println(" Description : " + description);
        System.out.println(" FileName : " + fileName);
    }*/
}
