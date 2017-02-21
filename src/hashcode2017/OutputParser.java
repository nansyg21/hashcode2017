package hashcode2017;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class OutputParser {

	public OutputParser()
	{

	}

	public void Write(String fileToWrite,ArrayList<String> s)
	{
		try(FileWriter fw = new FileWriter(fileToWrite, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))
		{
			for(String st : s)
			{
				out.println(st);
			}

		} catch (IOException e) {
			//exception handling left as an exercise for the reader
		}
	}
	
	public void Append(String fileToAppend,String s)
	{
		try {
		    Files.write(Paths.get(fileToAppend), s.getBytes(), StandardOpenOption.APPEND);
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
	}

}
