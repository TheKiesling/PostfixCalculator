public class Calculadora implements IPosfixCalc{

    /**
	 * Metodo que permite evaluar una expresion postfix.
	 * @param expresion Expresion a evaluar
	 * @return Resultado
	 */
	public int Evaluate(String datos) {
		int resultado = 0; //variable donde se guardara el resultado de cada operacion
		int operando_1 = 0; //variable donde se guarda el primer valor a obtener del stack
		int operando_2 = 0; //variable donde se guarda el segundo valor a obtener del stack
		String[] lista = datos.split(" ");
		StackArrayList<Integer> stack = new StackArrayList<>(); //Se crea el stack
		for (int caracter = 0; caracter < lista.length; caracter++) { //Se recorre toda la expresion postfix
			if (lista[caracter].equals("+") || lista[caracter].equals("-") || lista[caracter].equals("*") || lista[caracter].equals("/")) { //Si el caracter es un signo
				String signo = lista[caracter];
				if (stack.count()>1) { //Primero se determina si hay suficientes operandos

                    //Suma
					if (signo.equals("+")) {
						operando_1 = stack.pull();
						operando_2 = stack.pull();
						resultado = operando_2 + operando_1; //Se realiza la suma de los dos ultimos operandos dentro del stack y se guarda el resultado en el mismo
						stack.push(resultado);
					}

                    //Multiplicacion
					else if (signo.equals("*")) {
						operando_1 = stack.pull();
						operando_2 = stack.pull();
						resultado = operando_2 * operando_1;
						stack.push(resultado); //Se realiza el producto de los dos ultimos operandos dentro del stack y se guarda el resultado en el mismo
					}

                    //Resta
					else if (signo.equals("-")) {
						operando_1 = stack.pull();
						operando_2 = stack.pull();
						resultado = operando_2 - operando_1;
						stack.push(resultado); //Se realiza la resta de los dos ultimos operandos dentro del stack y se guarda el resultado en el mismo
					}

                    //Division
					else if (signo.equals("/")) { //Se realiza la division de los dos ultimos operandos dentro del stack y se guarda el resultado en el mismo
						operando_1 = stack.pull();
						operando_2 = stack.pull();
						resultado = operando_2 / operando_1;
						stack.push(resultado);
					}
				}
				else {
					resultado = 9999999; //Si no hay suficientes operandos para una operacion, se rompe el ciclo
					break;
				}
				
			}
			else {
				stack.push(Integer.parseInt(lista[caracter])); //Si el caracter es un operando, unicamente se guarda en el stack
			}
			
		}
		return resultado; //Se devuelve el resultado
	}

}