public class TwoArrEqual2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={2,3,4,2,4,1};
        int c[]={1,2,3,4,5,6};
        boolean status = true;
        if(a.length==c.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=c[i]){
                    status=false;
                }
            }

        }
        else{
            status=false;
        }
        if(status==true){
            System.out.println("Array is equal");
        }
        else{
            System.out.println("Array is not equal");
        }
    }
}
