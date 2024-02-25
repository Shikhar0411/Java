package DesignPatterns.Builder;

import java.util.Objects;

public class Appartment {
    private int sqm;
    private int rooms;
    private String city;
    private String area;
    private boolean kitchen;

    // constructor
    public Appartment(int sqm, int rooms, String city, String area, boolean kitchen) {
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.kitchen = kitchen;
    }

    // All the getters
    public int getSqm() {
        return sqm;
    }

    public int getRooms() {
        return rooms;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    // Information of the appartment
    public void display(){
        System.out.println("Appartment has:-");
        if (sqm != -1) {
            System.out.println("Appartment has area : " + sqm);
        }
        if (rooms != -1) {
            System.out.println("Appartment has rooms : " + rooms);
        }
        if (!city.isEmpty()) {
            System.out.println("City: " + city);
        }
        if (!area.isEmpty()) {
            System.out.println("Area: " + area);
        }
        if (kitchen) {
            System.out.println("Appartment has Kitchen");
        }
        System.out.println(" ");
    }
}
