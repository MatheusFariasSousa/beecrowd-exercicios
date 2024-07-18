using System; 

class URI {

    static void Main(string[] args) { 

            int tempo = Convert.ToInt32(Console.ReadLine());
            int hora = tempo / 3600;
            int segundos = tempo % 60;
            int min = ((tempo - segundos) % 3600)/60;
            Console.WriteLine("{0}:{1}:{2}",hora,min,segundos);
    }

}