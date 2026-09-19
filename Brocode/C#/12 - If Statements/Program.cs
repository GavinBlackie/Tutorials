using System.ComponentModel.Design;

namespace _12___If_Statements
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            // if statement => a basic form of decision making
            //
            // Basically uses C/Java syntax
            // Ternary operators also exist as well:  ___ ? 1 : 2;

            // Small age-verification program:
            // (for some hypothetical country's voting sytem)
            bool isPrompting = true;
            ushort age = 0;
            while (isPrompting)
            {
                Console.Write("Please enter your age: ");
                try
                {
                    age = Convert.ToUInt16(Console.ReadLine());
                    isPrompting = false;
                }
                catch (FormatException)
                {
                    Console.WriteLine("That's not a valid age, try again!");
                }
            }
            Console.WriteLine("You are " + age + " years old. ");

            if (age < 18) // (0, 18)
            {
                Console.WriteLine("You are too young to vote!");
            }
            else if (age < 75) // [18, 75)
            {
                Console.WriteLine("You are eligible to vote. ");
            }
            else // Else they are above 75, [75, +inf)
            {
                Console.WriteLine("""
                    You are too old to vote here!
                    We do not support old geezers here.
                    """);
            }

            Console.Write("Enter your name: ");
            string name = Console.ReadLine();

            // Don't have to use brackets if there is only one statement!
            // (just like Java)
            if (name == null)
                Console.WriteLine("You did not enter a name. ");
            else
                Console.WriteLine("Your name is " + name);

            Console.ReadKey();
        }
    }
}
