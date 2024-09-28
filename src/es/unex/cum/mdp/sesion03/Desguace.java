package es.unex.cum.mdp.sesion03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Desguace {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Desguace() {
        this.nombre="";
        this.vehiculos=new ArrayList<Vehiculo>();
    }

    public Desguace(String nombre, int tam) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<Vehiculo>(tam);
    }
    public Desguace(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public boolean addVehiculo(Vehiculo vehiculo){
        if(!vehiculos.contains(vehiculo)){
            vehiculos.add(vehiculo);
            return true;
        }
        return false;
    }
    
    public Vehiculo getVehiculoBastidor(int b){
        Iterator<Vehiculo> iteratorV = vehiculos.iterator();
        while(iteratorV.hasNext()){
            Vehiculo vehiculo=iteratorV.next();
            if(vehiculo.getBastidor()==b){
                return vehiculo;
            }
        }
        return null;
    }
    public boolean addPiezaVehiculo(Pieza p, int b){
        Vehiculo vehiculo=getVehiculoBastidor(b);
        if(vehiculo!=null){
            if(!vehiculo.addPiezaV(p)){
                for(int i=0;i<vehiculo.getCont();i++){
                    Pieza pieza=vehiculo.getPiezaV(i);
                    if(pieza.equals(p)){
                        pieza.incrementarStock();
                        return true;
                    }
                }
            }else{
                return true;
            }
        }
        return false;
    }
    public Pieza getPiezaVehiculo(String id, int b){
        Vehiculo vehiculo=getVehiculoBastidor(b);
        if(vehiculo!=null){
            for(int i=0;i<vehiculo.getCont();i++){
            Pieza pieza=vehiculo.getPiezaV(i);
            if(pieza.getId().equals(id)){
                return pieza;
            }
        }
        }
        return null;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    
    @Override
    public String toString() {
        return "Desguace [nombre=" + nombre + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Desguace other = (Desguace) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }    
}
