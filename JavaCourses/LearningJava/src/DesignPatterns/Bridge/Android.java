package DesignPatterns.Bridge;

public class Android implements PhoneOS{
    @Override
    public void upload(String data) {
        System.out.println("Uploading data for Android " + data);
    }

    @Override
    public void download(String url) {
        System.out.println("Downloading data for android " + url);
    }

    @Override
    public void display(String data) {
        System.out.println("Displaying data for android" + data);
    }
}
