package DesignPatterns.Adapter;

public class DisplayData3rdParty {

    // This 3rd party data cannot be modified
    public float index;
    public String data;

    public DisplayData3rdParty(float index, String data) {
        this.index = index;
        this.data = data;
    }

    public void displayData(){
        System.out.println("Data is displayed: " + index + "-" + data);
    }
}
