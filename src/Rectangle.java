public class Rectangle  extends Figure implements Drawable {
    private int sideA;
    private int sideB;

    public Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    int calculatePerimeter() {
        return 2*(sideA+sideA);
    }

    @Override
    public void draw() {
        System.out.println("I am drawing Rectangle:"+" \u25AD");
    }
}
