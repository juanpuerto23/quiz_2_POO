package modelo;

public class Empleados 
{
    private String nombreEmpleado;
    private int numVentas;
    private int SalarioMensual;
    
    public Empleados()
    {
        this.SalarioMensual = 0;
        this.numVentas = 0;
        this.nombreEmpleado = "";
    }

    public Empleados(int numVentas, int SalarioMensual, String nombreEmpleado)
    {
        this.numVentas = numVentas;
        this.SalarioMensual = SalarioMensual;
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getnombreEmpleado()
    {
        return nombreEmpleado;
    }

    public int getnumVentas()
    {
        return numVentas;
    }

    public int getSalarioMensual()
    {
        return SalarioMensual;
    }

    public void setnombreEmpleado(String nombreEmpleado)
    {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setnumVentas(int numVentas)
    {
        this.numVentas = numVentas;
    }

    public void setSalarioMensual(int SalarioMensual)
    {
        this.SalarioMensual = SalarioMensual;
    }

    public static Ventas[] crearListaVentas(int numVentas)
    {
        return new Ventas[numVentas];
    }

}
