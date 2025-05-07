/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entorno;

/**
 *
 * @author isajisa
 */
public class Entorno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor = -4;
        int suma = 0;
        for (int i = 0; i < valor ; i++){
            suma += i;
        }
        int resultado = 0;
        resultado = suma;
        System.out.println(resultado);
    }
    
    public static int sumaNumero(int a, int b){
        int num;
        num = a +b;
        return num;
    }
    
}
