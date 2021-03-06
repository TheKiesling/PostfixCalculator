/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public interface IStack<T> {
	/**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Stack.java
    @version: 
        - Creación: 14/02/2022
        - Última modificación: 15/02/2022

    Interfaz de pilas
    */ 

	/*****************************************************************
     * push: agrega un elemento genérico
	 * @param value 
     */
	void push(T value);
	//****************************************************************
	
	/*****************************************************************
     * pull: retorna el último valor ingresado y lo elimina de la pila
     * @return T
     */
	T pull();
	//****************************************************************
	
	/*****************************************************************
     * peek: retorna el último valor de la pila
     * @return T
     */
	T peek();
	//****************************************************************
	
	/*****************************************************************
     * count: retorna el número de elementos en la pila
     * @return int
     */
	int count();
	//****************************************************************
	
	/*****************************************************************
     * isEmpty: retorna el estado de la pila
     * @return boolean
     */
	boolean isEmpty();
	//****************************************************************
}
