import java.util.*;
class Main {  
  
  public static void main(String args[]) { 
    // System.out.println("Hello, world!"); 
    int[] arr = {1, 2, 3, 4, 5, 6};
    Scanner ob = new Scanner(System.in);
    // char ch = ob.nextLine().charAt(0);
    
  // for (int i : arr)
    // {
      // System.out.println(-i);
      
    // }
    // System.out.println(ch + "subhashini");
  
  ArrayList<Object> list = new ArrayList<Object>();
  list.add(ob.nextLine());
  list.add(ob.nextLong());
  list.add(ob.nextInt());

  for (Object obj : list)
    {
      System.out.print(obj + " ");
    }
    }
  
}