/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Calculator implements IPosfixCalc{
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Calculator.java
    @version: 
        - Creación: 15/02/2022
        - Última modificación: 15/02/2022

    Clase que implementa la interfaz de IPosfixCalc, y sirve como ADT
    */ 

    //---------------------------PROPIEDADES--------------------------
    private Stack<Integer> stack;
    private String[] operands = {"0", "1", "2","3","4","5","6","7","8","9"};
    private String[] operators = {"+","-","*","/"};

    //---------------------------MÉTODOS------------------------------
    public Calculator(){
        stack = new Stack<Integer>();
    }

    /*****************************************************************
	 * Evaluate: evalúa la expresión ingresada y retorna el resultado
	 * @param expresion
	 * @return int
     * @Override
	 */
    public int Evaluate(String expresion) {
        int num1, num2, finalResult = 0;

        try{
            String[] values = expresion.split(" ");
            for(int i = 0; i < values.length; i++){
                String value = values[i];
                
                if(searchOperands(value)) //Número
                    stack.push(Integer.parseInt(value));

                else if(searchOperators(value)){ //Operador
                    num2 = stack.pull();
                    num1 = stack.pull();
                    switch(value){
                        case "+": //Suma
                            stack.push(num1 + num2);
                        break;

                        case "-": //Resta
                            stack.push(num1 - num2);
                        break;

                        case "*": //Multiplicación
                            stack.push(num1 * num2);
                        break;

                        case "/": //División
                            stack.push(num1 / num2);
                        break;
                    }
                }
                else
                    throw new NumberFormatException(); //Carácter inválido
            }
            if (stack.count() == 1) //Si ya solo queda un elemento en la pila
                finalResult = stack.pull();
            else
                throw new Exception(); //Falta un operador

        //---Excepciones---
        } catch (ArithmeticException e){
            System.err.println("¡ERROR! Su operación es una división entre 0!");
        } catch (NumberFormatException e){
            System.err.println("¡ERROR! Ha ingresado un carácter inválido!");
        } catch (NullPointerException e){
            System.err.println("¡ERROR! Le han faltado operandos!");
        } catch (Exception e){
            System.err.println("¡ERROR! Le han faltado operadores!");
        }

        return finalResult;
    }
    //****************************************************************

    /*****************************************************************
     * searchOperatonds: busca si el valor ingresado es un operando
     * @param value
     * @return boolean
     */
    private boolean searchOperands(String value){
        boolean flag = false;
        for(int i = 0; i < operands.length && flag == false; i++){
            if(value.equals(operands[i])) 
                flag = true;
        }
        return flag;
    }
    //****************************************************************

    /*****************************************************************
     * searchOperators: busca si el valor ingresado es un operador
     * @param value
     * @return boolean
     */
    private boolean searchOperators(String value){
        boolean flag = false;
        for(int i = 0; i < operators.length && flag == false; i++){
            if(value.equals(operands[i])) 
                flag = true;
        }
        return flag;
    }
    //****************************************************************
    
}
