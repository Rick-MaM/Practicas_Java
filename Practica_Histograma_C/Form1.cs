using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Windows.Forms.DataVisualization.Charting;

namespace Practica_Histograma_C
{
    public partial class Form1 : Form
    {

        Double[] conjunto = { 5, 8, 9, 2, 7, 4, };
        String[] datos = { "A", "B", "C", "D", "E", "F" ,};
        Burbuja b;
        public Form1()
        {
            InitializeComponent();
            b = new Burbuja(conjunto);
        }

        private void btnOrdenar_Click(object sender, EventArgs e)
        {
            b.ordenar();
            conjunto = b.getResultado();


            Series series;
            chart1.Series.Clear();

            chart1.Palette = ChartColorPalette.SeaGreen;
            chart1.Titles.Add("Ventas");
            for (int i = 0; i < conjunto.Length; i++)
            {
                series = chart1.Series.Add(datos[i]);
                series.Points.Add(conjunto[i]);
            }

        }
    }
}
