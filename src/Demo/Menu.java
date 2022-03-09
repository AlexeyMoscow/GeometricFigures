package Demo;

public class Menu {
    protected static void openMenu() {
        System.out.println("Please, choose any option:");
        System.out.println();
        System.out.println("1. Create figure");
        System.out.println("2. Show saved figure list");
        System.out.println("3. Remove figures by area criteria");
        System.out.println("4. Clear saved figure list ");
        System.out.println();
        System.out.println("0. Exit");
        System.out.println();
        System.out.print("-->> Insert here: ");
    }

    protected static void openFigureMenu() {
        System.out.println("Choose figure type:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println();
        System.out.print("-->> Insert here: ");
    }
}
