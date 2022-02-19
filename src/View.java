/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class View {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: View.java
    @version: 
        - Creación: 14/02/2022
        - Última modificación: 14/02/2022

    Clase que tiene como fin ser un sistema I/O para la manipulación del programa
    */ 

    //---------------------------MÉTODOS------------------------------

    /*****************************************************************
     * error: captura errores y muestra el mensaje que se obtuvo
     * @param e
     */
    public void error(String s){
        System.out.println("Ha ocurrido un error : -- " + s); 
    }
    //****************************************************************

    /*****************************************************************
     * welcome: imprime un mensaje de bienvenida
     */
    public void welcome(){
        System.out.println("\nBienvenido a su calculadora CASIO FX-991. Abriendo el archivo 'datos.txt'...");
    }
    //****************************************************************

    /*****************************************************************
     * output: imprime el parámetro
     * @param posts
     */
    public void output(String text){
        System.out.println(text);
    }
    //****************************************************************

    /*****************************************************************
     * despedida: imprime un mensaje de despedida
     */
    public void despedida(){
        System.out.println("\nSaliendo de la calculadora...");
    }
    //****************************************************************
}
