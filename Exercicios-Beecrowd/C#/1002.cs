using System;

class Mult{
    static void Main(string[] args){
        double a = Convert.ToDouble(Console.ReadLine());
        double n = 3.14159;
        double raio = Math.Pow(a,2); 
        double area = raio*n;
        string area2 = area.ToString("F4");
        Console.WriteLine("A="+area2);

    }
}