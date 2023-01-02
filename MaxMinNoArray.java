public class MaxMinNoArray {
    public static void main(String[] args) {
        int a[]={12,32,4,23,21};
        int max=a[0];
        int min = a[0];

        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
             
        }
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
             
        }

        System.out.println("The maximum number are "+max);
        System.out.println("The minimum number is Array are "+min);
    }

}
