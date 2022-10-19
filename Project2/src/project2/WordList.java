package project2;

public abstract class WordList {
	
	static WordNode intNode = new WordNode(null);
	
    public WordNode first = intNode;
    public WordNode last = intNode;
    
    public int length = 0;

    public WordList() {
    }
    
    public void printUnsortedList() {
    	
		WordNode p = WordList.intNode;
		while (p.next != null) {
		    
			System.out.println(p.next.data);
		    p = p.next;
		}
    }
    

}