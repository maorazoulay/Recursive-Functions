import java.lang.Math;
class Main {
  public static void print(Object o)
  {
    System.out.print(o);
  } 
  public static int Max(int[]a, int n){  //Recursive function that finds the max element
    if (n == 1) return a[0]; //if array has only one element, return it as max.
    return Math.max(a[n-1], Max(a, n-1)); 
  }
  
  public static void reversePrint(int[]a,int n){  //Recursive function that prints the elements in reverse
    if(n == 1){     //if there is only one element in the array, print it and exit the function.
      print(a[0]);
      return;     
    }     
    print(a[n-1]); //print last element of the array
    reversePrint(a, n-1);
  }
  public static void main(String[] args) {
    int[] x = {8, 1, 9, 5, 4};
    print(Max(x, 5));
    System.out.println();
    reversePrint(x, 5);
  }
}
