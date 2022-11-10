package modelo;

public class Fecha {

    // Atributos
    private int dia;
    private int mes;
    private int anio;

    // Metodos
    // Constructor con 3 parametros
    /*Esto es para que en vez de usar Set para crear la fecha despues de creada la clase se crea la clase con
      esos parametros */
    public Fecha(int d, int m, int a)
    {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    // Constructor sin parametros
    public Fecha()
    {
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }

    // Constructor con parametro String dd/mm/aa
    public Fecha(String s)
    {
        // Buscamos la primera ocurrencia de '/'
        int pos1 = s.indexOf('/');
        
        // Buscamos la ultima ocurrencia de '/'
        int pos2 = s.lastIndexOf('/');

        // Extraemos el día
        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        // Extraemos el mes
        String sMes = s.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);

        // Extraemos el año
        String sAnio = s.substring(pos2 +1);
        anio = Integer.parseInt(sAnio);
    }


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
    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
    }
    public boolean equals(Object o){
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes == otra.mes) && (anio == otra.anio);
    }
}