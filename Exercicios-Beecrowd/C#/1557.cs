using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;

class URI


    {
    static void Main(string[] args)

    {
        int entrada;
        List<int> lista = new List<int>();
        do
        {
            entrada = Convert.ToInt32(Console.ReadLine());
            if (entrada == 0)
            {
                break;
            }
            int controlador = entrada;
            int somador = 1;
            int inial = 1;
            for (int f = 0; f < controlador; f++)
            {
                for (int i = 0; i < controlador; i++)
                {

                    lista.Add(somador);
                    somador *= 2;
                }
                inial *= 2;
                somador = inial;

            }
            int corte = 0;
            for (int corredor =0;corredor < lista.Count(); corredor++)
            {
                
                int separador = lista.Max().ToString().Length;
                if (corte+1 == entrada)
                {
                    Console.WriteLine(lista[corredor].ToString().PadLeft(separador));
                    corte = 0;
                }
                else
                {
                    Console.Write(lista[corredor].ToString().PadLeft(separador)+" ");
                    corte += 1;

                }
                
            }
            Console.WriteLine();
            lista.Clear();
        }while (entrada!=0);
        
    }
        
   



}