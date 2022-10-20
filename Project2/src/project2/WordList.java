package project2;

public abstract class WordList {
	
	public WordNode intNode = new WordNode(null);
	
	public  WordNode first=intNode;
	public  WordNode last=intNode;
    public int length = 0;
    
    public void printList() {
    	
		WordNode p = first;
		while (p.next != null) {
		    
			System.out.println(p.next.data);
		    p = p.next;
		}
    }


}
