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
            int a = Convert.ToInt32(lista[0]);
            int b = Convert.ToInt32(lista[1]);
            int c = Convert.ToInt32(lista[2]);

            if (a >= b && a >= c)
            {
                Console.WriteLine("{0} eh o maior", a);
            }
           else if (b >= a && b >= c)
            {
                Console.WriteLine("{0} eh o maior", b);
            }
            else
            {
                Console.WriteLine("{0} eh o maior", c);

            }

        }
    }
}