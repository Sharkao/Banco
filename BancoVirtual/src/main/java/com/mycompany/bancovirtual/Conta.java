/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

/**
 *
 * @author Pichau
 */
import java.util.Scanner;

public class Conta {

    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    public Conta(String nome, int conta, double saldo_inicial) {
        this.nome = nome;
        this.conta = conta;
        saldo = saldo_inicial;
        saques = 0;
    }
}
