package modelo;

public class EmpresaAutomotriz 
{
    private static final int SALARIO_MINIMO = 1000000;
    private int nominaEmpresa;

    public EmpresaAutomotriz()
    {
        this.nominaEmpresa = 0;
    }

    public EmpresaAutomotriz(int nominaEmpresa)
    {
        this.nominaEmpresa = nominaEmpresa;
    }

    public int  getnominaEmpresa()
    {
        return nominaEmpresa;
    }

    public void setnominaEmpresa(int nominaEmpresa)
    {
        this.nominaEmpresa = nominaEmpresa;
    }

    public static Empleados[] crearListaEmpleados(int numeroEmpleados)
    {
        return new Empleados[numeroEmpleados];
    }
}
