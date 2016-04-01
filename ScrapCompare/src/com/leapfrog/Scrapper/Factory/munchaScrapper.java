/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Scrapper.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Chetan
 */
public class munchaScrapper implements ScrapFactory {

    @Override
    public String scrap() {
        StringBuilder builder = new StringBuilder();
        try {
            URL url = new URL("http://muncha.com");
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";

            while ((line = reader.readLine()) != null) {

                builder.append(line);
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return builder.toString();
    }

}
