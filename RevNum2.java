public class RevNum2 {
    StringBuffer rev;
    void rev(int num){
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        rev = sb.reverse();
        System.out.println("Reverse value are "+rev);

    }
    public static void main(String[] args) {
        RevNum2 result = new RevNum2();
        result.rev(231);
    }
}
