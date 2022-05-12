import java.util.*;
class Main
  {
    public static void main(String[] args)
    {
      
      int[] inputArray = {49, 36, 8, 10, 12};
      int[] weightage = new int[inputArray.length];
      for (int i = 0; i < inputArray.length; i++)
        {
          for ( int j = 0; j < inputArray[i]; j++)
            {
          if ( inputArray[i] == j * j)
          {
            weightage[i] += 5; 
          }
            }
          if ( inputArray[i] % 4 == 0 && inputArray[i] % 6 == 0)
          {
            weightage[i] += 4;
          }
          if( inputArray[i] % 2 == 0 )
          {
            weightage[i] += 3;
          }
        }
      for ( int i = 0; i < weightage.length; i++ )
        {
          System.out.println(weightage[i]);
        }
      // HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
      // for ( int i = 0; i < weightage.length; i++)
      //   {
      //     result.put(inputArray[i], weightage[i]);
      //   }
      //     System.out.println(result);
      // int[] dummy_weight ={12,7,5,3,3};
      Sorting(weightage, inputArray);
      // 
          
      //   }
    }
    static void Sorting(int[] arr, int[] input)
        {
          int[] indexWeightage = new int[arr.length];
          int size = arr.length;
          for (int i = 0; i < size-1; i++)
          {
          int max = i;
            for (int j = i + 1; j < size; j++)
              {
                if (arr[j] > arr[max])
                  {
                    max = j;
                  }
              }
          int temp = arr[max];
          arr[max] = arr[i];
          arr[i] = temp;

          int tempInput = input[max];
          input[max] = input[i];
          input[i] = tempInput;
            }
          
          int[][] resultArray = new int[arr.length][2];

          for(int i = 0; i < resultArray.length; i++)
            {
              resultArray[i][1] = arr[i];
              resultArray[i][0] = input[i];
            }

            for ( int i = 0; i < resultArray.length; i++)
        {
          System.out.println(resultArray[i][0] + " " + resultArray[i][1]);
          
          }
        
        }
  }
  
/*
[5, 12, 3, 3, 7]
[12, 5, 3, 3, 7]
[12, 7, 3, 3, 5]
*/