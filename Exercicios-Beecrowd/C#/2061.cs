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
            string numeros = Console.ReadLine();
            string[] lista = numeros.Split(' ');
            int aba_inicial = int.Parse(lista[0]);
            int loop = int.Parse(lista[1]);
            for(int i = 0 ;i < loop; i++) {
                string comando = Console.ReadLine() ;
                if(comando == "fechou")
                {
                    aba_inicial++;

                }
                else
                {
                    aba_inicial--;
                }
            }
            Console.WriteLine(aba_inicial);

            
          
        }

    }
}
