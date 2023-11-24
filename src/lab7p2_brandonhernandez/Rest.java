
package lab7p2_brandonhernandez;

import java.util.ArrayList;

public class Rest {
    private String name;
    private String ubi;
    private ArrayList<Producto> productos = new ArrayList();
    private double saldo;

    public Rest() {
    }

    public Rest(String name, String ubi) {
        this.name = name;
        this.ubi = ubi;
        this.saldo = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbi() {
        return ubi;
    }

    public void setUbi(String ubi) {
        this.ubi = ubi;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Rest{" + "name=" + name + ", ubi=" + ubi + ", productos=" + productos + ", saldo=" + saldo + '}';
    }
    
    
}
