/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 * 
 */

 class TaskSix 
{
  public static void main(String[] args) 
  {
    int a = 7;
    int b = 42;

    int minimum = Math.min(a,b);

    if ( minimum == a) 
    {
      System.out.println(a + " is the smallest!");
    }
  }

  public static void minimum(int a, int b) 
  {
    int minimum = Math.min(a,b);

    if (a <  b) 
    {
        a = minimum;
    } 
    else 
    {
        b = minimum;
    }
    
  }
}