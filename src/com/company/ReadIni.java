package com.company;

import org.ini4j.Profile;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class ReadIni {


    public static void main(String[] args) {
        // write your code here
        String fileName = "src/date/date.ini";
        File file = new File(fileName);
        try {
            Wini wini = new Wini(file);
            Profile.Section options = wini.get("Options");
            String desc = options.get("desc");
            String name = options.get("name");
            int number = options.get("number", Integer.class);
            double value = options.get("value", Double.class);
            System.out.printf("desc: %s, name: %s, number: %d, value: %f%n", desc, name, number, value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

