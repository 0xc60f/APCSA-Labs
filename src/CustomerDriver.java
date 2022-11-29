public class CustomerDriver {

	public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result)
	{
        int list1This = 0;
        int list2This = 0;
		for (int i = 0; i<result.length; i++)
        {
            int comparison = list1[i].compareTo(list2[i]);
            if(comparison < 0){
                result[i] = list1[list1This];
                list1This++;
            }
            else if(comparison > 0){
                result[i] = list2[list2This];
                list2This++;
            }
            else{
                result[i] = list1[list1This];
                list1This++;
                list2This++;
            }
        }
	}
}
