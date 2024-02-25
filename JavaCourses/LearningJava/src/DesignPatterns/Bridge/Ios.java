package DesignPatterns.Bridge;

public class Ios implements PhoneOS{
    @Override
    public void upload(String data) {
        System.out.println("Uploading data for Ios " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading data for Ios " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Displaying data for Ios" + data);
    }
}
