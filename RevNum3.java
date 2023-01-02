public class RevNum3 {
    void rev(int num){
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder reverse =  sb.reverse();
        System.out.println("reverse value are"+reverse);
    }
    public static void main(String[] args) {
        RevNum3 result = new RevNum3();
        result.rev(342);
    }
}
