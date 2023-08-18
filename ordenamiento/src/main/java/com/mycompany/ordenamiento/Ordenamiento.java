/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamiento;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Ordenamiento {
//Declaramos la clase principal
    public class OrdenamientoNumeros {
    public static void main(String[] args) {
//ahora declaramos y creamos el array de numeros
        int[] numeros = new int[5];

// ingreso de numero de        
for (int i = 0; i < numeros.length; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el número #" + (i + 1));
            numeros[i] = Integer.parseInt(input);
        }
//crear//bucle
 for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                
                     if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
