/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public interface IPosfixCalc {
	/**
    @author: José Pablo Kiesling Lange
    Nombre del programa: IPosfixCalc.java
    @version: 
        - Creación: 14/02/2022
        - Última modificación: 15/02/2022

    Interfaz de calculadora
    */ 

	/*****************************************************************
	 * Evaluate: evalúa la expresión ingresada y retorna el resultado
	 * @param expresion
	 * @return int
	 */
	int Evaluate(String expresion);
	//****************************************************************
}
