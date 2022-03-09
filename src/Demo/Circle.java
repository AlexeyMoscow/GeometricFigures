package Demo;

public class Circle extends Figure {

    public Circle (double firstSideLength,String uniqueName){
        super(firstSideLength, uniqueName);
        super.counter++;
        id = Figure.counter;
        type = "CIRCLE";
        System.out.println(Figure.DELIMITER);
        System.out.println(type +" with ID: " + id);
        System.out.println("name: "+this.uniqueName+" created");
        System.out.println(Figure.DELIMITER);
        area = Math.PI*(firstSideLength * firstSideLength);
        double scale = Math.pow(10, 3);
        area = Math.ceil(area * scale) / scale;

    }

    public double getArea() {
        return area = Math.PI*(firstSideLength * firstSideLength);
    }

    public String getName() {
        return "Circle";
    }

}