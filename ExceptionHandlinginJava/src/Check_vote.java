public class Check_vote{
  public static void findFact(int num) throws MyException{
    if (num < 18){
      throw new MyException("You can't able to vote ");
    }
    else{
      System.out.println("you can vote");
    }
  }
}
