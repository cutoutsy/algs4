import java.util.*;

public class Evaluate{
	
	public static void main(String[] args){
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		String equation = "(1+((2+3)*(4*5)))";
		for(int i = 0; i < equation.length(); i++){
			String s = String.valueOf(equation.charAt(i));
			if(s.equals("("));
			else if(s.equals("+")) ops.push(s);
			else if(s.equals("-")) ops.push(s);
			else if(s.equals("*")) ops.push(s);
			else if(s.equals("/")) ops.push(s);
			else if(s.equals("sqrt")) ops.push(s);
			else if(s.equals(")")){
				String op = ops.pop();
				double v = vals.pop();
				if (op.equals("+")) v = vals.pop() + v;
				else if (op.equals("-")) v = vals.pop() - v;
				else if (op.equals("*")) v = vals.pop() * v;
				else if (op.equals("/")) v = vals.pop() / v;
				else if (op.equals("sqrt")) v = Math.sqrt(v);
				vals.push(v);
			}
			else vals.push(Double.parseDouble(s));
		}
		System.out.println(vals.pop());
	} 
}
