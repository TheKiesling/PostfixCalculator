/**
 * @author moises.alonso
 *
 */
public interface IPosfixCalc {

	/***
	 * This method is used to evaluate a postfix expression
	 * @param expresion this is a single expression like: 1 2 + 4 * 3 +
	 * @return the evaluation of the expression
	 */
	int Evaluate(String expresion);
}
