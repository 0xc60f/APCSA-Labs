public class ConditionalsAndMethods{
    public static void main(String[] args){

    }
    public static String numberSize(int int1, int int2){
        if (int1 < int2 || int1 == int2){
            return "SMALL";
        }
        else{
            return "LARGE";
        }
    }
    public static String planetNumber(int int1){
        if (int1 == 1){
            return "MERCURY";
        }
        else if (int1 == 2){
            return "VENUS";
        }
        else if (int1 == 3){
            return "EARTH";
        }
        else if (int1 == 4){
            return "MARS";
        }
        else if (int1 == 5){
            return "JUPITER";
        }
        else if (int1 == 6){
            return "SATURN";
        }
        else if (int1 == 7){
            return "URANUS";
        }
        else if (int1 == 8){
            return "NEPTUNE";
        }
        else{
            return "NOT A PLANET";
        }
    }
    public static boolean isGenX(int int1){
        if (int1 >= 1965 && int1 <= 1984){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isOdd(int int1){
        if (int1 % 2 == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static int product(int int1, int int2, int int3, int int4){
        int product = 1;
        if (int1 % 3 == 0){
            product *= int1;
        }
        if (int2 % 3 == 0){
            product *= int2;
        }
        if (int3 % 3 == 0){
            product *= int3;
        }
        if (int4 % 3 == 0){
            product *= int4;
        }
        if (product != 1){
            return product;
        }
        else{
            return 0;
        }
    }
    public static int smallestOf5(int int1, int int2, int int3, int int4, int int5){
        int smallest = int1;
        if (int2 < smallest){
            smallest = int2;
        }
        if (int3 < smallest){
            smallest = int3;
        }
        if (int4 < smallest){
            smallest = int4;
        }
        if (int5 < smallest){
            smallest = int5;
        }
        return smallest;
    }
}
