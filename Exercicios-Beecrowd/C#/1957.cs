using System; 

class URI {

    static void Main(string[] args) { 

        int numero = Convert.ToInt32(Console.ReadLine());
        string hex = numero.ToString("X");
        Console.WriteLine(hex);

    }

}