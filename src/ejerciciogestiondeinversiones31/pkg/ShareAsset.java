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
public abstract class ShareAsset implements Asset{
    
    protected String symbol;
    protected double TotalCost;
    protected double CurrentPrice;

    public ShareAsset(String symbol, double TotalCost, double CurrentPrice) {
        this.symbol = symbol;
        this.TotalCost = TotalCost;
        this.CurrentPrice = CurrentPrice;
    }
    
    

   
}
