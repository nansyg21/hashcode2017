package hashcode2017;

import java.io.*;
import java.util.*;

public class InputParser {

    public static String firstLine;
    public static String[] firstLineSplit;
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
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));

            //Read next line
            while (s.hasNextLine()) {
                String line = s.nextLine().trim();

                //Store first line in a different variable
                if (first) {
                    firstLine = line;
                    first = false;
                }
                //Keep the rest line in an arraylist
                else {
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
