/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rjlcx
 */
public class PizzaAmericana extends Pizza {
     public String ingredientes(){
        String Queso;
        Queso="Extra de queso \n"+"Pepperoni \n"+"Trozos de beacon \n"+"Trozo de piña \n"+"Orilla de queso motzarela \n";
        return Queso;
     }
    public String masa(){
        String m;
        m="Masa clasica \n";
        return m;
    }
    public String promocion(){
        String Bebidas;
        Bebidas="Bebida de 1 litro \n";
        return Bebidas;
    }
}
