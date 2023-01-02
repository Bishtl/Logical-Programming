

public class Swapping5 {
    void swap(int a, int b){
       a=a^b;
       b=a^b;
       a=a^b;
        System.out.println("After swappint value is" +a+" "+b);
    }
    public static void main(String[] args) {
        Swapping5 result = new Swapping5();
        result.swap(10, 20);
    }
}
