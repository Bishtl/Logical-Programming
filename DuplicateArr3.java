import java.util.HashSet;

public class DuplicateArr3 {
    public static void main(String[] args) {
        String a[]={"Java","C","Java","C++"};
        HashSet <String>langs= new HashSet<>();
        boolean flag = false;
        for(String l:a){
            if(langs.add(l)==false){
                System.out.println("Found duplicatte elemnets "+l);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Not found duplicate");
        }
    }
}
