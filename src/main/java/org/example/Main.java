package org.example;
<<<<<<< HEAD
import java.util.Scanner;
=======

import javax.swing.*;

>>>>>>> 7bf38966883b056a6d2f3f5ac76d137462ce5e2f
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD

                Scanner sc = new Scanner(System.in);

                // 1. Suma de elementos
                System.out.println("Ingrese la cantidad de números para la suma:");
                int n1 = sc.nextInt();
                int[] arreglo1 = new int[n1];
                int suma = 0;
                for (int i = 0; i < n1; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    arreglo1[i] = sc.nextInt();
                    suma += arreglo1[i];
                }
                System.out.println("Suma total: " + suma);

                // 2. Número mayor
                System.out.println("\nIngrese la cantidad de números para encontrar el mayor:");
                int n2 = sc.nextInt();
                int[] arreglo2 = new int[n2];
                for (int i = 0; i < n2; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    arreglo2[i] = sc.nextInt();
                }
                int mayor = arreglo2[0];
                for (int i = 1; i < arreglo2.length; i++) {
                    if (arreglo2[i] > mayor) {
                        mayor = arreglo2[i];
                    }
                }
                System.out.println("Número mayor: " + mayor);

                // 3. Contar elementos pares
                System.out.println("\nIngrese la cantidad de números para contar pares:");
                int n3 = sc.nextInt();
                int[] arreglo3 = new int[n3];
                int contadorPares = 0;
                for (int i = 0; i < n3; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    arreglo3[i] = sc.nextInt();
                    if (arreglo3[i] % 2 == 0) {
                        contadorPares++;
                    }
                }
                System.out.println("Cantidad de pares: " + contadorPares);

                // 4. Invertir un arreglo
                System.out.println("\nIngrese la cantidad de números para invertir:");
                int n4 = sc.nextInt();
                int[] arreglo4 = new int[n4];
                for (int i = 0; i < n4; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    arreglo4[i] = sc.nextInt();
                }
                int[] invertido = new int[arreglo4.length];
                for (int i = 0; i < arreglo4.length; i++) {
                    invertido[i] = arreglo4[arreglo4.length - 1 - i];
                }
                System.out.print("Arreglo invertido: ");
                for (int i = 0; i < invertido.length; i++) {
                    System.out.print(invertido[i] + " ");
                }
                System.out.println();

                // 5. Eliminar duplicados
                System.out.println("\nIngrese la cantidad de números para eliminar duplicados:");
                int n5 = sc.nextInt();
                int[] arreglo5 = new int[n5];
                for (int i = 0; i < n5; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    arreglo5[i] = sc.nextInt();
                }

                int[] sinDuplicados = new int[arreglo5.length];
                int indice = 0;
                for (int i = 0; i < arreglo5.length; i++) {
                    boolean repetido = false;
                    for (int j = 0; j < indice; j++) {
                        if (arreglo5[i] == sinDuplicados[j]) {
                            repetido = true;
                            break;
                        }
                    }
                    if (!repetido) {
                        sinDuplicados[indice] = arreglo5[i];
                        indice++;
                    }
                }

                System.out.print("Arreglo sin duplicados: ");
                for (int i = 0; i < indice; i++) {
                    System.out.print(sinDuplicados[i] + " ");
                }
            }
        }


=======
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
>>>>>>> 7bf38966883b056a6d2f3f5ac76d137462ce5e2f
