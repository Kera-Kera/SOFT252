/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

/**
 *
 * @author bdaniel
 */
public class VirtualStockItem extends StockItem{
    
        public VirtualStockItem(String name){
       this.name = name;  
    }
    
    public VirtualStockItem(String name, Integer qty){
        this. name = name;
        this.quantityInStock = qty;
    }

    @Override
    public Boolean isInStock() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
