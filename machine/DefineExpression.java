package machine;

public class DefineExpression implements IIExpression {
    String name;
    IIExpression val;
    public DefineExpression() {}
    public DefineExpression(String name, IIExpression val) {
    	this.name = name;
    	this.val= val;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IIExpression getVal() {
		return val;
	}
	public void setVal(IIExpression val) {
		this.val = val;
	}
    
}
