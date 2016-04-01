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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Chetan
 */
public class kmartScrapper implements ScrapFactory {

    @Override
    public String scrap() {
        StringBuilder builder = new StringBuilder();
        try {
            
            URLConnection conn =  new URL("http://kathmandumart.com").openConnection();
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

    public void getItems() {

        String scrapData = scrap();

        String modelRegEx="<a href=\"http://kathmandumart.com/(.*?)\">(.*?)</a>";

        Pattern pattern = Pattern.compile(modelRegEx);
        Matcher matcher = pattern.matcher(scrapData);

        if (matcher.find()) {
           System.out.println(matcher.group(0));
            
            //System.out.println("asdasdasdasd");
                  
        }else
            System.out.println("NOT FOUND");

    }

}
