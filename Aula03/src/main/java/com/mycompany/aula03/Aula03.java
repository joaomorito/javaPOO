/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula03;

/**
 *
 * @author João Victor
 */
public class Aula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";      //public em Caneta.java
        c1.modelo = "BIC";         //public em Caneta.java
        c1.tampada = false;          //protected em Caneta.java
        //c1.ponta = 0.5f;       //private em Caneta.java, não pode ser utilizado
        
        //protected funciona também pois o objeto c1 esta instânciando a classe Caneta
    }
}
