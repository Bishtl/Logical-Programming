public class RevNum1 {
    int rev=0;
   void rev(int num){
    while(num!=0){
        rev=rev*10+num%10;
        num=num/10;
    }
    System.out.println("reverse number are"+rev);

   }
   public static void main(String[] args) {
    RevNum1 result = new RevNum1();
    result.rev(12345);
   }

   }

