package hashcode2017;

import java.io.OutputStream;
import java.util.ArrayList;

public class Solver {
	
	ArrayList<Video> videos;
	ArrayList<Request> requests;
	ArrayList<Cache> caches;
	ArrayList<EndPoint> endpoints;



    public Solver(ArrayList<Video> videos, ArrayList<Request> requests, ArrayList<Cache> caches, ArrayList<EndPoint> endpoints) {
        this.videos = videos;
        this.requests = requests;
        this.caches = caches;
        this.endpoints = endpoints;
    }

    public void Solve()
	{
        OutputParser outputParser = new OutputParser();
		int cacheId = 0 , vidCounter = 0;
        boolean newCache = true;


        outputParser.Append("solutionTheo",String.valueOf(caches.size())+"\n");
		for(Cache c : caches)
		{
		    // cache can fit another video
			if(c.getSize() < videos.get(vidCounter).getSize()) {
			    if(newCache) {
			        outputParser.Append("solutionTheo",c.getId()+" ");
                    newCache = false;
                }

                outputParser.Append("solutionTheo",videos.get(vidCounter).getSize()+" ");

                System.out.println(c.getSize());

             //   c.setSize(c.getSize()-videos.get(vidCounter).getSize());

             //   videos.remove(vidCounter);
			}
			else {
			    newCache = true;
            }
		}
		
	}

}
