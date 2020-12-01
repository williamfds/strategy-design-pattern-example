/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.strategy.pattern;

/**
 *
 * @author William
 */
public class ETF implements InvestimentStratety {

  private double amount; 
  
  public ETF(double amount) { 
    this.amount = amount; 
  } 
  
    @Override
    public double calculateProfits() {
        return this.amount * 0.1825;
    }

    @Override
    public double calculateTax() {
        double profits = calculateProfits();
        return profits * 0.20;       
    }
    
    @Override
    public double calculateTotal() {
        return (calculateProfits() - calculateTax());
    }
    
}