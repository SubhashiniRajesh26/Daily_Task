class Main
  {
    public static void main(String[] args)
    {
      char[] arr = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
      for ( int i = 0; i < arr.length; i++ )
        {
          for( int j = 0; j <= arr.length; j++)
            {
              if ( i == j)
               System.out.print(arr[i]);
              else if (i + j == arr.length-1)
                System.out.print(arr[j]);
              else
                System.out.print(" ");
              
            }
          
           System.out.println();
         
          
        }
    }
  }