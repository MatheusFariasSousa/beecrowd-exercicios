using System; 

class URI {

    static void Main(string[] args) { 

            int tempo = Convert.ToInt32(Console.ReadLine());
            int ano = tempo / 365;
            int mes = (tempo % 365)/30;
            int dia = ((tempo % 365) % 30);
            Console.WriteLine("{0} ano(s)", ano);
            Console.WriteLine("{0} mes(es)", mes);
            Console.WriteLine("{0} dia(s)", dia);

    }

}