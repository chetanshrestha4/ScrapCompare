/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Scrapper;

import com.leapfrog.Scrapper.Factory.kmartScrapper;
import com.leapfrog.Scrapper.Factory.munchaScrapper;

/**
 *
 * @author Chetan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kmartScrapper km = new kmartScrapper();
        munchaScrapper ms = new munchaScrapper();
        String kmart,muncha;
        kmart = km.scrap();
        muncha = ms.scrap();
        
        System.out.println(kmart);
        
        km.getItems();
    }
    
}
