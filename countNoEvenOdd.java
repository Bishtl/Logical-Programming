public class countNoEvenOdd {
    public static void main(String[] args) {
        int num=11223;
        
        int odd = 0;
        int even = 0;
        while(num>0){
            int count = num%10;
            if(count%2==0){
                even++;
               
            }
            else{
                odd++;
                
            }
                num= num/10;
        }
        System.out.println("Even "+even+" "+"Odd "+odd);
        
    }
}
