package modelo;

public class Fecha {

    // Atributos
    private int dia;
    private int mes;
    private int anio;

    // Metodos (de acceso(setter y getter))
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
}