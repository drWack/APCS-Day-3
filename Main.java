import java.util.*; //arraylist,collection,random

class Main {
  public static void main(String[] args) {

    String[] words = {"aint ", "gon", "happen","white","purple"};
    
    //function that we give base and power, then computes b^p recursively
    power(2,100);
  

  }
  
  
  static int fibonacci(int n){
    // 1 1 2 3 5 8 13 21 34 55 
    if(n<= 1){
      return n;
    }
    int sum = fibonacci(n-1) + fibonacci(n-2);
    System.out.println(sum);
    return sum;
  }

  static long power(long  b, long p){ // b * b ... * b 
    if(p == 0){
      return 1;
    }

    
    long num =b*power(b,p-1); //x^n  == x*(x^n-1)
    System.out.println(num);

    return num;
    

  }

}
class randomStringChooser{ 

  private ArrayList<String> wordList;

  public randomStringChooser(String[] wordArray){

    wordList = new ArrayList<String>();
    
    for(String word : wordArray){
      wordList.add(word);
    }
  }

  public String getNext(){
    Random myrand = new Random();

      if(wordList.size() <= 0){
        return "NONE";
      }
      else{
        int maxsize = wordList.size();
        double randDub = myrand.nextDouble();
        int indexToRemove = (int)(maxsize*randDub);

        return wordList.remove(indexToRemove);
      }
  }
}