package simpleNondetermin;

import java.util.LinkedList;
import java.util.List;

public class TestBlock {
	
	
	public static void main(String[] args) {
		List<Express> codes = preparedata();
		Block start = buildAll(codes);
		start.build();
	}
	
	private static Block buildAll(List<Express> data) {
		Block head = null;
		Express ex = data.get(0);
		head = new Block(ex);
		
		
		for(int i=1;i< data.size();i++) {
			Express ex1 = data.get(i);
		    Block next = new Block(ex1);
		    connect(head,next);
		    
		}
		
		return head;
	}
	private static void connect(Block a, Block b) {
		a.setNext(b);
		b.setPrev(a);
	}
	
	
	private static List<Express> preparedata(){
		String a = "1,2,3";
		String b = "4,5";
		
		List<Express> initd = new LinkedList<Express>();
		initd.add(new Express(a));
		initd.add(new Express(b));
		
		return initd;
		
	}

}
