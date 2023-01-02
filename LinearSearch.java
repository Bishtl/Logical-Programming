

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={12,32,31,21,231};
        int search = 31;
        boolean flag = false;
        

        for(int i=0;i<a.length;i++){
            if(search==a[i]){
                System.out.println("This number is found index number "+i);
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
        System.out.println("Element not Found");
        }
    }
}
