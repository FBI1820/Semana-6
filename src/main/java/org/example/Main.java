package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*  int [] edades = new int [10];
int edad;
        System.out.println("Ingresa las edades de 10 edades:");
        for (int i= 0; i< 10; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Edad " + (i+1) + ":"));
            edades [i] = edad;
        }

        StringBuilder mensaje = new StringBuilder ();
        for (int e : edades){
            mensaje.append(e).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Edades ingresadas", JOptionPane.INFORMATION_MESSAGE);

*/
     //ingresar productos con su precio
        String [] Productos = new String [5];
        String producto;
        double precio;
        System.out.println("Ingresa los nombres de 5 productos con su precio:");
        for (int i= 0; i< 3; i++){
            producto = JOptionPane.showInputDialog("Producto " + (i+1) + ":");
            Productos [i] = producto;
            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del producto " + (i+1) + ":"));
            JOptionPane.showMessageDialog(null, "Producto: " + producto + "\nPrecio: " + precio, "Producto ingresado", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "mostrar todos los productos ingresados con su precio:" +Productos + "\n precio"+ precio, "Productos ingresados", JOptionPane.INFORMATION_MESSAGE);







        }



    }
}