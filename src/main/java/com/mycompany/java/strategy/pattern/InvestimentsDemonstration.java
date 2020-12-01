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
        
        InvestimentStrategy investimentStrategy = new Actions(amount);
        System.out.println("Em ações, seus investimentos teriam lucro bruto de R$" + investimentStrategy.calculateProfits() + " e teriam o total de IR = R$" + investimentStrategy.calculateTax() + ", ou seja, obteria um lucro líquido de R$ " + new DecimalFormat("#,##0.00").format(investimentStrategy.calculateTotal()));
        
        investimentStrategy = new RealStateFunds(amount);
        System.out.println("Em Fundos Imobiliários, seus investimentos teriam lucro bruto de R$" + investimentStrategy.calculateProfits() + " e teriam o total de IR = R$" + investimentStrategy.calculateTax() + ", ou seja, obteria um lucro líquido de R$ " + new DecimalFormat("#,##0.00").format(investimentStrategy.calculateTotal()));
        
        investimentStrategy = new ETF(amount);
        System.out.println("Em ETF, seus investimentos teriam lucro bruto de R$" + investimentStrategy.calculateProfits() + " e teriam o total de IR = R$" + investimentStrategy.calculateTax() + ", ou seja, obteria um lucro líquido de R$ " + new DecimalFormat("#,##0.00").format(investimentStrategy.calculateTotal()));
        
        investimentStrategy = new SavingsAccount(amount);
        System.out.println("Em Poupança, seus investimentos teriam lucro bruto de R$" + investimentStrategy.calculateProfits() + " e teriam o total de IR = R$" + investimentStrategy.calculateTax() + ", ou seja, obteria um lucro líquido de R$ " + new DecimalFormat("#,##0.00").format(investimentStrategy.calculateTotal()));
        
    }
}
