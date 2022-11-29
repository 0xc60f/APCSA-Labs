public class WordList {
	private String[] myList;
	
	public WordList(String list)
	{
		myList = list.split(" ");
	}
	
	public int numWordsOfLength(int len)
	{
		int count = 0;
		for (int i = 0; i < myList.length-1; i++)
		{
			if (myList[i].length() == len)
			{
				count++;
			}
		}
		return count;
	}
	
	public void removeWordsOfLength(int len)
	{
		int count1 = numWordsOfLength(len);
		String[] newList = new String[myList.length - count1];
		for (int j = 0; j < myList.length; j++)
		{
			if (myList[j].length() != len)
			{
				newList[j] = myList[j];
			}
		}
	}
	
	public String toString()
	{
		String str = "";
		for(String k:myList)
			str+=k+" ";
		return str;
	}
}
