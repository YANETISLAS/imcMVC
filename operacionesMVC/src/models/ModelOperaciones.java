
package models;

public class ModelOperaciones {
    private float numero1 = 3.0f;
    private float numero2 = 2.8f;
    private float resultado = 0.0f;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    public void suma(){
        resultado = numero1 + numero2;
    }
    public void resta(){
        resultado = numero1 - numero2;
    }
    public void multiplicacion(){
        resultado = numero1 * numero2;
    }
    public void division(){
        resultado = numero1 / numero2;
    }
    public void modulo(){
        resultado = numero1 % numero2;
    }
      
}
