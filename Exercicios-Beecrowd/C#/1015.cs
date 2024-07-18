using System; 

class URI {

    static void Main(string[] args) { 
            string[] lista1 = Console.ReadLine().Split(' ');
            string[] lista2 = Console.ReadLine().Split(' ');
            double a = Convert.ToDouble(lista1[0]);
            double b = Convert.ToDouble(lista1[1]);
            double c = Convert.ToDouble(lista2[0]);
            double d = Convert.ToDouble(lista2[1]);
            double valor = Math.Pow((Math.Pow((c - a), 2) + Math.Pow((d - b), 2)), 0.5);
            string resposta = valor.ToString("F4");
            Console.WriteLine(resposta);
    }

}