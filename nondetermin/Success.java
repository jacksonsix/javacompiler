package simpleNondetermin;


public class Success{
	Block container;
	public Success(Block cont) {
		this.container = cont;
	}
	public String success(String val, Fail fail) {
		Block next = this.container.getNext();
		if(next == null) {
			fail.leaf();
		}else {
			return next.build();
		}
		return val;
	}
}
