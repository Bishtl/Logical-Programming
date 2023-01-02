public class FindMissingNoArr {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int sum1=0;
        int sum2=0;
        int result;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        for(int j=0;j<=5;j++){
            sum2 =sum2+j;
        }
        result = sum2-sum1;
        System.out.println("missing number are"+result);
    }
}
