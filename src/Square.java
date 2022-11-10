public class Square extends Figure implements Drawable{
    private int sideA;

    public Square(String name, int sideA) {
        super(name);
        this.sideA = sideA;
    }



    @Override
    int calculatePerimeter() {
        return sideA*4;
    }

    @Override
    public void draw() {
        System.out.println("I am drawing Square:"+" \u3378");
    }
}
