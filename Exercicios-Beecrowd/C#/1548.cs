using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace teste3
{
    internal class Program
    {
        static void Main(string[] args)
        {
        int caso_test=Convert.ToInt32( Console.ReadLine());
        List<int> list = new List<int>();
            int acertos = 0;
            for (int i = 0; i < caso_test; i++)
            {
                int quant_alunos = Convert.ToInt32( Console.ReadLine());
                string notas = Console.ReadLine();
                string[] lista_notas = notas.Split(' ');
                for(int a = 0; a < quant_alunos; a++)
                {
                    int nota_to_int = int.Parse(lista_notas[a]);
                    list.Add(nota_to_int);   
                }
                list.Sort();
                list.Reverse();
                for(int b = 0; b < quant_alunos; b++)
                {
                    
                    if (int.Parse(lista_notas[b]) == list[b])
                    {
                        acertos++;
                    }
                }
                Console.WriteLine(acertos);
                acertos= 0;
                list.Clear();
                




            }
            




        }
        
    }
}
