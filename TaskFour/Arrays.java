
class Arrays
{
/* 4.a create arrays of the following type and assign it at least 3 different values: 
    - Integer array
    - String array
    - boolean array*/
    public static void main(String[] args) 
    {
        int[] array1 = {12,5,19,93};
        String[] array2 = {"chocolate", "icecream", "candy"};
        boolean[] array3 = new boolean[2];
        printString(array2);
        printSum(array1);
        printAverage(array1);
        sortedArray(array1);
    }
//4.b Write a function that takes in an array of strings as parameter and prints each string.
    public static void printString(String[] food)
    {
        for(int i = 0; i<food.length; i++)
        {
            System.out.println(food[i] + "");
        }
    }
//4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
    public static int printSum(int[] nums)
    {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }
        System.out.println(sum);
        return sum;

    }
//4.d Write a function that receives an integer array as a parameter and returns the average value.   
    public static float printAverage(int[] values)
    {
        float sum = 0;

        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];

        }
        float average = (sum / values.length);
        System.out.println("The averege value is: " + average);
        return average;
    }
//4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
    public static int sortedArray(int[] lowestToHighest)
    {
       for(int i = 0; i < lowestToHighest.length; i++)
       {
        System.out.println("The sorted array is: " + lowestToHighest[i]);
       }

       return Arrays.sort(lowestToHighest);
    }

   
}  
