class Main {
  public static void main(String[] args) {

    System.out.println(fibonacci(5));
  }
  
  
  // 1 1 2 3 5 8 13 21 34 55 
  static int fibonacci(int n){
    if(n<= 1){
      return n;
    }
    int sum = fibonacci(n-1) + fibonacci(n-2);
    System.out.println(sum);
    return sum;
  }

}
