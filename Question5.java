import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    System.out.print("Enter a number: ");
    Scanner in = new Scanner(System.in);
    int numinput = in.nextInt();

    int[] numbers = new int[numinput];
    for (int l = 0; l<numinput; l++){
      System.out.print("Enter another number: ");
      Scanner in2 = new Scanner(System.in);
      int currentnum = in2.nextInt();
      numbers[l] = currentnum;
    }

    int mode = 0;
    int modecount = 0;
    for (int i = 0; i< numinput; i++){
      int count = 0;

      for (int j = 0; j<numinput; j++){
        if (numbers[j] == numbers[i]) count++;
      }

      if (count>modecount){
        modecount = count;
        mode = numbers[i];
      }

      }
      System.out.print(mode);

    }
}
