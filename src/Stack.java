/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

import java.util.Vector;

public class Stack <T> implements IStack <T>{
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Stack.java
    @version: 
        - Creación: 15/02/2022
        - Última modificación: 15/02/2022

    Clase que implementa la interfaz de pilas, y sirve como ADT
    */ 

    //---------------------------PROPIEDADES--------------------------
    private Vector<T> vector;

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
     * Stack: instancia el vector
     */
    public Stack (){
        vector = new Vector<T>();
    }
    //****************************************************************

    /*****************************************************************
     * push: agrega un elemento genérico
     * @param value 
     */
    @Override
    public void push(T value) {
        vector.add(value);
    }
    //****************************************************************

    /*****************************************************************
     * pull: retorna el último valor ingresado y lo elimina de la pila
     * @return T
     */
    @Override
    public T pull() {
        T value;
        if (isEmpty()) //Si la pila está vacía
            value = null;
        else{ //Si se tiene algún elemento
            value = peek();
            vector.remove(vector.get(count()-1));
        }
        return value;
    }
    //****************************************************************

    /*****************************************************************
     * peek: retorna el último valor de la pila
     * @return T
     */
    @Override
    public T peek() {
        return vector.lastElement();
    }
    //****************************************************************

    /*****************************************************************
     * count: retorna el número de elementos en la pila
     * @return int
     */
    @Override
    public int count() {
        return vector.size();
    }
    //****************************************************************

    /*****************************************************************
     * isEmpty: retorna el estado de la pila
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
    //****************************************************************
}
