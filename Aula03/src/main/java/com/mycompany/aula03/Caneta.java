/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03;

/**
 *
 * @author João Victor
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
        public void rabiscar(){
            if (this.tampada == true){
                System.out.println("Erro");
            }
            else{
                System.out.println("Rabisco");
            }
        }
        private void tampar(){
            this.tampada = true;
        }
        private void destampar(){
            this.tampada = false;
        }
        public void status(){
            System.out.println("A cor da caneta é " + this.cor);
            System.out.println("O modelo dela é " + this.modelo);
            System.out.println("A ponta dela é " + this.ponta);
            System.out.println(this.tampada);
        }
}

