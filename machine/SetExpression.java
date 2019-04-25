package machine;

public class SetExpression implements IIExpression {
	String name;
	IIExpression val;
	public SetExpression() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SetExpression(String name, IIExpression val) {
		super();
		this.name = name;
		this.val = val;
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
