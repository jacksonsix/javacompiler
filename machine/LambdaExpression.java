package machine;

import java.util.List;

public class LambdaExpression implements IIExpression {
	List<String> paras;
	List<IIExpression> body;
	public LambdaExpression(List<String> paras, List<IIExpression> body) {
		super();
		this.paras = paras;
		this.body = body;
	}
	public List<String> getParas() {
		return paras;
	}
	public void setParas(List<String> paras) {
		this.paras = paras;
	}
	public List<IIExpression> getBody() {
		return body;
	}
	public void setBody(List<IIExpression> body) {
		this.body = body;
	}
	

}
