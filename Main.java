import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    // Problem 1
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter two integers: ");
    int int1 = scan.nextInt();
    int int2 = scan.nextInt();

    int index = int1;
    while (index <= int2)
    {
      if (index % 2 == 1)
      {
        System.out.print(index + " ");
      }
      index ++;
    }
    System.out.println("");


    // Problem 2 
    System.out.print("\nEnter a positive integer: ");
    int pos = scan.nextInt();

    int counter = pos;
    while (counter > 0)
    {
      System.out.println(counter % 10);
      counter /= 10;
    }



    // Problem 3
    System.out.print("\nEnter a positive integer: ");
    int num = scan.nextInt();

    int count = num;
    int tentracker = 1;
    int output;
    while (count > 0)
    {
      output = count % 10;
      System.out.println(output * tentracker);
      count /= 10;
      tentracker *= 10;
    }




  }
}
