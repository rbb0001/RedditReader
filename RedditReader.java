import java.io.*;

public class RedditReader {
	String fileToAnalyze;
	RedditReader()
	{
		System.out.println("Default");
		String fileToAnalyze = "";
	}
	boolean detectRussia(String lineToAnalyze)
	{
		String lineToAnalyzeLowerCase = lineToAnalyze.toLowerCase();
		
		if (lineToAnalyzeLowerCase.contains("russia") || lineToAnalyzeLowerCase.contains("putin"))
		{
			System.out.println("AAAAAAAaaa");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void readRedditFile(String fileToRead)
	{
		System.out.println("Ready to read "+fileToRead);
		try {
			FileReader myFileReader = new FileReader(fileToRead);
			System.out.println("I was able to open your file!");
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			System.out.println("Read to start buffering!");
			String line = "";
			
			while ((line = myBufferReader.readLine()) != null)
			{
				if (detectRussia(line) == true)
				{
					System.out.println(line);
				}
				
			}
				
			} catch (Exception ex) {
			System.out.println("No File Found.");
			}
	}
	// This method counts the amount of times Russia is mentioned
	void countRussia(String fileToRead)
	{
		System.out.println("Ready to read "+fileToRead);
		try {
			FileReader myFileReader = new FileReader(fileToRead);
			System.out.println("I was able to open your file!");
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			System.out.println("Read to start buffering!");
			String line = "";
			
			int russiaAmount = 0;
			while ((line = myBufferReader.readLine()) != null)
			{
				String lineLowerCase = line.toLowerCase();
				if (lineLowerCase.contains("russia"))
				{
					russiaAmount += 1;
				}
			}
			System.out.println("Russia was mentioned " + russiaAmount + " times.");
			} catch (Exception ex) {
			System.out.println("No File Found.");
		}
	}
}
