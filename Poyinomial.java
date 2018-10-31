class Polynomial {
  public static void print(Object o){
    System.out.println(o);
  }
	
  public static int square(int x, int a){
    if (a == 0) return 1;
    if (a == 1) return x;
  return x * square(x, a-1);
  }

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int n = 2; 
    int sum = 0;
    int counter = 0;
    for(int i = a.length-1; i >= 0; i--){
      sum = sum + a[counter] *  square(n, i);
      counter++;
   }
    print("the sum is " + sum);
  }
}