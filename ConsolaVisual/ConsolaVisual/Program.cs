using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolaVisual
{
    class Program
    {
        static void Main(string[] args)
        {
            public static void main(String[] args)
            {

                int entrada;
                do
                {

                    Console.Out.WriteLine("------------------------------------------");
                    Console.Out.WriteLine("1- Factorial de un numero");
                    Console.Out.WriteLine("2- Tu nombre");
                    Console.Out.WriteLine("3- Valor maximo");
                    Console.Out.WriteLine("4- Salir ");
                    Console.Out.WriteLine("------------------------------------------");
                    entrada = Console.In.Read();
        
            switch (entrada)
                    {
                        case 1:
                            Console.Out.WriteLine("Escribe el numero del que sacaremos el factorial.");
                            break;
                        case 2:
                            Console.Out.WriteLine("Introduce tu nombre");
                            break;
                        case 3:
                            Console.Out.WriteLine("Introduce el numero de numeros a evaluar");
                            break;
                        case 4:
                            break;
                        default:
                            Console.Out.WriteLine("Introduce un valor valido");
                            break;
                    }
                } while (entrada != 4);
            }
        }
    }
}
