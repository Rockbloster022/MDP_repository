package es.unex.cum.mdp.sesion03;

public class Pieza {
    private String id;
    private String nombre;
    private int stock;

    public Pieza() {
        this.id = "";
        this.nombre = "none";
        this.stock = 0;
    }

    public Pieza(String id, String nombre, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }

    public Pieza(Pieza pieza){
        this.id = pieza.getId();
        this.nombre = pieza.getNombre();
        this.stock = pieza.getStock();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }
    public void incrementarStock() {
        stock++;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Pieza [id=" + id + ", nombre=" + nombre + ", stock=" + stock + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pieza other = (Pieza) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
