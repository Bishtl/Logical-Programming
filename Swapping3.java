public class Swapping3 {
    void swap(int a, int b){
       a=a*b;
       b=a/b;
       a=a/b;
        System.out.println("After swappint value is" +a+" "+b);
    }
    public static void main(String[] args) {
        Swapping3 result = new Swapping3();
        result.swap(10, 20);
    }
}
