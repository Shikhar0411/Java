package Builder;

public class Main {
    public static void main(String[] args){
        // Used pretty commonly
        // Used when we have to initialise multiple parameters of an object
        AppartmentBuilder appartmentBuilder = new AppartmentBuilder();

        Appartment appartment1 = appartmentBuilder
                .setSqm(23)
                .setArea("45")
                .setRooms(4)
                .setCity("Gurgaon")
                .setKitchen(true)
                .build();

        Appartment appartment2 = appartmentBuilder
                .setSqm(45)
                .setArea("4")
                .setRooms(2)
                .setCity("gaon")
                .setKitchen(false)
                .build();

        appartment1.display();
        appartment2.display();
    }
}
