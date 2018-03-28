import java.io.BufferedReader;
import java.io.FileReader;

public class DataAnalysisMethods {
	String fileToAnalyze;
	
	boolean detectPositivePosts(String lineToAnalzye)
	{
		String lineToAnalyzeLowerCase = lineToAnalzye.toLowerCase();
		
		if ((lineToAnalyzeLowerCase.contains("good") || lineToAnalyzeLowerCase.contains("awesome")) || (lineToAnalyzeLowerCase.contains("best") || lineToAnalyzeLowerCase.contains("great")) )
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	void readRedditFileForPositive(String fileToRead)
	{
		System.out.println("ready to read:" +fileToRead);
		int positivePostCounter = 0;
		try
		{
			FileReader myFileReader = new FileReader(fileToRead);
			System.out.println("I was able to open your file!");
			BufferedReader myBufferReader =  new BufferedReader(myFileReader);
			System.out.println("Ready to start buffering!");
			String line="";
			while ((line=myBufferReader.readLine()) != null)
			{
				if (detectPositivePosts(line) == true)
				{
					positivePostCounter++;
					System.out.println("Positive post #" + positivePostCounter + ": " + line);
				}
			}
		
		}
		catch(Exception e)
		{
			
		}
		System.out.println("There are " + positivePostCounter + " positive posts.");
	}
	
	boolean detectNegativePosts(String lineToAnalzye)
	{
		String lineToAnalyzeLowerCase = lineToAnalzye.toLowerCase();
		
		if ((lineToAnalyzeLowerCase.contains("bad") || lineToAnalyzeLowerCase.contains("poor")) || (lineToAnalyzeLowerCase.contains("worst") || lineToAnalyzeLowerCase.contains("awful")) )
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	void readRedditFileForNegative(String fileToRead)
	{
		System.out.println("ready to read:" +fileToRead);
		int negativePostCounter = 0;
		try
		{
			FileReader myFileReader = new FileReader(fileToRead);
			System.out.println("I was able to open your file!");
			BufferedReader myBufferReader =  new BufferedReader(myFileReader);
			System.out.println("Ready to start buffering!");
			String line="";
			while ((line=myBufferReader.readLine()) != null)
			{
				if (detectNegativePosts(line) == true)
				{
					negativePostCounter++;
					System.out.println("Negative post #" + negativePostCounter + ": " + line);
				}
			}
		
		}
		catch(Exception e)
		{
			
		}
		System.out.println("There are " + negativePostCounter + " negative posts.");
	}
}

	

