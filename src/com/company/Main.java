package com.company;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String fileName = "src/date/date.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini wini = new Wini(file);
            wini.put("Options", "desc", "Описание изделия №1");
            wini.put("Options", "name", "Изделие №1");
            wini.put("Options", "number", 12345);
            wini.put("Options", "value", 3.2);
            wini.store();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
