package Factory;

public class ShapeFactory {
    public Shape getFood(String type){
        if (type == null) {
            return null;
        }
        switch (type){
            case "Round":
                return new Pizza();
            case "Cylinder":
                return new Burrito();
            default:
                System.out.println("Food not found");
        }
        return null;
    }
}
