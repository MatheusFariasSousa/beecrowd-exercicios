using System; 

class URI {

    static void Main(string[] args) { 

            int a = Convert.ToInt32(Console.ReadLine());
            int cem= a / 100;
            int cinquenta = (a % 100)/50;
            int vinte = ((a % 100)%50)/20;
            int dez = (((a % 100) % 50) % 20)/10;
            int cinco = ((((a % 100) % 50) % 20)% 10)/5;
            int dois = (((((a % 100) % 50) % 20) % 10) % 5)/2;
            int um = ((((((a % 100) % 50) % 20) % 10) % 5) % 2);
            Console.WriteLine(a);
            Console.WriteLine("{0} nota(s) de R$ 100,00",cem);
            Console.WriteLine("{0} nota(s) de R$ 50,00", cinquenta);
            Console.WriteLine("{0} nota(s) de R$ 20,00", vinte);
            Console.WriteLine("{0} nota(s) de R$ 10,00", dez);
            Console.WriteLine("{0} nota(s) de R$ 5,00", cinco);
            Console.WriteLine("{0} nota(s) de R$ 2,00", dois);
            Console.WriteLine("{0} nota(s) de R$ 1,00", um);
    }

}