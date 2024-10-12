using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace Poo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            int quantidade = Convert.ToInt32(Console.ReadLine());
            int mult2=0;
            int mult3=0;
            int mult4=0;
            int mult5 = 0;
            string valores = Console.ReadLine();
            string[]lista = valores.Split(' '); 
            for (int i= 0;i<quantidade;i++) {
                int val = int.Parse(lista[i]);
                if (val % 2==0) {
                    mult2++;
                }
                if (val % 3 == 0)
                {
                    mult3++;
                }
                if (val % 4 == 0)
                {
                    mult4++;
                }
                if (val % 5 == 0)
                {
                    mult5++;
                }


            }
            Console.WriteLine("{0} Multiplo(s) de 2",mult2);
            Console.WriteLine("{0} Multiplo(s) de 3",mult3);
            Console.WriteLine("{0} Multiplo(s) de 4",mult4);
            Console.WriteLine("{0} Multiplo(s) de 5",mult5);

        }

    }
}
