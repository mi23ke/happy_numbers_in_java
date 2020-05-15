import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Happy{
  public static void main(String args[]) throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String n = " ";
    String m = "q";
    System.out.println("\nThis program checks to see if the number provided by the"
    + " user is a happy number.\n");
    while(!(n.equals(m))) {
      System.out.print("Please enter a numeric value: ");
      int num = 0, temp, sum=0;
      ArrayList<Integer> numList = new ArrayList<Integer>();
      n = reader.readLine();
      try{
        num = Integer.parseInt(n);
      }
      catch (NumberFormatException nfe){
        System.out.println("Input error. Please enter a numeric value.");//+nfe.getMessage());
      }
      temp = num;
      do{
        sum = squareSum(temp);
        if(sum==1)System.out.println(num+" : is a Happy Number!\n");
        if(numList.contains(sum) || sum==0){
          sum = 0;
          System.out.println(num+" : is not a Happy Number!\n");
        }
        numList.add(sum);
        temp = sum;
      }while(sum!=1 && sum!=0);
    }

  }

  public static int squareSum(int n){
    int temp, sum=0;
    while(n>0){
      temp = n%10;
      temp = temp*temp;
      sum += temp;
      n = n/10;
    }
    return sum;
  }
}
