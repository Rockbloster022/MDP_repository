package es.unex.cum.mdp.sesion03;

import java.util.Arrays;

public class Vehiculo {

    private String marca;
    private String modelo;
    private Persona propietario;
    private int cont;

    private Pieza[] piezas;
    private int bastidor;

    public Vehiculo(){
        this.marca = "none";
        this.modelo = "none";
        this.propietario = new Persona();
        this.piezas = new Pieza[3];
        this.bastidor = 0;
        this.cont=0;
    }
    public Vehiculo(int tam){
        this.marca = "none";
        this.modelo = "none";
        this.propietario = new Persona();
        this.piezas = new Pieza[tam];
        this.bastidor = 0;
        this.cont=0;
    }


    public Vehiculo(String marca, String modelo, Persona propietario, int bastidor, int tam) {
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.piezas = new Pieza[tam];
        this.bastidor = bastidor;
        this.cont=0;
    }

    public Vehiculo(String marca, String modelo, Persona propietario, int tam) {
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.piezas = new Pieza[tam];
        this.bastidor = 0;
        this.cont=0;
    }

    public Vehiculo(Vehiculo v) {
        this.marca = v.getMarca();
        this.modelo = v.getModelo();
        this.propietario = v.getPropietario();
        this.piezas = v.getPiezas();
        this.bastidor = v.getBastidor();
        this.cont = v.getCont();
    }


    public boolean addPiezaV(Pieza pieza){
        if(cont<piezas.length){
            for(int i=0;i<cont;i++){
                if(piezas[i].equals(pieza)){
                    return false;
                }
            }
            piezas[cont]=pieza;
            cont ++;
            return true;
        }
        return false;
    }
    public Pieza getPiezaV(int posicion){
        if(posicion<cont && posicion>=0){
            return piezas[posicion];
        }
        return null;
    }


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Persona getPropietario() {
        return propietario;
    }
    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Pieza[] getPiezas() {
        return piezas;
    }

    public int getBastidor() {
        return bastidor;
    }
    public void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public int getCont() {
        return cont;
    }
    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario + ", piezas="
                + Arrays.toString(piezas) + ", bastidor=" + bastidor + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        if (bastidor != other.bastidor)
            return false;
        return true;
    }
}
