/* Given an object containing counts of both upvotes and downvotes, 
return what vote count should be displayed. This is calculated by subtracting the number of downvotes from upvotes. */


public class Votes {
	public static int getVoteCount(int upvotes,int downvotes) {
		return upvotes-downvotes;
	}
}
