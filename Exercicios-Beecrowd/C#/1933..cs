using System; 

class URI {

    static void Main(string[] args) { 
        string cartas = Console.ReadLine();
        string[] result = cartas.Split(' ');

        int carta1 = int.Parse(result[0]);
        int carta2 = int.Parse(result[1]);
        if (carta1 > carta2)
        {
            Console.WriteLine(carta1);

        }
        else
        {
            Console.WriteLine(carta2);

        }
    }

}