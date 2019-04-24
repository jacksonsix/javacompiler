package machine;

public class IfExpression implements   IIExpression{
   IIExpression predicate;
   IIExpression firstexp;
   IIExpression alternate;
   public IfExpression(){}
public IfExpression(IIExpression predicate, IIExpression firstexp, IIExpression alternate) {
	super();
	this.predicate = predicate;
	this.firstexp = firstexp;
	this.alternate = alternate;
}

public IIExpression getPredicate() {
	return predicate;
}
public void setPredicate(IIExpression predicate) {
	this.predicate = predicate;
}
public IIExpression getFirstexp() {
	return firstexp;
}
public void setFirstexp(IIExpression firstexp) {
	this.firstexp = firstexp;
}
public IIExpression getAlternate() {
	return alternate;
}
public void setAlternate(IIExpression alternate) {
	this.alternate = alternate;
}
   
}
