/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq2;

/**
 *
 * @author santiagob20
 */


//NUM TOTAL DE FICHAS 670

public class Lamina {
    int numeroLamina;
    boolean encontrada;
    String propietario;

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getNumeroLamina() {
        return numeroLamina;
    }

    public void setNumeroLamina(int numeroLamina) {
        this.numeroLamina = numeroLamina;
    }

    public boolean isEncontrada() {
        return encontrada;
    }

    public void setEncontrada(boolean encontrada) {
        this.encontrada = encontrada;
    }
}
