public class Blockbuster {
	//attributes
    private String movie;
    private double price;
    private double cost;
    private int tickets;
    //private double diff;
    private double boxOffice;
    
    //constructor -- look at the instantiation in runner
    public Blockbuster(String m, double c){
        movie = m;
        cost = c;
    }
    //accessor methods -- one for each attribute if necessary
    public String getTitle(){
        return movie;
    }
    //   getNet method -- net does not need to be an attribute
    public double getNet(){
        return (price*tickets)-cost;
    }
    //modifier methods
    //   setBoxOffice method
    public void setBoxOffice(int t, double p){
        tickets = t;
        price = p;
        boxOffice = price*tickets;
    }
    //   diff method
	public double diff(Blockbuster other){
        return Math.abs(getNet()-other.getNet());
    }
    //toString method is provided
	public String toString()
	{
		return String.format("%s\ncost $%.0f\ngrossed $%.0f\nnet $%.0f", movie, cost, boxOffice, getNet());
	}
}
