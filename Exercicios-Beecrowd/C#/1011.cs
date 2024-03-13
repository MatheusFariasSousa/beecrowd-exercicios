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
            double r = Convert.ToDouble(Console.ReadLine());
            double resultado = (4.0 / 3) * 3.14159 * (Math.Pow(r, 3));
            string final = resultado.ToString("F3");
            Console.WriteLine("VOLUME = {0}",final); 

        }
    }
}