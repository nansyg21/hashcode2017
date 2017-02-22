package hashcode2017;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		InputParser ip=new InputParser();
		OutputParser op=new OutputParser();
		
		ip.readFile("example(1).in");
		System.out.print(ip.firstLine +"\n");
		
		for(int i=0;i<ip.fileLines.size();i++)
		{
			System.out.println(ip.fileLines.get(i)+" -line: "+i);
			
		}
		op.Write("newOutput.txt", ip.fileLines);
		op.Append("newOutput.txt", "append");
	}
	

}
