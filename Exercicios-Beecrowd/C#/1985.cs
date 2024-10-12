using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;

class URI


    {
    static void Main(string[] args)

    {   
       
       var dicionario = new Dictionary<int, double> { 
           { 1001, 1.50 }, { 1002, 2.50 }, { 1003, 3.5 }, { 1004, 4.50 }, { 1005,5.50}   
       };
        int contador = Convert.ToInt32(Console.ReadLine());
        double soma_final = 0.0;
        for (int i = 0; contador > i; i++)
        {

            string receita = Console.ReadLine();
            string[] lista = receita.Split(' ');
            int codigo = int.Parse(lista[0].ToString());
            int quantidade = int.Parse(lista[1].ToString());
            soma_final += (dicionario[codigo]*quantidade);
        }
        string total = soma_final.ToString("F2").Replace(",", ".");
        Console.WriteLine(total);

        




    }
        

    }
        
   



