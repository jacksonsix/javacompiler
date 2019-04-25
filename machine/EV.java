package machine;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

public class EV {
    private void  log(String str){
    	System.out.println(str);
    }
	public Object eval(Object exp, Env env) throws Exception{
		String type="";
		if( exp instanceof  IIExpression){
		   type= exp.getClass().getSimpleName();	
		}		
		else{		
			return exp;
		}
		switch(type){
		case "SelfExpression":
			return ((SelfExpression)exp).getValue();
		case "VaribleExpression":
			return ((VaribleExpression)exp).getValue(env);
		case "DefineExpression":
			EvalDefineExpression((DefineExpression)exp,env);
			return "ok";
		case "SetExpression":
			EvalSetExpression((SetExpression)exp,env);
			return "ok";
		case "IfExpression":
			log("If");
			return EvalIf((IIExpression)exp, env);	
		case "LambdaExpression":
			log("lambada");
			return EvalLambda((IIExpression)exp,env);
		case "SequenceExpression":
			log("body sequence");
			return EvalSequenceExpression((IIExpression)exp,env);
		case "CompoundExpression":
			Object lexp = ((CompoundExpression)exp).getOperator();
			
			ILispObject proc = (ILispObject)eval(lexp,env);
			List<IIExpression> paras = ((CompoundExpression)exp).getParalist();
			List<Object> objs = new LinkedList<Object>();
			if(paras != null){
				for(IIExpression ex: paras){
					Object o = eval(ex,env);
					objs.add(o);
				}
			}
			return apply(proc,objs,env);		
		default:
			log("something wrong, not in eval scope");
			throw new Exception("");
		}
	}
	
	
	private void EvalSetExpression(SetExpression exp, Env env) throws Exception {
		String name = exp.getName();
		IIExpression val = exp.getVal(); 
		Object o =  eval(val,env);
		env.setVarible(name, o);
		
	}
	private void EvalDefineExpression(DefineExpression exp, Env env) throws Exception {
		// TODO Auto-generated method stub
		String name = exp.getName();
		IIExpression val = exp.getVal(); 
		Object o =  eval(val,env);
		env.defineVarible(name, o);
	}
	private Object EvalSelf(IIExpression exp, Env env){
		log("self value");
		
		return null;
	}
	private Object EvalIf(IIExpression exp, Env env) throws Exception{
		log("Eval If");
		IfExpression iexp = (IfExpression)exp;
		IIExpression pred = iexp.getPredicate();
		IIExpression alt = iexp.getAlternate();
		IIExpression first = iexp.getFirstexp();
		
		if(eval(pred,env) == False.value()){
			return eval(alt,env);
		}else{
			return eval(first,env);
		}
		
	}
	
	private Object EvalSequenceExpression(IIExpression exp, Env env) throws Exception{
		List<IIExpression> exps = ((SequenceExpression)exp).getSequence();
		return rEvalSequenceExpression(exps,env);
	}
	private Object rEvalSequenceExpression(List<IIExpression> exps, Env env) throws Exception{
		if(exps == null) return IIExpression.NullExpression();
		
		IIExpression first = exps.get(0);
		if(first == null){
			return IIExpression.NullExpression();
		}else if(exps.size() == 1){
			return eval(first,env);
		}else {
			eval(first,env);
			exps.remove(0);
			return rEvalSequenceExpression(exps, env);
		}
	}
	private Object EvalLambda(IIExpression exp, Env env){
		log("Eval Lambda");
		LambdaExpression lexp = (LambdaExpression)exp; 
		List<String> paras = lexp.getParas();
		List<IIExpression> body = lexp.getBody();
		Procedure proc = new Procedure(env,paras,body);
		return proc;
	}
	
	public Object apply(ILispObject proc,List<Object> args, Env env) throws Exception{
		log("apply");
		if(proc instanceof PrimitiveProc){
			return applyPrimitive((PrimitiveProc)proc,args, env);
		}else{
			log("compound");
			SequenceExpression cbody = ((Procedure)proc).getBody();
			Env defenv = ((Procedure)proc).getEnv();
			if(args.size() > 0){
				defenv = defenv.Extend(defenv, ((Procedure)proc).getParas(), args);
			}			
			return eval(cbody,defenv);			
		}
	}
	
	private Object applyPrimitive(PrimitiveProc proc,List<Object> paras, Env env) throws Exception{
		log("prim apply");
        int size = paras.size();
        Object[] parameters = new Object[size];
        for(int i=0;i< size; i++){
        	 parameters[i] =  paras.get(i);
        }
       
        Object test = proc.getProc().invoke(LowerBox.class,parameters);
		return test;
	}
	
}
