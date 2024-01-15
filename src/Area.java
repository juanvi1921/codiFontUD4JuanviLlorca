import java.util.ArrayList;

public class Area {
    private double id;
    private Punto p1;
    private Punto p2;
    private Punto p3;

    public Area(double id, Punto p1, Punto p2, Punto p3) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Area(double id, Linea l1, Linea l2, Linea l3) {
        this.id = id;
        this.p1 = l1.getP1();
        this.p2 = l2.getP2();
    }

    public Area(double id, ArrayList<Punto> listaPuntos) {
        this.id = id;
        this.p1 = listaPuntos.get(0);
        this.p2 = listaPuntos.get(1);
        this.p3 = listaPuntos.get(2);
    }
}
