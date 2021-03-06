public class VideoData extends Subject {
    private String title;
    private String description;
    private String fileName;

    public void VideoDataChanged() {
        NotifyObserver(this, null);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        VideoDataChanged();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        VideoDataChanged();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        VideoDataChanged();
    }
}
