public class StandardizedGrading{
    public static void main(String[] args){

    }
        public static String getGrade(int grade){
            if (grade >= 93){
                return "A+";
            }
            else if (grade >= 90 && grade <= 92){
                return "A";
            }
            else if (grade >= 87 && grade <= 89){
                return "B+";
            }
            else if (grade >= 83 && grade <= 86){   
                return "B";
            }
            else if (grade >= 80 && grade <= 82){
                return "B-";
            }
            else if (grade >= 77 && grade <= 79){
                return "C+";
            }
            else if (grade >= 73 && grade <= 76){
                return "C";
            }
            else if (grade >= 70 && grade <= 72){
                return "C-";
            }
            else if (grade >= 67 && grade <= 69){
                return "D+";
            }
            else if (grade >= 63 && grade <= 66){
                return "D";
            }
            else if (grade >= 60 && grade <= 62){
                return "D-";
            }
            else{
                return "F";
            }
    }

}


