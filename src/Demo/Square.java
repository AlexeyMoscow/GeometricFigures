package Demo;

import Demo.Figure;

public class Square extends Figure {


    public Square (double firstSideLength,String uniqueName){
        super(firstSideLength, uniqueName);
        super.counter++;
        id = counter;
        type = "SQUARE";
        System.out.println(DELIMITER);
        System.out.println(type +" with ID: " + id);
        System.out.println("name: "+this.uniqueName+" created");
        System.out.println(DELIMITER);
        area = firstSideLength * firstSideLength;
    }

    public double getArea() {
        return area = firstSideLength * firstSideLength;
    }

    public String getName() {
        return "Square";
    }



}
