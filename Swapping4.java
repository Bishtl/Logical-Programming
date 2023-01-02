public class Swapping4 {
    void swap(int a, int b){
       b=a+b-(a=b);
        System.out.println("After swappint value is" +a+" "+b);
    }
    public static void main(String[] args) {
        Swapping4 result = new Swapping4();
        result.swap(10, 20);
    }
}

