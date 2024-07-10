/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciojavapoo;

/**
 *
 * @author João Victor
 */
public class ExercicioJavaPOO {

    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(1);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.EstadoAtual();
        
        Banco p2 = new Banco();
        p2.setNumConta(2);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.EstadoAtual();
    }
}
