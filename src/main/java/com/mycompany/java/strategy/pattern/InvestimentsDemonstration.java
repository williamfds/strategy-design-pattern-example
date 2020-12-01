/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.strategy.pattern;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author William
 */
public class InvestimentsDemonstration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float amount; 
        
        System.out.println("Digite o valor inicial: ");
        amount = scanner.nextFloat();
        
        System.out.println("Seus investimentos ficariam da seguinte forma: ");
        
        Actions action = new Actions(amount);
        System.out.println("Em ações, seus investimentos teriam lucro bruto de R$" + action.calculateProfits() + " e teriam o total de IR = R$" + action.calculateTax() + ", ou seja, obteria um lucro líquido de R$ " + new DecimalFormat("#,##0.00").format(action.calculateTotal()));
        
        RealStateFunds rsf = new RealStateFunds(amount);
        System.out.println("Em Fundos Imobiliários, seus investimentos teriam lucro bruto de R$" + rsf.calculateProfits() + " e teriam o total de IR = R$" + rsf.calculateTax() + ", ou seja, obteria um lucro líquido de R$ " + new DecimalFormat("#,##0.00").format(rsf.calculateTotal()));
        
        ETF etf = new ETF(amount);
        System.out.println("Em ETF, seus investimentos teriam lucro bruto de R$" + etf.calculateProfits() + " e teriam o total de IR = R$" + etf.calculateTax() + ", ou seja, obteria um lucro líquido de R$ " + new DecimalFormat("#,##0.00").format(etf.calculateTotal()));
        
        SavingsAccount sAcc = new SavingsAccount(amount);
        System.out.println("Em Poupança, seus investimentos teriam lucro bruto de R$" + sAcc.calculateProfits() + " e teriam o total de IR = R$" + sAcc.calculateTax() + ", ou seja, obteria um lucro líquido de R$ " + new DecimalFormat("#,##0.00").format(sAcc.calculateTotal()));
        
    }
}
