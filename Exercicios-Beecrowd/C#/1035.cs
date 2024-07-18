using System; 

class URI {

    static void Main(string[] args) { 

        string z = Console.ReadLine().Replace(" ","");
        int a = Convert.ToInt32(z[0]);
        int b = Convert.ToInt32(z[1]);
        int c = Convert.ToInt32(z[2]);
        int d = Convert.ToInt32(z[3]);
        if (b>c && d>a && c+d>a+b && c>0  && d>0 && a%2==0) {
            Console.WriteLine("Valores aceitos");
        }
        else
        {
            Console.WriteLine("Valores nao aceitos");
        }

    }

}