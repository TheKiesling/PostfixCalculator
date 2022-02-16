/*
#      #    #######    ########   #######   #          #######   ##      #    #########
#     #        #       #          #         #             #      # #     #    #
#    #         #       #          #         #             #      #  #    #    #
####           #       #####      #######   #             #      #   #   #    #    ####
#    #         #       #                #   #             #      #    #  #    #       #
#     #        #       #                #   #             #      #     # #    #       #
#      #    ########   ########   #######   ########   #######   #      ##    #########
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Casio {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Casio.java
    @version: 
        - Creación: 15/02/2022
        - Última modificación: 15/02/2022

    Clase que implementa la interfaz de IPosfixCalc, y sirve como ADT
    */ 

    //---------------------------PROPIEDADES--------------------------
    private Calculator calculator = new Calculator();
    private Stack<String> operations = new Stack<String>();

    //---------------------------MÉTODOS------------------------------

    /*****************************************************************
     * read: lee el archivo datos.txt
     * @return boolean
     * @throws FileNotFoundException
     */
    private boolean read() throws FileNotFoundException{
        boolean read = false;
        try{
            read = true;
            File file = new File("datos.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine())
                operations.push(reader.nextLine());
            reader.close();
        }catch(FileNotFoundException e){
            String s = "Casio.read:" + e.getMessage();
			throw new FileNotFoundException(s);
        }
        return read;
    }
    //****************************************************************

    /*****************************************************************
     * doOperation: hace operaciones cargadas en la pila
     * @return String
     * @throws FileNotFoundException
     */
    public String doOperation() throws FileNotFoundException{
        String operations = "";
        if(read())
            while(!this.operations.isEmpty()){
                String operation = this.operations.pull();
                int result = calculator.Evaluate(operation);
                operations += operation + "\n" + result + "\n"+ "\n";
            }
        return operations;
    }
    //****************************************************************
}
