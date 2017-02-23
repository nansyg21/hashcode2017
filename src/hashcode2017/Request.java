package hashcode2017;

/**
 * Created by td41 on 23/02/17.
 */
public class Request {

    Video video;
    EndPoint ed;

    public Request(Video video, EndPoint ed) {
        this.video = video;
        this.ed = ed;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public EndPoint getEd() {
        return ed;
    }

    public void setEd(EndPoint ed) {
        this.ed = ed;
    }
}
