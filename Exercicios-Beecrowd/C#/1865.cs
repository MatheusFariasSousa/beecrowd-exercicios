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

            string list = Console.ReadLine();
            string[] pessoa_forca = list.Split(' ');
            string nome = pessoa_forca[0];
            string forca = pessoa_forca[1];
            if (nome =="Thor" && int.Parse(forca)!=0)
            {
                Console.WriteLine('Y');
            }
            else
            {
                Console.WriteLine('N');
            }
        }

    }
        
   



}
