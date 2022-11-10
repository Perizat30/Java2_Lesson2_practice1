public class Circle extends Figure implements Drawable {

   private Integer radius;

   public Circle(String name, Integer radius) {
      super(name);
      this.radius = radius;
   }



   @Override
   int calculatePerimeter() {
      return  (int)(2*Math.PI*radius);
   }

   @Override
   public void draw() {
      System.out.println("I am drawing Circle:"+"   \u20DD");
   }
}
