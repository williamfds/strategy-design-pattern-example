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
public interface InvestimentStratety {
    double calculateProfits();
    double calculateTax();
    double calculateTotal();
}
