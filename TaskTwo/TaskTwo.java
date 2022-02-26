class TaskTwo{

  public static boolean happy = true;

  public static void main(String [] args) 
  {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }

   sum(20,16);
   stringToUpperCase("Hello everyone!");
   System.out.println(isItUpperCase("Hello"));
 }


// 2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean. 
 public static boolean iAmHappy()
{
  // fill out what is missing here: "the word 'happy' should replace true efter the word return"
  // return true;
  return happy;
}


//2.b Write a function that receives to integers as parameters and returns the sum of them.
public static Integer sum(int a, int b) 
{
  int sum = a +  b;
 // System.out.println("The sum of the two integers is " + sum);
  return sum;
} 

//2.c Write a function that receives a string and returns it as uppercase.
public static String stringToUpperCase(String text)
{
  String result = text.toUpperCase();
  //System.out.println(result);
  return result;
}

//2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" ) */
public static boolean isItUpperCase(String word)
{
  return Character.isUpperCase(word.charAt(0));
    //System.out.println("The first letter in the word " + word + " is an uppercase"); 
}


}