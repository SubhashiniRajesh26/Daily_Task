import java.util.*;
class Main {
  public static void main(String[] args) 
    //System.out.println("Hello world!");
  {
  Scanner ob = new Scanner(System.in);
  char ch = ob.nextLine().charAt(0);
    // Finding vowels using ifelse statement
  if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    System.out.println("Vowel");
  }
else
  {
    System.out.println("Not Vowel");
  }
    //Finding vowels using switch statement
    switch(ch)
      {
        case 'a':
          System.out.println("Vowel");
          break;
        default:
          System.out.println("Not vowel");
          break;
        case 'e':
          System.out.println("Vowel");
          break;
        case 'i':
          System.out.println("Vowel");
          break;
        case 'o':
          System.out.println("Vowel");
          break;
        case 'u':
          System.out.println("Vowel");
          break;
        
      }


  
}
}