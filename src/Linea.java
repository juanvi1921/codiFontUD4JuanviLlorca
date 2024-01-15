import java.lang.reflect.Array;
import java.util.ArrayList;

public class Linea {
    private double id;
    private Punto p1;
    private Punto p2;

    public Linea(double id, Punto p1, Punto p2) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Linea(double id, ArrayList<Punto> listaPuntos) {
        this.id = id;
        this.p1 = listaPuntos.get(0);
        this.p2 = listaPuntos.get(1);
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }
}


