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
public class Actions implements InvestimentStrategy {

  private double amount; 
  
  public Actions(double amount) { 
    this.amount = amount; 
  } 
  
    @Override
    public double calculateProfits() {
        return this.amount * 0.325;
    }

    @Override
    public double calculateTax() {
        double profits = calculateProfits();
        return (profits > 20000) ? profits * 0.15 : 0;
    }

    @Override
    public double calculateTotal() {
        return (calculateProfits() - calculateTax());
    }
    
}
