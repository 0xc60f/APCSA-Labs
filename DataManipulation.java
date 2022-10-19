public class DataManipulation {
	public static void main(String args[])
	{
		int num1 = 475;
		int num2 = 599;
		int num3;
		
		double val1 = 900.87;
		double val2 = 276.214;
		double val3;
		
		char let1 = 'K';
		char let2 = 't';
		char let3;
	
		
        num3 = num1 + num2;
        System.out.println(num3);
        System.out.println(num1 + " + " + num2 + " = " + num3);
        val3 = val1 + val2;
        System.out.println(val3);
        System.out.println(val3 + " = " + val1 + " + " + val2);
        let3 = (char) (let1 + let2);
        System.out.println(let3);
        System.out.println(let1 + let3);
        System.out.println(let1 + " " + let2);
        System.out.println(val3 + " = " + num1 + " + " + val2);
        
        
    }
}