package session8.btvn;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(4.5, 3.5);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("Kết quả: ");
        Rectangle[] rectangles = {r1, r2, r3};
        double maxRectangle = rectangles[0].getArea();
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i].getArea() > maxRectangle) {
                maxRectangle = rectangles[i].getArea();
            }
        }
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i].getArea() == maxRectangle) {
                System.out.println("largest area: " + rectangles[i].getArea() + "(Rectangle " + (i + 1) + ", width: " + rectangles[i].getWidth() + ", height: " + rectangles[i].getHeight() + ")");
            }
        }
    }
}
