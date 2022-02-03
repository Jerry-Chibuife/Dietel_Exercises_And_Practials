package Chapter9.DiaryOfAWimpyKid;

import java.time.LocalDateTime;

public class Entry {
    private String title;
    private LocalDateTime time = LocalDateTime.now();
    private String gist;

    public Entry(String title, String gist) {
        this.title = title;
        this.gist = gist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist;
    }


}
