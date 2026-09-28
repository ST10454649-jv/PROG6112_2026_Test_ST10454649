/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gaming_console;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author emeris
 */
public class Gaming_Console {

    
    
    public static void main(String[] args) {
    }

    private static int[] calculateCityTotals() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class ConsoleSales {
    
    protected String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
    
   
    protected String[] consoles = {"PS5", "XBOX", "SWITCH"};
    
    //
    protected int[][] salesData = {
        {1000, 2000, 3000}, 
        {2000, 3000, 4000}, 
        {1500, 1100, 1200} 
    };

   
    public void printSalesReport() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------------");
        
        
        
        for (String console : consoles) {
            System.out.printf(console);
        }
        System.out.println();

       
        for (int i = 0; i < cities.length; i++) {
            System.out.printf( cities[i]);
            for (int j = 0; j < salesData[i].length; j++) {
                System.out.printf("", salesData[i][j]);
            }
            System.out.println();
        }
    }
}

public class ElectronicsReport extends ConsoleSales {

    
    public int[] calculateCityTotals() {
        int[] cityTotals = new int[cities.length];
        
        for (int i = 0; i < salesData.length; i++) {
            int total = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
            cityTotals[i] = total;
        }
        return cityTotals;
    }

    
    public void printCityTotalsAndMax() {
        int[] totals = calculateCityTotals();
        
        System.out.println("\n------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------------");

        int maxSales = totals[0];
        int maxIndex = 0;

        for (int i = 0; i < cities.length; i++) {
            System.out.printf( cities[i], totals[i]);
            
           
            if (totals[i] > maxSales) {
                maxSales = totals[i];
                maxIndex = i;
            }
        }

        System.out.println("\n------------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println("------------------------------------------------------------------");
    }
}
}

  
