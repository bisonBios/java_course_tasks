package project2;

public class ListTester {

	public static void main(String[] args) {
		SortedWordList b = new SortedWordList();
		UnsortedWordList a = new UnsortedWordList();
		a.append("What");
		b.add("What");
		a.append("No");
		b.add("Now");
		
		
		
		b.printList();
		System.out.println("==================");
		
		
		a.printList();

	}

}
