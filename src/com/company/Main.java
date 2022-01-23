package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();

    public static void main(String[] args) {
	// write your code here
        Trucks[] autopark = {
         Trucks.makeTruck(1,"BMW","Salah","Base"),
         Trucks.makeTruck(2,"HONDA","Gerard","Base"),
         Trucks.makeTruck(3,"MERCEDES-BENZ","Leo","Base"),
        };
        String test = GSON.toJson(autopark);
        write(test);
        System.out.println(test);



    }
    private static void write (String obj){
        Path write = Paths.get("./autopark.json");
        try{
            Files.writeString(write,obj,StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE);
        }catch (IOException e){
            e.getMessage();
        }
    }
}
