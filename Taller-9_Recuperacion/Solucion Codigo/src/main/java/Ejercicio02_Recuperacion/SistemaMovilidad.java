package Ejercicio02_Recuperacion;

import java.util.ArrayList;
import java.util.List;

public class SistemaMovilidad {

    public List<Usuario> usuarios = new ArrayList<>();
    public List<Movilidad> servicios = new ArrayList<>();

    public void registrarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void agregarServicio(Movilidad s) {
        servicios.add(s);
    }

    public void mostrarFacturas() {
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(servicios.get(i).generarFactura(usuarios.get(i)));
            servicios.get(i).calificarServicio((int) (Math.random() * 5 + 1));
        }
    }

}
