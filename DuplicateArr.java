public class DuplicateArr {
    public static void main(String[] args) {
        int a[] ={3,4,2,3,7};
        int arr = a[0];
    

        for(int i=0;i<a.length;i++){
            if(arr==a[i]){
                arr = a[i];
                
            }
            
        }
        System.out.println("The duplicate number are "+arr);
    }
}
