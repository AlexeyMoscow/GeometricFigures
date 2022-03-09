package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static ArrayList<Figure> figures;

    public static void main(String[] args) {

        new Application().start();

    }

    private double getInputLength() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public void showInfo() {
        if (figures.size() == 0) {
            System.out.println(Figure.DELIMITER);
            System.out.println("Figure list is EMPTY !");
            System.out.println(Figure.DELIMITER);
        } else {

            for (Figure f : figures
            ) {
                System.out.println(Figure.DELIMITER);
                System.out.println("Figure ID: " + f.id);
                System.out.println("Figure type: " + f.type);
                System.out.println("Unique name: " + f.uniqueName);
                System.out.println("Area: " + f.area);
                System.out.println(Figure.DELIMITER);
            }
        }
    }

    private String getInputName() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private int getUserInputMenu() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private void addNewFigure(int type, double a, double b, double c, String d) {
        if (type == 1)
            figures.add(new Square(a, d));
        if (type == 2)
            figures.add(new Rectangle(a, b, d));
        if (type == 3)
            figures.add(new Circle(a, d));
        if (type == 4)
            figures.add(new Triangle(a,b,c,d));
    }

    public void start() {
        figures = new ArrayList<>();
        int userInput = -1;

        SaveData.loadFile();

        while (true) {
            Menu.openMenu();
            userInput = getUserInputMenu();

            if (userInput == 0) {

                SaveData.saveFile();
                return;
            }

            if (userInput != 1 && userInput != 2 && userInput != 3 &&  userInput != 4) {
                System.out.println(Figure.DELIMITER);
                System.out.println("Invalid command! Please try again!");
                System.out.println(Figure.DELIMITER);
                continue;
            }

            int figureType = -1;


            switch (userInput) {

                case 1:
                    Menu.openFigureMenu();
                    figureType = getUserInputMenu();

                    switch (figureType) {
                        case 1:

                            System.out.println("Insert length of side:");
                            double side1 = getInputLength();
                            System.out.println("Insert unique name of square:");
                            String name = getInputName();
                            addNewFigure(figureType, side1, 0,0, name);
                            break;

                        case 2:
                            System.out.println("Insert length of First side");
                            side1 = getInputLength();
                            System.out.println("Insert length of Second side");
                            double side2 = getInputLength();
                            System.out.println("Insert unique name of Rectangle");
                            name = getInputName();
                            addNewFigure(figureType, side1, side2,0, name);
                            break;
                        case 3:
                            System.out.println("Insert length of R:");
                            side1 = getInputLength();
                            System.out.println("Insert unique name of circle:");
                            name = getInputName();
                            addNewFigure(figureType, side1, 0,0, name);
                            break;
                        case 4:
                            System.out.println("Insert length of First side");
                            side1 = getInputLength();
                            System.out.println("Insert length of Second side");
                            side2 = getInputLength();
                            System.out.println("Insert length of Third side");
                            double recommendedLength = (side1+side2)-0.1;
                            System.out.println("It must be equal or less than " + recommendedLength);
                            double side3 = getInputLength();
                            if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2){
                                System.out.println("Insert unique name of Triangle");
                                name = getInputName();
                                addNewFigure(figureType, side1, side2,side3, name);
                                break;
                            }else{
                                System.out.println("It's impossible to create such Triangle. Input new lengths");
                                break;
                            }
                    }
                    break;

                case 2:
                    showInfo();
                    break;
                case 3:
                    System.out.println("Insert area size. All figures with such area and less will be deleted from list");
                    int areaToDelete = getUserInputMenu();
                    figures.removeIf(n -> (n.area < areaToDelete));
                    break;
                case 4:
                    System.out.println("*** Confirm to clear list. ALL records will be DELETED! ***");
                    System.out.println("*** Insert '1' to confirm ***");
                    userInput = getUserInputMenu();
                    if (userInput == 1) {
                        figures = new ArrayList<>();
                    }
                    break;
            }
        }
    }
}