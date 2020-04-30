import java.util.Scanner;

public class StartUp 
{ 
  public static void main (String[] args)
  {
    Scanner kb = new Scanner(System.in);
    
    System.out.println("Enter a word or phrase: ");
    String str = kb.nextLine();
    System.out.println("Enter a positive number: ");
    int num = kb.nextInt();
    
    inputString();
    inputInt();
  }
  
  private static String inputString()
  {
    return str;
  }
  
  private static int inputInt()
  {
    return num;
  }
}
