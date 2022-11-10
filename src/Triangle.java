public class Triangle extends Figure implements Drawable{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }



    @Override
    int calculatePerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public void draw() {
        System.out.println("I am  drawing Triangle:"+"   ⃤ ");
    }
}
