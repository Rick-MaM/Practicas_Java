using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practica_Histograma_C
{
    class Burbuja
    {
        private Double [] array;

        public Burbuja(Double[] array)
        {
            this.array = array;
        }

        public void ordenar()
        {
            Double aux;
            for (int i = 0; i < this.array.Length; i++)
            {
                for (int j = 1; j < this.array.Length; j++)
                {
                    if (this.array[j - 1] > this.array[j])
                    {
                        aux = this.array[j];
                        this.array[j] = this.array[j - 1];
                        this.array[j - 1] = aux;
                    }
                }
            }
        }

        public Double[] getResultado()
        {
            return this.array;
        }

    }
}
