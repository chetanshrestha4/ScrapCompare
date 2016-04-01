/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Scrapper.Entity;

/**
 *
 * @author Chetan
 */
public class Product {

    private String name,store;
    private int price;
    public Product() {
    }

    public Product(String name, String store, int price) {
        this.name = name;
        this.store = store;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", store=" + store + ", price=" + price + '}';
    }

   
    
}
