package DesignPatterns.Builder;

public class AppartmentBuilder {
    private int sqm = -1;
    private int rooms = -1;
    private String city = "";
    private String area = "";
    private boolean kitchen = false;

    public AppartmentBuilder setSqm(int sqm) {
        this.sqm = sqm;
        return this;
    }

    public AppartmentBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public AppartmentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AppartmentBuilder setArea(String area) {
        this.area = area;
        return this;
    }

    public AppartmentBuilder setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
        return this;
    }
    public Appartment build(){
        Appartment appartment = new Appartment(sqm,rooms,city,area,kitchen);
        sqm = -1;
        rooms = -1;
        city = " ";
        area = " ";
        kitchen = false;
        return appartment;
    }
}
