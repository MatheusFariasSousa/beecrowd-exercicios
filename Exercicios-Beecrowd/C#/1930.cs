using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Poo
{
    internal class Program
    {
        static void Main(string[] args)


        {
            string entrada = Console.ReadLine();
            string[] Entrada= entrada.Split(' ');
            int t1 = int.Parse(Entrada[0]);
            int t2 = int.Parse(Entrada[1]);
            int t3 = int.Parse(Entrada[2]);
            int t4 = int.Parse(Entrada[3]);
            Console.WriteLine((t1-1)+(t2-1)+(t3-1)+t4);
        }

    }
}
