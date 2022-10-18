import java.util.Scanner;

class RectangleInfo {
    public static void main(String[] args) {

        String trash = "";
        double length = 3;
        double width = 4;
        double area;
        double perimeter;
        double diagonal;

        area = length * width;
        perimeter = length * width * 2;
        diagonal = length * length + width * width;


        Scanner in = new Scanner(System.in);

        System.out.println("The length of the rectangle: ");
        if (in.hasNextDouble()) {
            length = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number: " + trash);
        }
        System.out.println("The width of the rectangle:");
        if (in.hasNextDouble()) {
            width = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Must enter valid a valid number: " + trash);
        }
        System.out.println("The area of the rectangle: " + area);
        System.out.println("The perimeter of the rectangle: " + perimeter);
    }
}


