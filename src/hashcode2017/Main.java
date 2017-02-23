package hashcode2017;

import java.util.ArrayList;

public class Main {

	/**
	 * Impossible to guess functionality
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		InputParser ip=new InputParser();
		OutputParser op=new OutputParser();
		
		
		ip.readFile("me_at_the_zoo.in");
		System.out.print("first "+ip.firstLine +"\n");
		
		ip.firstLineSplit(ip.firstLine);
		int howManyVids=Integer.parseInt(ip.firstLineSplit[0]);
		
		ArrayList<Video> videos=new ArrayList<Video>();
				
		
		System.out.println("Vids "+howManyVids);
		int howManyEndpoints=Integer.parseInt(ip.firstLineSplit[1]);
		System.out.println("End points "+howManyEndpoints);
		int howManyRequests=Integer.parseInt(ip.firstLineSplit[2]);
		System.out.println("Requests "+howManyRequests);
		int howManyCaches=Integer.parseInt(ip.firstLineSplit[3]);
		System.out.println("Caches "+howManyCaches);
		int capacityPerCache=Integer.parseInt(ip.firstLineSplit[4]);
		System.out.println("Capacity "+howManyVids);
				
		String[] splitVideoSizesLine=ip.videoLine.split("\\s+");
		
		//Initialize video
		for(int i=0;i<howManyVids;i++)
		{
			int db=Integer.parseInt(splitVideoSizesLine[i]);
			Video v=new Video(i,db);
			videos.add(v);
		}
		
		ArrayList<Cache> caches=new ArrayList<Cache>();
		
		for(int i=0;i<howManyCaches;i++)
		{
			Cache c=new Cache(i,capacityPerCache);
			caches.add(c);
		}
		
		
		//int howManyVids=splitLine.length;
		
		//System.out.print("second line length "+splitLine.length +"\n");
		
		/*for(int i=0;i<ip.fileLines.size();i++)
		{
			System.out.println(ip.fileLines.get(i)+" -line: "+i);
			
		}*/
		Solver solver = new Solver(videos,InputParser.requests,caches,InputParser.endpoints);
        solver.Solve();

		//op.Write("newOutput.txt", ip.fileLines);
		//op.Append("newOutput.txt", "append");
	}
	

}
