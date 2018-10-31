class Main {
	//Returns n! (factorial)
  public static int fact(int n){
  if (n == 0) return 1;
  return n * fact(n-1);
}
//Returns nth power of integer a
public static int exp(int a, int n){ 
  if (n == 0) return 1;
  return a * exp(a, n-1);
}
//Returns nth term in fibonacci sequence 
public static int fib(int n){ 
  if (n == 0) return 0;
  if (n == 1) return 1;
  return fib(n-1) + fib(n-2);
}
//Returns greatest common divisor
public static int gcd(int a, int b){
  if (a == 0) return b;
  return gcd(b % a, a);
}
//Computes n*x with addition only
public static int find(int n, int x){
 if(x == 0) return 0;
 return n + find(n, x-1);
}
//Computes a^2n
public static int exp2(int a, int n){ 
  if(n == 1) return a*a;
  return a*a * exp2(a, n-1);
}

  public static void main(String[] args) {
    int n = 0;
    int factorial = fact(n);
    int exponent = exp(0, 5);
    int fibonacci = fib(5);
    int GCD = gcd(12,17);
    int sum = find(2,10);
    int EXP = exp2(3,2);
    System.out.println(EXP);
  }
}
