import java.util.Arrays;
class Main{
     public static void main (String[]arg)  {
    int count = 0;
    int[] arr = { 10, 20, 11, 12, -6 };
    Arrays.sort (arr);
    System.out.println (arr[0]);
    System.out.println (arr[1]);
    System.out.println (arr[arr.length / 2]);
    System.out.println (arr[arr.length - 1]);
    System.out.println (arr[arr.length - 2]);
    
    int sum = 0;

    for (int i = 0; i < arr.length; i++)
      {
	sum = sum + arr[i];
      }
    System.out.println ("Sum of all the elements of an array: " + sum);
    if (sum % 2 == 0)
      {
	System.out.println ("even");
      }
    else
      {
	System.out.println ("odd");
      }
    sum = sum / 2;
    System.out.println (sum);
    if (sum % 2 == 0)
      {
	System.out.println ("even");
      }
    else
      {
	System.out.println ("odd");
	System.out.println (sum * 2);
	if ((sum * 2) % 2 == 0)
	  {
	    System.out.println ("even");
	  }
	else
	  {
	    System.out.println ("odd");
	  }
      }
  }
}
