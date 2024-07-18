using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;

class URI


    {
    static void Main(string[] args)

    {   
        int controle = Convert.ToInt32(Console.ReadLine());
        for (int i = 0; i < controle; i++)
        {
            int par_ou_impar= Convert.ToInt32(Console.ReadLine());
            if(par_ou_impar % 2 == 0)
            {
                Console.WriteLine(0);
            }
            else
            {
                Console.WriteLine(1);
            }
            
        }

    }
        
   



}