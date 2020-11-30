/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rjlcx
 */
public class PizzaEspecial extends Pizza{
     public String ingredientes(){
        String Queso;
        Queso="Extra de queso \n"+"Chapiñones \n"+"Orilla de queso motzarela \n";
        return Queso;
     }
    public String masa(){
        String m;
        m=("Masa pan pizza \n");
        return m;
    }
    public String promocion(){
        String Bebida;
        Bebida=("Bebida de 1 litro \n");
        return Bebida;
    }
}
