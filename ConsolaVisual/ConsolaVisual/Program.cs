using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ClassLibrary1;

namespace ConsolaVisual
{
    class Program
    {
        static void Main(string[] args)
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
                    entrada = Convert.ToInt32(Console.ReadLine());

                switch (entrada)
                    {
                        case 1:
                            Console.Out.WriteLine("Escribe el numero del que sacaremos el factorial.");
                            ClassLibrary1.Class1.factorial(Convert.ToInt32(Console.ReadLine()));
                            break;
                        case 2:
                            Console.Out.WriteLine("Introduce tu nombre");
                            ClassLibrary1.Class1.escribirNombre(Console.ReadLine());
                            break;
                        case 3:
                            Console.Out.WriteLine("Introduce el numero de numeros a evaluar");
                            ClassLibrary1.Class1.listaNumeros(Convert.ToInt32(Console.ReadLine()));
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
