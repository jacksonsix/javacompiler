package machine;

import java.util.List;

public class CompoundExpression implements IIExpression {
    IIExpression operator;
    List<IIExpression> paralist;
    public CompoundExpression(){}
	public CompoundExpression(IIExpression operator, List<IIExpression> paralist) {
		super();
		this.operator = operator;
		this.paralist = paralist;
	}
	public IIExpression getOperator() {
		return operator;
	}
	public void setOperator(IIExpression operator) {
		this.operator = operator;
	}
	public List<IIExpression> getParalist() {
		return paralist;
	}
	public void setParalist(List<IIExpression> paralist) {
		this.paralist = paralist;
	}
    
    
    
}
