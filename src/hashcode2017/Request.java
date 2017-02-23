package hashcode2017;

/**
 * Created by td41 on 23/02/17.
 */
public class Request {

    int video;
    int ed;
    int count;

    public Request(int video, int ed,int count) {
        this.video = video;
        this.ed = ed;
        this.count=count;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public int getEd() {
        return ed;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
    
}
