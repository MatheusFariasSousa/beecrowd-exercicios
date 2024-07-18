using System; 

class URI {

    static void Main(string[] args) { 

        decimal b = Convert.ToDecimal(Console.ReadLine());

        int a = (int)b;
        int e = (int)((b - a) * 100);

        int cem = a / 100;
        int cinquenta = (a % 100) / 50;
        int vinte = ((a % 100) % 50) / 20;
        int dez = (((a % 100) % 50) % 20) / 10;
        int cinco = ((((a % 100) % 50) % 20) % 10) / 5;
        int dois = (((((a % 100) % 50) % 20) % 10) % 5) / 2;
        int um = ((((((a % 100) % 50) % 20) % 10) % 5) % 2);






        int fifty = (e % 100) / 50; ;
        int twenty_five = ((e % 100) % 50) / 25;
        int ten = (((e % 100) % 50) % 25) / 10;
        int five = ((((e % 100) % 50) % 25) % 10) / 5;
        int one = (((((e % 100) % 50) % 20) % 10) % 5);


        Console.WriteLine("NOTAS:");
        Console.WriteLine("{0} nota(s) de R$ 100.00", cem);
        Console.WriteLine("{0} nota(s) de R$ 50.00", cinquenta);
        Console.WriteLine("{0} nota(s) de R$ 20.00", vinte);
        Console.WriteLine("{0} nota(s) de R$ 10.00", dez);
        Console.WriteLine("{0} nota(s) de R$ 5.00", cinco);
        Console.WriteLine("{0} nota(s) de R$ 2.00", dois);




        Console.WriteLine("MOEDAS:");
        Console.WriteLine("{0} moeda(s) de R$ 1.00", um);
        Console.WriteLine("{0} moeda(s) de R$ 0.50", fifty);
        Console.WriteLine("{0} moeda(s) de R$ 0.25", twenty_five);
        Console.WriteLine("{0} moeda(s) de R$ 0.10", ten);
        Console.WriteLine("{0} moeda(s) de R$ 0.05", five);
        Console.WriteLine("{0} moeda(s) de R$ 0.01", one);
    }

}