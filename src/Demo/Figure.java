package Demo;

import java.io.Serializable;

public abstract class Figure implements Serializable {

    public static final String DELIMITER = "--------------";
    protected String uniqueName;
    protected double area;
    protected String type;
    protected double firstSideLength;
    protected double secondSideLength;
    protected double thirdSideLength;
    protected static int counter;
    int id;


    public Figure (double firstSideLength,double secondSideLength,String uniqueName){

        this.firstSideLength =firstSideLength;
        this.secondSideLength=secondSideLength;
        this.uniqueName = uniqueName;

    }

    public Figure (double firstSideLength,double secondSideLength,double thirdSideLength,String uniqueName){

        this.firstSideLength =firstSideLength;
        this.secondSideLength=secondSideLength;
        this.thirdSideLength = thirdSideLength;
        this.uniqueName = uniqueName;

    }

    public Figure (double firstSideLength,String uniqueName){

        this.firstSideLength =firstSideLength;
        this.uniqueName=uniqueName;

    }
    public Figure(){}

    public double getFirstSideLength (){
        return  firstSideLength;
    }

    public void setFirstSideLength (double firstSideLength){
        this.firstSideLength = firstSideLength;
    }

    public double getSecondSideLength (){
        return secondSideLength;
    }

    public void setSecondSideLength (double secondSideLength){
       this.secondSideLength = secondSideLength;
    }

    public abstract String getName();

    public abstract double getArea();

    public String toString(){
        String out = "This is " + this.type + "  with Unique Name"+ this.uniqueName + "   with area: " + this.area+"";
        return out;
    }


}

