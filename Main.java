import java.util.*;
class Main {
  public static void main(String[] args) {
    // String[][] childDad = new String[5][2];
    String[][] childDad = {{"luke", "shaw"}, {"wayne", "rooney"}, {"rooney", "ronaldo"}, {"shaw", "rooney"}, {"xyz", "luke"}};
    //System.out.println("Hello world!");
    Scanner obj = new Scanner(System.in);
    
    // Getting an array
    // for ( int i = 0; i < 5; i++ )
      // {
        // for  (int j = 0; j < 2; j++)
          // {
            // childDad[i][j] = obj.nextLine();
          // }
      // }
    // Printing an array
     // for ( int i = 0; i < 5; i++ )
      // {
        // for  (int j = 0; j < 2; j++)
          // {
            // System.out.print(childDad[i][j] + "  ");
          // }
        // System.out.println();
      // }
    System.out.println("Person whom to find grandchild");
    String input = obj.nextLine();
    System.out.println(gettingGrandChildCount(input, childDad));
  }
  static int gettingGrandChildCount(String s, String[][] arr)
  {
    String child = "";
    int grandChild = 0;
    for( int i = 0; i < 5; i++ )
      {
        int j = 1;
        if (s.equals(arr[i][j]))
        {
          child += arr[i][0];
        }
        else
        {
          grandChild = 0;
        }
        
      }
    // System.out.println(child);
    for( int i = 0; i < 5; i++ )
      {
        int j = 1;
        if (child.equals(arr[i][j]))
        {
          grandChild += 1;
        }
        }
    return grandChild;
  }
}