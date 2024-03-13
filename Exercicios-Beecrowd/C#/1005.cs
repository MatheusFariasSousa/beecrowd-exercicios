using System;

class Mult{
    static void Main(string[] args){
        double a = Convert.ToDouble(Console.ReadLine());
        double b = Convert.ToDouble(Console.ReadLine());
        a *= 3.5;
        b *=7.5;
        double soma = (a+b)/11;
        string media = soma.ToString("F5");
        
        Console.WriteLine("MEDIA = "+ media);

    }
}