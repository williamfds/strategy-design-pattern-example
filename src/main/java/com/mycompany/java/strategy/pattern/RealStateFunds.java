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
public class RealStateFunds implements InvestimentStratety {

  private double amount; 
  
  public RealStateFunds(double amount) { 
    this.amount = amount; 
  } 
  
    @Override
    public double calculateProfits() {
        return this.amount * 0.1748;
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