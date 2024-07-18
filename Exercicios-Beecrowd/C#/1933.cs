using System; 

class URI {

    static void Main(string[] args) { 

            int a = Convert.ToInt32(Console.ReadLine());
            double b = Convert.ToDouble(Console.ReadLine());
            double c = a /b;
            string resposta = c.ToString("F3");

            Console.WriteLine("{0} km/l",resposta);

    }

}