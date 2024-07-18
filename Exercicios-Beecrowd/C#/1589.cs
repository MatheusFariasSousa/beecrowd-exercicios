using System; 

class URI {

    static void Main(string[] args) { 
        int controle = Convert.ToInt32(Console.ReadLine());
        while (controle != 0)
        {


            string rs = Console.ReadLine();
            string[] numbers = rs.Split(' ');
            int r1 = int.Parse(numbers[0].ToString());
            int r2 = int.Parse(numbers[1].ToString());
            Console.WriteLine(r1 + r2);
            controle -= 1;
        }

    }

}