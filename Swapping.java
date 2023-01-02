class Swapping{
    int temp=0;
    void swap(int a, int b){
      temp=a;
      a=b;
      b=temp;

       System.out.println("After swapping value are " +a+ " " +b);

    }
    public static void main(String[] args) {
        

        Swapping result = new Swapping();
        result.swap(22, 33);
        
        
        
    }
}