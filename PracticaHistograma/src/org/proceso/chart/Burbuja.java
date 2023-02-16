
package org.proceso.chart;


public class Burbuja {

    private int[] array;

    public Burbuja(int[] array) {
        this.array = array;
    }

    public void Ordenar() {
        int aux;
        for (int i=0;i<this.array.length;i++) {
            for (int j=1;j<this.array.length;j++) {
                if (this.array[j-1]>this.array[j]) {
                    aux = this.array[j];
                    this.array[j] = this.array[j - 1];
                    this.array[j - 1] = aux;
                }
            }
        }
    }

    public int[] getConjunto() {
        return this.array;
    }
}
