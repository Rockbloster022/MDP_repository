package es.unex.cum.mdp.sesion01;




/*
Cada alumno deberá implementar una clase Reloj compuesta por los siguientes atributos: int horas; int minutos; int segundos.
Además debe tener los siguientes métodos (CUIDADO: deben llamarse tal y como aparecen a continuación):

• Reloj()
• Reloj(int hora, int minutos, int segundos)
• int getHoras()
• void setHoras(int hora)
• int getMinutos()
• void setMinutos(int minutos)
• int getSegundos()
• void setSegundos(int segundos)
• boolean equals(Reloj obj)
• String toString() deberá devolver la información en el siguiente formato:
◦
"Reloj [horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + "]";
• void incrementarSegundos(): Incrementa en uno los segundos
• void incrementarMinutos() : Incrementa en uno los minutos
• void incrementarHoras(): : Incrementa en uno las horas
• void decrementarSegundos(): Decrementa en uno los segundos
• void decrementarMinutos(): Decrementa en uno los minutos
• void decrementarHoras(): Decrementa en uno las horas
• long getTiempo(): Devuelve en número entero las horas, minutos y segundos.
• void setTiempo(long s): Asigna las horas, minutos y segundos en base a un número long
• void anadirTiempo(Reloj r): Añade al reloj actual, la información de otro reloj
• void restarTiempo(Reloj r): Resta al reloj actual, la información de otro reloj
*/
public class Reloj {
    int hora, minutos, segundos;

    public Reloj() {
    }

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public long getTiempo(){
        return (hora*60 + minutos)*60 + segundos;
    }
    public void setTiempo(long s){
        hora=Long.valueOf(s/(3600)).intValue();
        s-=hora*3600;
        
        minutos=Long.valueOf(s/(60)).intValue();
        s-=minutos*60;
        
        segundos=Math.round(s);
        while(hora>=24){
            hora-=24;
        }
    }
    public void anadirTiempo(Reloj r){
        setTiempo(getTiempo()+r.getTiempo());
    }
    public void restarTiempo(Reloj r){
        if(getTiempo()>r.getTiempo()){
        setTiempo(getTiempo()-r.getTiempo());
        }else{
            setTiempo(0);
        }
    }

    public void incrementarHoras(){
        hora++;
        if(hora>=24){
            hora-=24;
        }
    }
    public void incrementarMinutos(){
        minutos++;
        if(minutos>=60){
            minutos-=60;
            incrementarHoras();
        }
    }
    public void incrementarSegundos(){
        segundos++;
        if(segundos>=60){
            segundos-=60;
            incrementarMinutos();
        }
    }

    public void dencrementarHoras(){
        if(hora>0){
        hora--;
        }
    }
    public void dencrementarMinutos(){
        if(minutos>0){
            minutos--;
        }else if(hora>0){
            minutos=59;
            dencrementarHoras();
        }
    }
    public void decrementarSegundos(){
        if(segundos>0){
            segundos--;
        }else if(hora>0 || minutos>0){
            segundos=59;
            dencrementarMinutos();
        }
    }

    public int getHoras() {
        return hora;
    }

    public void setHoras(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reloj other = (Reloj) obj;
        if (hora != other.hora)
            return false;
        if (minutos != other.minutos)
            return false;
        if (segundos != other.segundos)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Reloj [horas=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + "]";
    }
}
