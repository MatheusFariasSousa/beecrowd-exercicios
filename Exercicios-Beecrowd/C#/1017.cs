using System; 

class URI {

    static void Main(string[] args) { 

            double a = Convert.ToDouble(Console.ReadLine());
            double b = Convert.ToDouble(Console.ReadLine());
            double c = (a * b) / 12;
            string resposta = c.ToString("F3");
            Console.WriteLine(resposta);
    }

}