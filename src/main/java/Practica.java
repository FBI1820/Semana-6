import javax.swing.*;

public class Practica {

    // Mostrar las edades mayores de 18 y menores de 25
    public static void main(String[] args) {
        int[] edades = new int[10];
        int edad;
        System.out.println("Ingresa las edades de 10 edades:");
        for (int i = 0; i < 10;
             i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Edad " + (i + 1) + ":"));
            edades[i] = edad;

                StringBuilder mensaje = new StringBuilder();
                for (int e : edades) {

                    if (edad > 18 && edad < 25) {

                        mensaje.append(e).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, mensaje.toString(), "Edades ingresadas", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }
    }


