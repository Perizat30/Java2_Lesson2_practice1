import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle( "Circle", 2);
        Square square =new Square("Square",5);
        Rectangle rectangle =new Rectangle("Rectangle",4,5);
        Triangle triangle=new Triangle("Triangle",2,3,4);

        Dog dog=new Dog("Rexar",14);
        Cat cat =new Cat("Marusya",8);

        Drawable [] drawables={circle,square,rectangle,triangle,dog,cat};

        for (int i=0; i< drawables.length;i++){
            if( drawables[i] instanceof Figure){
                System.out.println(((Figure) drawables[i]).calculatePerimeter()+"   "+
                        ((Figure) drawables[i]).getName());
                drawables[i].draw();
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
                drawables[i].draw();
            }
        }


    }
}