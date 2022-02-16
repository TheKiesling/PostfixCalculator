/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

public class Controller{
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Controller.java
    @version: 
        - Creación: 14/02/2021
        - Última modificación: 15/02/2021

    Clase que comunica el modelo con la vista y controla sus acciones
    */

    public static void main(String[] args){
        View view = new View();
        Casio casio = new Casio();

        try{
            view.welcome();
            casio.doOperation();
            view.despedida();
        } catch (Exception e){
            String s = "ERROR: " + e.getMessage();
            view.error(s);
        }
    }
}