package ni.edu.uam.modelos;

public class Productos {
    private String nombre;
   private  double precio;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecip() {
        return precio;
    }

    public void setPrecip(double precip) {
        this.precio = precip;
    }

    public Productos(String nombre, double precip) {
        this.nombre = nombre;
        this.precio= precio;
    }


}
