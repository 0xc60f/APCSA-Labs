public class Customer implements Comparable<Customer> {
	
	private String name;
	private int id;
	
	public Customer(String name, int idNum)
	{
		this.name = name;
		id = idNum;
	}
	
	public String getName() {return name;}
	public int getID() {return id;}
	
	public int compareCustomer(Customer other)
	{
		String name1 = this.getName();
        String name2 = other.getName();
        int id1 = this.getID();
        int id2 = other.getID();
        if(name1.compareTo(name2) == 0){
            if(id1 > id2){
                return id1 - id2;
            }
            else if(id1 < id2){
                return id1 - id2;
            }
            else{
                return 0;
            }
        }
        else{
            return name1.compareTo(name2);
        }

	}
	
	public String toString()
	{
		return name+" "+id;
	}

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
