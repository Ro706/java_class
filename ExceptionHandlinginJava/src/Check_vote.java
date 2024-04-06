public class Check_vote{
  public static void findvote(int num) throws AgeException{
    if (num < 18){
      throw new AgeException("You can't able to vote ");
    }
    else{
      System.out.println("you can vote");
    }
  }
}
