package Demo;

import Demo.Figure;

public class Rectangle extends Figure {

    final static int CORNERS = 4;

    public Rectangle (double firstSideLength,double secondSideLength, String uniqueName){
        super(firstSideLength,secondSideLength, uniqueName);
        super.counter++;
        id = counter;
        type = "RECTANGLE";
        System.out.println(DELIMITER);
        System.out.println(type +" with ID: " + id);
        System.out.println("name: "+this.uniqueName+" created");
        System.out.println(DELIMITER);
        area = firstSideLength *secondSideLength;
    }

    public double getArea() {
        return area = firstSideLength * secondSideLength;
    }

    public String getName() {
        return "Rectangle";
    }

    public String toString(){
        return "Area: " + this.area + "Name: " + this.uniqueName;
    }


}
