import java.util.Arrays;

public class TwoArrEqual {
    public static void main(String[] args) {
       int a[]={2,4,7,3,8};
       int b[]={3,4,6,2,7};
       int c[]={2,4,7,3,8};

       boolean arr = Arrays.equals(a, c);
       if(arr==true){
        System.out.println("Array is equal");
       }
       else{
        System.out.println("Array is not equal");
       }
       
    }
}
