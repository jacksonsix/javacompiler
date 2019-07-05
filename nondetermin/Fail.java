package simpleNondetermin;


public class Fail{
	Block container;
	public Fail(Block cont) {
		this.container = cont;
	}
	public void fail() {
		System.out.println(container.cur+"back");
		Block prev = this.container.getPrev();
		if(prev != null) {
			// reset choices
			 container.resetChoices();
			 prev.build();
		}
		  
	}
	
	public void leaf() {
		System.out.println(container.cur+"leaf");
        container.build();
	
	}
}
