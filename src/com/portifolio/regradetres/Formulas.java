/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portifolio.regradetres;

/**
 *
 * @author fabinho
 */
public class Formulas {
    // entrada dos dados digitados

    /*
        int n0 = Integer.parseInt(txtN0.getText());
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        int n3 = Integer.parseInt(txtN3.getText());
     */
    /**
     * Houve a mudança de int para float por conta do arredondamento que o int
     * faz
     */
    public float Resolucao0(float n0, float n1, float n3) {
        float n2 = n3 * n0 / n1;
        return n2;
    }

    public float Resolucao1(float n0, float n1, float n2) {
        float n3 = n2 * n1 / n0;
        return n3;
    }
    

}
