public class Main {

    public static void main(String[] args) {

        Punto p1 = new Punto(5151, 4.00, 5.00);
        Punto p2 = new Punto(5152, 3.00, 7.00);
        Punto p3 = new Punto(5153, 8.20, 4.50);

        Linea l1 = new Linea(5151, p1, p2);
        Linea l2 = new Linea(5152, p3, p1);

        Area a1 = new Area(5151, p1, p2, p3);

        Area a2 = new Area (5151, l1, l2);
    }
}
