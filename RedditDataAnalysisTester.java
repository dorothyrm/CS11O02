
		 import java.io.*;


///What makes a popular post? Analyze profanity,polarizing topics vs other posts
public class RedditDataAnalysisTester {
	public static void main(String[] args) {
		int UpVotes=0;
	 	int x=0;
        int sum=0;
        int sum1=0;
        int sum2=0;
        int sum3=0;
        double average=0;
        double average2=0;
        double average3=0;

        
        
		RedditDataAnalysis myreader =  new RedditDataAnalysis();
		RedditPosts [] posts=myreader.getPostsRedditPol("RedditPosts.txt");
		RedditPosts [] posts1=myreader.getPostsRedditProfanity("RedditPosts.txt");
		int [] numberUpVotes=myreader.getUpvotesNum("numUpvotes");
       
	// Detects Posts that contain Profanity
		int countswear=0;
		System.out.println("Posts containing profanity  ");
		for (int i=0;i<numberUpVotes.length;i++)

		{  
			if(myreader.findProfanity(posts[i].title))
			{
				System.out.println("Post #" +i +": "+posts[i].title);
				System.out.println("Upvotes: "+numberUpVotes[i]);
				UpVotes=numberUpVotes[i];
				sum3+=numberUpVotes[i];
				countswear++;
			}
		
			
		}		
	
	//Detects Posts that contain Polarizing Topics
		System.out.println("Posts containing Polarizing Content ");
        int countpol=0;
		for (int i=0;i<numberUpVotes.length;i++)
		{
			if(myreader.findPolarizingTopic(posts[i].title))
			{
				System.out.println("Post #" +i +": "+posts[i].title);
				System.out.println("Upvotes: "+numberUpVotes[i]);
				UpVotes=numberUpVotes[i];
				sum2+=numberUpVotes[i];
				countpol++;
			}
		
		}		
		
 //Detects Posts that contain both polarizing topics and Profanity 
	    int countboth=0;
		System.out.println("Posts containing both Profanity and Polarizing Topics");
		for (int i=0;i<numberUpVotes.length;i++)
		{
			if(myreader.findPolarizingTopic(posts[i].title) && (myreader.findProfanity(posts[i].title) ))
			{
		
				System.out.println("Post #" +i +": "+posts[i].title);
				System.out.println(" Upvotes: "+numberUpVotes[i]);
				UpVotes=numberUpVotes[i];
				sum1+=numberUpVotes[i];
				countboth++;
			}
		
		}	

	        for( x=0;x<numberUpVotes.length;x++){
	            sum=sum+ numberUpVotes[x];
	        }
	        System.out.println("The average number of upvotes for all posts is : "+(double)sum/numberUpVotes.length);

			 average=sum1/countboth;
			 average2=sum2/countpol;
			 average3=sum3/countswear;
			System.out.println("The average number of upvotes for posts containing both profanity and polarizing topics is : "+ average);
            System.out.println("The average number of upvotes for posts containing polarizing topics is : "+ average2);
            System.out.println("The average number of upvotes for posts conatining just profanity : "+ average3);
            System.out.println("Therefore, the most popular kind of post out off all three catageories  ");
            System.out.println("contained polarizing topics");
	
	}
}

		 
		 
		 
		 
		 
		 
		 
		 
		 
	

	
