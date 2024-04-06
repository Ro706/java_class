
public class VotingChecker {
	public static void voteFind(int num) throws MyException{
	    if (num < 18){
	      throw new MyException("You Can not vote");
	    }
	    else{
	      System.out.println("You Can't vote");
	    }
	}
}
