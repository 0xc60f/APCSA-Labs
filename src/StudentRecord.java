public class StudentRecord {
	private int[] scores;
	
	public StudentRecord(String grades)
	{
		String[] temp = grades.split(" ");
		scores = new int[temp.length];
		for(int i=0; i<temp.length; i++)
			scores[i] = Integer.parseInt(temp[i]);
	}
	
	public double average(int first, int last)
	{
        double sum = 0;
        double average;
		for (int i = first; i <= last; i++) {
            sum += (double) scores[i];
        }
        double amount = (double) (last - first + 1);
        average = (double) (sum / amount);
        return average;
	}
	
	public boolean hasImproved()
	{
		for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
	}
	
	public double finalAverage()
	{
		boolean result = hasImproved();
        if (result == true) {
            return (double) (average(scores.length/2, scores.length - 1));
        } else {
            
            return (double) (average(0, scores.length - 1));
        }
	}
    public static void main(String []args){
        StudentRecord s = new StudentRecord("50 50 20 80 53");
        System.out.println(s.finalAverage());
    }
}
