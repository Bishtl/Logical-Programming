public class DuplicateArr2 {
    public static void main(String[] args) {
        String a[]={"Java","C","Java","C++"};
        String arr=a[0];

        for(int i=1;i<a.length;i++){
            if(arr==a[i]){
                arr=a[i];
            }
        }
        System.out.println("The duplicate elements are "+arr);
    }
}
