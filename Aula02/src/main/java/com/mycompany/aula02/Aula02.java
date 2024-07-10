/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02;

/**
 *
 * @author João Victor
 */
public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Preta";
        c1.carga = 90;
        c1.modelo = "Esferográfica";
        c1.ponta = 0.5f;
        c1.tampada = false;
        
        c1.status();
    }
}
