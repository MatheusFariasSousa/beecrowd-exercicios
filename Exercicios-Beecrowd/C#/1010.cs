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
            string[] lista_1= Console.ReadLine().Split();
            string[] lista_2 = Console.ReadLine().Split();
            double a = double.Parse(lista_1[1]);
            double b = double.Parse(lista_1[2]);
            double c = double.Parse(lista_2[1]);
            double d = double.Parse(lista_2[2]);
            double soma_1 = a * b;
            double soma_2 = c* d;
            double  resultado = soma_1 + soma_2;
            string final = resultado.ToString("F2");
            Console.WriteLine("VALOR A PAGAR: R$ {0}",final);

        }
    }
}