package machine;

public class SymbolExpression implements IIExpression {
	String name;
	ILispObject value;
	public SymbolExpression(){}
	public SymbolExpression(String name) {
		super();
		this.name = name;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getValue(Env env) {
		try {
			Object o =  env.search(this.name);
			return o;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return value;
	}
	public void setValue(ILispObject value) {
		this.value = value;
	}
	
	
	

}
