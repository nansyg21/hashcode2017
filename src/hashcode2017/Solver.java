package hashcode2017;

import java.util.ArrayList;

public class Solver {
	
	ArrayList<Video> videos;
	ArrayList<Request> requests;
	ArrayList<Cache> caches;
	ArrayList<Cache> endpoints;
	
	
	public Solver(ArrayList<Video> _videos, ArrayList<Request> _requests, ArrayList<Cache> _caches, ArrayList<Cache> _endpoints )
	{
		videos = _videos;
		requests = _requests;
		caches = _caches;
		endpoints = _endpoints;		
	}
	
	public void Solve()
	{
		int cacheId = 0 , vidCounter = 0;

		for(Cache c : caches)
		{
		    // cache can fit another video
			if(c.getSize() < videos.get(vidCounter).getSize()) {
				System.out.println(c.getId());
				c.setSize(c.getSize()-videos.get(vidCounter).getSize());
                videos.remove(vidCounter);
			}
			else {
			    break;
            }
		}
		
	}

}
