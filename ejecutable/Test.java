
package ejecutable;

import controlador.Controlador;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;

public class Test {
    public static void main(String[] args) {
        EmpresaAutomotriz miVentaCarros = new EmpresaAutomotriz();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miVentaCarros);
    }
}