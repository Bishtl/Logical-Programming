

public class Swapping2 {
    void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swappint value is" +a+" "+b);
    }
    public static void main(String[] args) {
        Swapping2 result = new Swapping2();
        result.swap(10, 20);
    }
}


