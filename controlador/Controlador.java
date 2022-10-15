package controlador;

import modelo.Carro;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import vista.PanelEntradaDatos;
import vsta.PanelResultados;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;
    private Carro miCarro;
    private ArrayList<Carro> carrosVendidos = new ArrayList<>();

    public Controlador(VentanaPrincipal miVentanaPrincipal, EmpresaAutomotriz modelo) {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.miVentanaPrincipal.miPanelOperaciones.btnAgregar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btnCalcular.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btnBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando.equals("agregarCarro")) {
            String nombre = PanelEntradaDatos.getTfNombre();
            int precio = Integer.parseInt(PanelEntradaDatos.getTfPrecio());
            miCarro = new Carro(nombre, precio);
            PanelResultados.mostrarResultados("Se ha registrado una nueva venta!\n");
            carrosVendidos.add(miCarro);
        } else if (comando.equals("calcularSalario")) {
            Empleado.calcularSalario(carrosVendidos);

        } else if (comando.equals("borrarTexto")) {
            carrosVendidos.clear();
            view.PanelEntrada.borrarTf();
            this.miVentanaPrincipal.miPanelResultados.borrarTa();
        } else if (comando.equals("cerrarVentana")) {
            JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Venta de Carros",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}