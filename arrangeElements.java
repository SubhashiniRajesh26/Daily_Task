class Main
  {
    public static void main(String[] args)
    {
      int[] inputArray = {1, 2, 3, 4, 5, 6};
      rearrangeArray(inputArray);
      
    }
    static void rearrangeArray(int[] inputArray)
    {
      
      // int[] outputArray = new int[inputArray.length];
      int startIndex = 0;
      int endIndex = inputArray.length-1;
      int midIndex = startIndex + (endIndex - startIndex) / 2;
      // System.out.println(midIndex);
      // int[] leftArray = new int[midIndex+1];
      // int[] rightArray = new int[midIndex];
      int k = 0;
      if ( inputArray.length % 2 != 0 )
      {
         k = inputArray.length - 1;
      }
      else if (inputArray.length % 2 == 0)
      {
          k = inputArray.length - 2;
      }
      for (int i = 0 ; i < midIndex + 1; i++)
        {
          int tempIndex = inputArray[0];
          for ( int j = 0; j < k; j++)
            {
              inputArray[j] = inputArray[j+1];
            }
          inputArray[k] = tempIndex;
          k -= 2;
          
          }
      for (int i = 0; i < inputArray.length; i++)
        {
          System.out.println(inputArray[i]);
        }
    }
  }