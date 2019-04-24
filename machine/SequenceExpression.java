package machine;

import java.util.LinkedList;
import java.util.List;

public class SequenceExpression implements IIExpression {
    List<IIExpression> exps;
    public SequenceExpression(){
    	exps = new LinkedList<IIExpression>();
    }
    public SequenceExpression(List<IIExpression> exps){    	
    	this.exps = exps;
    }
	public List<IIExpression> getSequence(){
		return exps;
	}
}
