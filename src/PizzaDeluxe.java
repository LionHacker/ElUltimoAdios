/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rjlcx
 */
public class PizzaDeluxe extends Pizza{
     public String ingredientes(){
        String Queso;
        Queso="Extra de queso \n"+"Pepperoni \n"+"Champoñones \n"+"Pimientos \n"+"Trozos de carne molida \n";
        return Queso;
     }
    public String masa(){
        String m;
        m="Masa pan pizza \n";
        return m;
    }
    public String promocion(){
        String Bebidas;
        Bebidas="Bedida de 1 litro \n";
        return Bebidas;
    }
}
