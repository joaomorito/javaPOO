/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author João Victor
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
        void rabiscar(){
            if (this.tampada == true){
                System.out.println("Erro");
            }
            else{
                System.out.println("Rabisco");
            }
        }
        void tampar(){
            this.tampada = true;
        }
        void destampar(){
            this.tampada = false;
        }
        void status(){
            System.out.println("A cor da caneta é " + this.cor);
            System.out.println("O modelo dela é " + this.modelo);
            System.out.println("A ponta dela é " + this.ponta);
            System.out.println(this.tampada);
        }
}
