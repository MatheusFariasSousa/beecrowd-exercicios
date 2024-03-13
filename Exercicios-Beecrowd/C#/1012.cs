using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Teste
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] lista= Console.ReadLine().Split();
            double a = Convert.ToDouble(lista[0]);
            double b = Convert.ToDouble(lista[1]);
            double c = Convert.ToDouble(lista[2]);
            double triangulo = (a * c) / 2;
            double circulo = Math.Pow(c, 2)* 3.14159 ;
            double trapezio = ((a + b) * c) / 2;
            double quadrado = b* b;
            double retangulo = a * b;
            string tri = triangulo.ToString("F3");
            string cir = circulo.ToString("F3");
            string tra = trapezio.ToString("F3");
            string qua = quadrado.ToString("F3");
            string ret = retangulo.ToString("F3");
            Console.WriteLine("TRIANGULO: {0}",tri);
            Console.WriteLine("CIRCULO: {0}", cir);
            Console.WriteLine("TRAPEZIO: {0}", tra);
            Console.WriteLine("QUADRADO: {0}", qua);
            Console.WriteLine("RETANGULO: {0}", ret);


        }
    }
}