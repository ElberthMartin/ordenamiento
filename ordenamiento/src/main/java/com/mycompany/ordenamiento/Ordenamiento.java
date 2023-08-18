/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamiento;

import javax.swing.JOptionPane;

public class Ordenamiento {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        // Ingreso de los 5 números
        for (int i = 0; i < numeros.length; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número #" + (i + 1));
            numeros[i] = Integer.parseInt(input);
        }

        // Algoritmo de ordenamiento
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Mostrar los números ordenados
        StringBuilder mensaje = new StringBuilder("Números ordenados de menor a mayor:\n");
        for (int numero : numeros) {
            mensaje.append(numero).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Números Ordenados", JOptionPane.INFORMATION_MESSAGE);
    }
}
