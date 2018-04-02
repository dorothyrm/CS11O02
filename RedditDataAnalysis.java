import java.io.*;
public class RedditDataAnalysis {
	
	boolean findProfanity(String lineToAnalzye)
	{
		String lineToAnalyzeLowerCase = lineToAnalzye.toLowerCase();
		
		if ((lineToAnalyzeLowerCase.contains("fuck") || lineToAnalyzeLowerCase.contains("bitch")) || (lineToAnalyzeLowerCase.contains("shit") || lineToAnalyzeLowerCase.contains("skank"))) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	
	public int [] getCommentsNum(String fileToRead)
	{
		int [] numCommentsArray=new int[6465];
		
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			int postCounter=0;
			while ((line=myBufferReader.readLine())!=null)
			{
				int numCommentsPost=Integer.parseInt(line);
				
				numCommentsArray[postCounter]=numCommentsPost;
				postCounter+=1;
				
				
				
			}
			return numCommentsArray;
			
			
		}
		catch (Exception ex)
		{
			System.out.println("I'm sorry, I wasn't able to find your file.");
		}
		
		return numCommentsArray;
			
	}
	
	public int [] getUpvotesNum(String fileToRead)
	{
		int [] numUpvotesArray=new int[6465];
		
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			int UpCountr=0;
			while ((line=myBufferReader.readLine())!=null)
			{
				int numUpvotesPost=Integer.parseInt(line);
				
				numUpvotesArray[UpCountr]=numUpvotesPost;
				UpCountr+=1;
				
				
				
			}
			return numUpvotesArray;
			
			
		}
		catch (Exception ex)
		{
			System.out.println("I'm sorry, I wasn't able to find your file.");
		}
		
		return numUpvotesArray;
			
	}
	
	
	
	
	
	
	boolean findPolarizingTopic(String lineToAnalzye)
	{
		String lineToAnalyzeLowerCase = lineToAnalzye.toLowerCase();
		
		if ((lineToAnalyzeLowerCase.contains("russia") || lineToAnalyzeLowerCase.contains("hillary")) || (lineToAnalyzeLowerCase.contains("supremacy") || lineToAnalyzeLowerCase.contains("putin")||lineToAnalyzeLowerCase.contains("racism"))) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	
	
	RedditPosts [] getPostsRedditProfanity(String fileToRead)
	{
		RedditPosts [] RedditPosts=new RedditPosts[6465];
		
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			int postCounter=0;
			while ((line=myBufferReader.readLine())!=null)
			{
				RedditPosts[postCounter]=new RedditPosts(line);
				postCounter+=1;
				
				
				
			}
			return RedditPosts;
			
			
		}
		catch (Exception ex)
		{
			System.out.println("I'm Sorry, I wasn't able to find your file");
		}
		return RedditPosts;
			
	}
	void readRedditFileAndProf(String fileToRead)
	{
		System.out.println("ready to read:"+fileToRead);
		try
		{
			FileReader myFileReader=new FileReader(fileToRead);
			BufferedReader myBufferReader= new BufferedReader(myFileReader);
			String line=null;
			while ((line=myBufferReader.readLine())!=null)
			{
				if (findProfanity(line)==true)
					
					System.out.println("line:"+line);
			}
			System.out.println("exited while:");
			
			
	
			
			
			
		}
		catch (Exception ex)
		{
			System.out.println("I don't think I was able to find your file");
		}
	}
		
		
		
		
		
		RedditPosts [] getPostsRedditPol(String fileToRead)
		{
			RedditPosts [] RedditPosts=new RedditPosts[6465];
			
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				int postCounter=0;
				while ((line=myBufferReader.readLine())!=null)
				{
					RedditPosts[postCounter]=new RedditPosts(line);
					postCounter+=1;
					
					
					
				}
				return RedditPosts;
				
				
			}
			catch (Exception ex)
			{
				System.out.println("I'm Sorry, I wasn't able to find your file");
			}
			return RedditPosts;
				
		}
		void readRedditFileAndPol(String fileToRead)
		{
			System.out.println("ready to read:"+fileToRead);
			try
			{
				FileReader myFileReader=new FileReader(fileToRead);
				BufferedReader myBufferReader= new BufferedReader(myFileReader);
				String line=null;
				while ((line=myBufferReader.readLine())!=null)
				{
					if (findPolarizingTopic(line)==true)
						
						System.out.println("line:"+line);
				}
				System.out.println("exited while:");
				
				
		
				
				
				
			}
			catch (Exception ex)
			{
				System.out.println("I don't think I was able to find your file");
			}
			
	}
	
	

	
	
	
	
	
	
	
}
