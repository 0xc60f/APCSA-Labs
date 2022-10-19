public class CompSciLevel{
    public static void main(String[] args){
        
    }
    public static int compSciLevel(int grade, int level){
        if (grade == 9){
            if (level == 1){
                return 12;
            }
            if (level == 2){
                return 0;
            }
        }
        if (grade == 10){
            if (level == 1){
                return 35;
            }
            if (level == 2){
                return 1;
            }
        }
        if (grade == 11){
            if (level == 1){
                return 45;
            }
            if (level == 2){
                return 17;
            }
        }
        return -1;
    }
}
