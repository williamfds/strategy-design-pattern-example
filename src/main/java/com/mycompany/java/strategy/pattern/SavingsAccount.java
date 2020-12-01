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
public class SavingsAccount implements InvestimentStratety {

  private double amount; 
  
  public SavingsAccount(double amount) { 
    this.amount = amount; 
  } 
  
    @Override
    public double calculateProfits() {
        return this.amount * 0.0045;
    }

    @Override
    public double calculateTax() {   
        return 0;
    }
    
    @Override
    public double calculateTotal() {
        return (calculateProfits() - calculateTax());
    }
}