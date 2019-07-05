package simpleNondetermin;

import java.util.LinkedList;
import java.util.List;




public class Block {
	List<String> data;
	List<String> choices;
	Block next;
	Block prev;
	Success suc;
	Fail fail;
	String cur;
	
	
	public Block(Express exp) {
		data = new LinkedList<String>(exp.getData());
		choices = new LinkedList<String>(exp.getData());
		next = null;
		prev = null;
		suc = new Success(this);
		fail = new Fail(this);
	}
	
	public String build() {
		// no more choices
		if(choices.size() <1) {
			fail.fail();
		}else {
		    cur = choices.get(0);
			choices.remove(0);
			suc.success(cur, fail);
		}
		return null;
	}

	public void resetChoices() {
		choices = new LinkedList<String>(data);
	}
	public Block getNext() {
		return next;
	}

	public void setNext(Block next) {
		this.next = next;
	}

	public Block getPrev() {
		return prev;
	}

	public void setPrev(Block prev) {
		this.prev = prev;
	}

	public Success getSuc() {
		return suc;
	}

	public void setSuc(Success suc) {
		this.suc = suc;
	}

	public Fail getFail() {
		return fail;
	}

	public void setFail(Fail fail) {
		this.fail = fail;
	}

}

class Express{
	List<String> data;
	public Express(String d) {
		String[] ad = d.split(",");
		data = new LinkedList<String>();
		for(String s : ad) {
			data.add(s);
		}
	}
	public List<String> getData() {
		return data;
	}
	
}



