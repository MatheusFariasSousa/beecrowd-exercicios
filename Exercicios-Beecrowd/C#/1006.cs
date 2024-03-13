using System;

class Mult{
    static void Main(string[] args){
        double a = Convert.ToDouble(Console.ReadLine());
        double b = Convert.ToDouble(Console.ReadLine());
        double c = Convert.ToDouble(Console.ReadLine());
        a *= 2;
        b *=3;
        c *=5;
        double soma = (a+b+c)/10;
        string media = soma.ToString("F1");
        
        Console.WriteLine("MEDIA = "+ media);

    }
}