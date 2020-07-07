public class PennyProject {
    public static void main(String[] args) {
        int count = 0;
        int total = 20;
        System.out.println("#  D N P");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 21; k++) {
                    if((i*10)+(j*5)+k == total){
                        System.out.println(++count + ". " +i + " " + j + " " + k );
                    }
                }
            }
        }
    }
}
