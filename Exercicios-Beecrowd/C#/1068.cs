using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exec
{
    internal class Program
    {
        static void Main(string[] args)

        {

            string entrada;

            List<string> list = new List<string>();

            while ((entrada = Console.ReadLine()) != null)
            {





                for (int i = 0; i < entrada.Length; i++)
                {
                    if (entrada[i].ToString() == "(" || entrada[i].ToString() == ")")
                    {
                        list.Add(entrada[i].ToString());
                        if (list[0] == ")")
                        {

                            break;
                        }
                        if (list.Contains("(") && list.Contains(")"))
                        {
                            list.Remove("(");
                            list.Remove(")");

                        }

                    }

                }
                if (list.Count == 0)
                {
                    Console.WriteLine("correct");
                }
                else
                {
                    Console.WriteLine("incorrect");
                }
                list.Clear();
            }
        }




    }
}

