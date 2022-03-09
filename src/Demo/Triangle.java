package Demo;

import Demo.Figure;

public class Triangle extends Figure {

    final static int CORNERS = 3;


    public Triangle (double firstSideLength,double secondSideLength,double thirdSideLength, String uniqueName){
        super(firstSideLength,secondSideLength,thirdSideLength, uniqueName);
        super.counter++;
        id = counter;
        type = "TRIANGLE";
        System.out.println(DELIMITER);
        System.out.println(type +" with ID: " + id);
        System.out.println("name: "+this.uniqueName+" created");
        System.out.println(DELIMITER);
        double p = (firstSideLength+secondSideLength+thirdSideLength)/2;
        area = Math.sqrt(p*(p*firstSideLength)*(p-secondSideLength)*(p-thirdSideLength));
        double scale = Math.pow(10, 3);
        area = Math.ceil(area * scale) / scale;
    }


    public double getArea() {
        double p = (firstSideLength+secondSideLength+thirdSideLength)/2;
        return area = Math.sqrt(p*(p*firstSideLength)*(p-secondSideLength)*(p-thirdSideLength));
    }

    public String getName() {
        return "Triangle";
    }

    public String toString(){
        return "Area: " + this.area + "Name: " + this.uniqueName;
    }


}
