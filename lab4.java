
public class lab4 {

	private static String fav = "AAA, BBB, CCC";
	
	public static void main(String[] args) 
	{
		printMovie();
		System.out.println();
		printMovie(1, "EEE");
		System.out.println();
		printMovie("EEE,AAA,BBB");
		System.out.prinnt(fav);
	}
	
	//question 1
	public static void printMovie()
	{
		String[] names = {"AAA", "BBB", "CCC", "DDD"};
		for(int i = 0; i < names.length ; i++)
		{
			System.out.println(i + ". " + names[i]);
		}
	}
	
	//question 2
	public static void printMovie(int rank, String name)
	{
		System.out.println(rank + ". " + name);
	}

	//question 3
	public static boolean isFav(String name){
		boolean result = fav.contains(name);

		return result;
	}

	//question 4
	public static void printMovie(String names){
		//"AAA, BBB, CCC"
		String[] arr = names.split(",");
		for (int i=0; i<arr.length; i++){
			System.out.println(i+". "+arr[i]);
		}
	}

}
