using System.Numerics;
using System.Text;

namespace _3___Variables
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /* Variables = a block of data referenced by a name
             */

            Console.WriteLine("\n***** Variables *********\n");

            int x; // declaration
            x = 256; // initialization
            Console.WriteLine("X = " + x);

            int y = 13;
            Console.WriteLine("Y % 2 = " + y%2);

            int age = 20; // whole integer
            double gpa = 3.4; // decimal number
            bool isStudent = true;
            String name = "Spongebob";
            double height = 186; // in cm
            char currency = '€';
            double money = 45630.94;

            Console.WriteLine("You are " + age + " years old. ");
            Console.WriteLine("Your GPA is: " + gpa);
            Console.WriteLine("Your name is " + name);
            Console.WriteLine("Are you a student?: " + (isStudent ? "yes" : "no") );
            Console.WriteLine("Height: " + height + " cm");

            // Apparently you need to do something before displaying a special
            // character like the euro symbol
            Console.OutputEncoding = Encoding.UTF8;
            Console.WriteLine("Funds: " + currency + money);
        }
    }
}
