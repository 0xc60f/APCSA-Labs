import static java.lang.System.*;
import java.util.*;

public class Presidents {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(in);
		int year;
		String x;
		
		year = input.nextInt();
		x = getPresident(year);
		out.println(x);
		input.close();
	}

    public static String getPresident(int year){
		String president = "";
        int count = 0;
        if (year >= 1900 && year <= 1901){
            president += "William McKinley ";
			count += 1;
        }
		if (year >= 1901 && year <= 1909){
            president += "Theodore Roosevelt ";
			count += 1;
        }
		if (year >= 1909 && year <= 1913){
            president += "William Taft ";
			count += 1;
        }
		if (year >= 1913 && year <= 1921){
            president += "Woodrow Wilson ";
			count += 1;
        }
		if (year >= 1921 && year <= 1923){
			president += "Warren Harding ";
			count += 1;
		}
		if (year >= 1923 && year <= 1929){
			president += "Calvin Coolidge ";
			count += 1;
		}
		if (year >= 1929 && year <= 1933){
			president += "Herbert Hoover ";
			count += 1;
		}
		if (year >= 1933 && year <= 1945){
			president += "Franklin Roosevelt ";
			count += 1;
		}
		if (year >= 1945 && year <= 1953){
			president += "Harry Truman ";
			count += 1;
		}
		if (year >= 1953 && year <= 1961){
			president += "Dwight Eisenhower ";
			count += 1;
		}
		if (year >= 1961 && year <= 1963){
            president += "John Kennedy ";
			count += 1;
        }
		if (year >= 1963 && year <= 1969){
			president += "Lyndon Johnson ";
			count += 1;
		}
		if (year >= 1969 && year <= 1974){
			president += "Richard Nixon ";
			count += 1;
		}
		if (year >= 1974 && year <= 1977){
			president += "Gerald Ford ";
			count += 1;
		}
		if (year >= 1977 && year <= 1981){
			president += "Jimmy Carter ";
			count += 1;
		}
		if (year >= 1981 && year <= 1989){
			president += "Ronald Reagan ";
			count += 1;
		}
		if (year >= 1989 && year <= 1993){
			president += "George Bush ";
			count += 1;
		}
		if (year >= 1993 && year <= 2001){
			president += "Bill Clinton ";
			count += 1;
		}
		if (year >= 2001 && year <= 2009){
			president += "George W. Bush ";
			count += 1;
		}
		if (year >= 2009 && year <= 2017){
			president += "Barack Obama ";
			count += 1;
		}
		if (year >= 2017 && year <= 2021){
			president += "Donald Trump ";
			count += 1;
		}
		if (year >= 2021 && year <= 2025){
			president += "Joseph Biden ";
			count += 1;
		}
		if (count == 0){
			president += "Not a valid year";
		}
		if (count == 1){
			president = president.substring(0, president.length() - 1);
		}
		if (count == 2){
			int index = president.indexOf(" ", president.indexOf(" ") + 1);
			String president1 = president.substring(0, index);
			String president2 = president.substring(index + 1, president.length() - 1);
			president = president1 + " and " + president2;
		}
		return president;
	}
}
