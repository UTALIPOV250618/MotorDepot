package com.company;

public class Trucks {
    private int id;
    private String name;
    private String driver;
    private String base;

//    public Trucks() {
//    }
//
//    public Trucks(int id, String name, String driver, String base) {
//        this.id = id;
//        this.name = name;
//        this.driver = driver;
//        this.base = base;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
    public static Trucks makeTruck(int id,String name, String driver,String base ){
        Trucks trucks = new Trucks();
        trucks.id = id;
        trucks.name = name;
        trucks.driver = driver;
        trucks.base = base;
        return trucks;
    }
}
