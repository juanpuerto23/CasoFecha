package modelo;

public class FechaDetallada extends Fecha{
    private int annio;
    private String mes;
    String MES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    Fecha c1 = Fecha.getInstance();
    public void obtenerMesAño() {
       annio = c1.get(Fecha.YEAR);
        mes = MES[c1.get(Fecha.MONTH)-1];
    }    
}