using System; 

class URI {

    static void Main(string[] args) { 

        string achar = Console.ReadLine();
        string a = Console.ReadLine();
        string[]lista = a.Split(' ');
        int somador = 0;
        for (int i = 0; i < 5; i++)
        {
            if (lista[i] == achar)
            {
                somador += 1;
            }
        }
        Console.WriteLine(somador);

    }

}