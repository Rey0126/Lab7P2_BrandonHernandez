package lab7p2_brandonhernandez;

public class Producto {
    private String name;
    private double precio;

    public Producto() {
    }

    public Producto(String name, double precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "name=" + name + ", precio=" + precio + '}';
    }
    
    
}
