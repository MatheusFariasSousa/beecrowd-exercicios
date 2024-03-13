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
            string Z = Convert.ToString(Console.ReadLine());
            double a = Convert.ToDouble(Console.ReadLine());
            double b = Convert.ToDouble(Console.ReadLine());
            double soma = a + (b * 0.15);
            string resultado = soma.ToString("F2");
            Console.WriteLine("TOTAL = R$ {0}",resultado);
            


        }
    }
}
