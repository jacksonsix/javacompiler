package machine;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class LowerBox {
	static List<PrimitiveProc> prims;
	public static List<PrimitiveProc> collectPrim() throws NoSuchMethodException, SecurityException{
		prims = new LinkedList<PrimitiveProc>();		
		
		Class[] parameterTypes = new Class[1];
        parameterTypes[0] = LispObject.class;

		Method method1 = LowerBox.class.getMethod("car", parameterTypes);
		PrimitiveProc prim1 = new PrimitiveProc("car",method1);
		prims.add(prim1);
		
		Method method2 = LowerBox.class.getMethod("cdr", parameterTypes);
		PrimitiveProc prim2 = new PrimitiveProc("cdr",method2);
		prims.add(prim2);	
		
		Class[] parameterTypes3 = new Class[2];
        parameterTypes3[0] = Object.class;
        parameterTypes3[1] = Object.class;
		Method method3 = LowerBox.class.getMethod("cons", parameterTypes3);
		PrimitiveProc prim3 = new PrimitiveProc("cons",method3);
		prims.add(prim3);
		
		addOther(prims);
		return prims;
		
		
	}
	
	private static void addOther(List<PrimitiveProc> prims2) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Class[] parameterTypes = new Class[2];
		parameterTypes[0] = Integer.class;
		parameterTypes[1] = Integer.class;
		Method madd = LowerBox.class.getMethod("add", parameterTypes);
		PrimitiveProc proc = new PrimitiveProc("+",madd);
		prims.add(proc);

		Method subadd = LowerBox.class.getMethod("subtract", parameterTypes);
		PrimitiveProc proc1 = new PrimitiveProc("-",subadd);
		prims.add(proc1);
		
	}

	public static  Object car(LispObject o){
		return o.getCar();
	}
	
	public static Object cdr(LispObject o){
		return o.getCdr();
	}
	public static LispObject cons(Object f,Object s){
		return new LispObject(f,s);
	}
	public static int add(Integer a , Integer b) {
		return a+b;
	}
	public static int subtract(Integer a ,Integer b) {
		return a-b;
	}
}


/*
 *     Object[] parameters = new Object[1];
        parameters[0] = message;
        method.invoke(object, parameters);
 */
