public class Questions {
    public static void main(String[] args) {
        String s = "ABCDEFGH";
        String insertion = "BB";
        int pos = 3;
        String builder = s.substring(0,pos) + insertion + s.substring(3);
        System.out.println(builder);
    }
}
