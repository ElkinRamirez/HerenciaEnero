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
public class Stock extends ShareAsset{
    private int TotalShares;

    public Stock(int TotalShares, String symbol, double TotalCost, double CurrentPrice) {
        super(symbol, TotalCost, CurrentPrice);
        this.TotalShares = TotalShares;
    }
    

    public Stock(String symbol, double TotalCost, double CurrentPrice) {
        super(symbol, TotalCost, CurrentPrice);
    }
    @Override
        public double getMarketValue() {
            return ((this.TotalShares*this.CurrentPrice)-this.TotalCost);
        }

    @Override
    public double Profit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
