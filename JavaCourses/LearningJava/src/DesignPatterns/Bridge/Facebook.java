package DesignPatterns.Bridge;

public class Facebook implements App{

    private PhoneOS phoneOS;

    public Facebook(PhoneOS os){
        this.phoneOS = os;
    }

    @Override
    public void runApp() {
        System.out.println("Running application facebook");
        phoneOS.upload("posts");
        phoneOS.download("facebook.com");
        phoneOS.display("phone data");
    }
}
