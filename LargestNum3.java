public class LargestNum3 {
    public static void main(String[] args) {
        int a=23 , b=21 , c=10;

        if(a>b && a>c){
            System.out.println("A is greater than B or C");
        }
        else if(b>a && b>c){
            System.out.println("B is greater than C and A");
        }
        else{
            System.out.println("C is greater");
        }
    }
    
}
