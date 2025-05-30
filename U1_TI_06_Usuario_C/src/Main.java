import Seguro.User;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        User u = new User();
     //primero se hace un registro jej
        u.setUsername(JOptionPane.showInputDialog("REGISTRO - Ingrese el nombre de usuario"));
        u.setPassword(JOptionPane.showInputDialog("REGISTRO - Ingrese la contraseña"));

        //validar que el objeto u, tenga una contraseña puesta
        if(u.getPassword() != null && u.getPassword().isEmpty()) {
            System.out.println("Registro fallido. No se puede continuar.");
            return;
        }
        //se hace un "inicio de sesión"
        String intentUser =JOptionPane.showInputDialog("Ingrese el usuario");
        String intentPass =JOptionPane.showInputDialog("Ingrese la contraseña");

        //eto hace que se compare si lo guardado en el registro sea igual que en el inicio de sesion
        if(u.getUsername().equals(intentUser) && u.checkPassword(intentPass) ) {
            System.out.println("El usuario se encuentra con exito");
        }else {
            System.out.println("El usuario no se encuentra. Error en el usuario o contraseña");
        }





    }
}