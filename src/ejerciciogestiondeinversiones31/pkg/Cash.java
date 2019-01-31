/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogestiondeinversiones31.pkg;

/**
 *
 * @author Estudiante
 */
public class Cash implements Asset{
    public int amount;

    @Override
    public double getMarketValue() {
        return this.amount;
    }

    @Override
    public double Profit() {
        return 0;
    }
   
    
}
