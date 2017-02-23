package hashcode2017;

import java.io.*;
import java.util.*;

public class InputParser {

    public static String firstLine;
    public static String[] firstLineSplit;
    public static String videoLine;
    public static String[] videoLineSplit;
    public static ArrayList<String> fileLines;
    public static ArrayList<String[]> fileLinesSplit;

    private Scanner s;

    public InputParser() {
        fileLines = new ArrayList<String>();
        fileLinesSplit = new ArrayList<String[]>();
    }

    //Read a file of strings
    public void readFile(String fileName) {
        boolean first = true;
        boolean second=false;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));

            //Read next line
            int counter=0;
            while (s.hasNextLine()) {
                String line = s.nextLine().trim();

                if(second)
                {
                	
                	videoLine=line;
                	second=false;
                }
                
                //Store first line in a different variable
                else if (first) {
                    firstLine = line;
                    first = false;
                    second=true;
                }
                
                //Keep the rest line in an arraylist
                else {
                	
                	String[] splitLine=line.split("\\s+");
                	if(splitLine.length==2)
                	{
                		
                		int dcLatency=Integer.parseInt(splitLine[0]);
                		int howManyCache=Integer.parseInt(splitLine[1]);
                		
                		for(int i=0;i<howManyCache;i++)
                		{
                			String line2 = s.nextLine().trim();
                			String[] splitLine2=line2.split("\\s+");
                			//Refer to the end point we 
                			int cachePointId=Integer.parseInt(splitLine2[0]);
                			int epLatency=Integer.parseInt(splitLine2[1]);
                		}
                		counter++; //counter is end point id
                		
                		
                	}
                	else if(splitLine.length==3)
                	{
                		int vidId=Integer.parseInt(splitLine[0]);
                		int endPointId=Integer.parseInt(splitLine[0]);
                		int requests=Integer.parseInt(splitLine[0]);
                	}
                    fileLines.add(line);
                }
            }

        } catch (Exception e) {
            System.out.println("Not able to parse the file");
        }

    }

    //split the first line in spaces
    public void firstLineSplit(String fl) {
        firstLineSplit = fl.split("\\s+");
    }

    //split a line by char
    public void splitCurrentLineIntoChars(String l) {
        String[] curLineSplit = l.split("(?!^)");
        fileLinesSplit.add(curLineSplit);
    }

    //split a line by some char - ex comma separated
    public void splitCurrentLineByChar(String l) {
        String[] curLineSplit = l.split(",");
        fileLinesSplit.add(curLineSplit);
    }


    /**
     * Converts fileLinesSplit to a 2D chararray
     * Easily modified to return Integers or Double values
     * @return Returns
     */
    public char[][] to2Dchararray() {

        if(fileLinesSplit != null && !fileLinesSplit.isEmpty()) {
            int n = fileLines.size();
            int row = 0, column = 0;
            char[][] grid = new char[n][n];

            for (String[] sArr : fileLinesSplit) {
                n = sArr.length;
                for (String s : sArr) {
                    grid[row][column] = s.charAt(0);
                    row++;
                }
                column++;
            }
            return grid;
        } else {
            return null;
        }

    }

}
