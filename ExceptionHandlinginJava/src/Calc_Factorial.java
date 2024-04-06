public class Calc_Factorial{
  public static void findFact(int num) throws MyException{
    if (num < 0){
      throw new MyException("Can not calculate the factorial of the negative number");
    }
    else{
      int fact =  1;
      for (int i = 1 ; i <= num;i++){
        fact = fact*i;
      }
      System.out.println("Factorial is = "+fact);
    }
  }
}
