/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rjlcx
 */
public class Pizzapiña extends Pizza {
    
    public String ingredientes(){
       
       String Queso="Extra de queso \n"+"Trozos de piña \n"+"Pepperoni \n"+"Jamon \n";  
       return Queso;
    }
   
    public String masa(){
        
        String m="Masa clasica \n";
        return m;
    }

    public String promocion(){
        String Bebida="Bebida de 1 litro \n"+"Racion de costillas de cerdo \n";
        return Bebida;
    }
}
