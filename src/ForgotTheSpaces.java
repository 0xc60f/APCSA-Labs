public class ForgotTheSpaces{
    public static void main(String[] args){
        
    }
    public static String forgotSpaces(String s) {
        int in1 = s.indexOf(".");
        int in2 = s.indexOf(".",in1+1);
        String sNew = s.substring(0,in1+1) + " " + s.substring(in1+1,in2+1) + " " + s.substring(in2+1);
        return sNew;
    }   
}
