/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gaming_console;

/**
 *
 * @author emeris
 */
public class ElectronicsReport extends ConsoleSales {
    
     protected String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
    
    
    protected String[] consoles = {"PS5", "XBOX", "SWITCH"};
    

    protected int[][] salesData = {
        {1000, 2000, 3000}, 
        {2000, 3000, 4000}, 
        {1500, 1100, 1200}  
    };
    
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
}
