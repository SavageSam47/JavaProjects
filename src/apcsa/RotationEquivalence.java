package apcsa;

public class RotationEquivalence {
    public static void main(String[] args) {
        System.out.println(rotationallyEquivalent("ABCDE", ""));
    }
    private static String rotate(String s){
        return  s.charAt(s.length()-1) + s.substring(0,s.length()-1);
    }

    public static boolean rotationallyEquivalent(String a, String b){
        String temp = b;
        if(a.equals(b)){
            return true;
        }
        if(a.length()==0||b.length()==0){
            return false;
        }
        for(int x=0;x<a.length();x++){

            if(a.equals(temp)){
                return true;
            }
            temp = rotate(temp);

        }
        return false;
    }

}
