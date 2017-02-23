package hashcode2017;

public class Main {

	/**
	 * Impossible to guess functionality
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		InputParser ip=new InputParser();
		OutputParser op=new OutputParser();
		
		ip.readFile("kittens.in");
		System.out.print("first "+ip.firstLine +"\n");

		String[] splitLine=ip.videoLine.split("\\s+");
		System.out.print("second line length "+splitLine.length +"\n");
		
		/*for(int i=0;i<ip.fileLines.size();i++)
		{
			System.out.println(ip.fileLines.get(i)+" -line: "+i);
			
		}*/
		op.Write("newOutput.txt", ip.fileLines);
		op.Append("newOutput.txt", "append");
	}
	

}
