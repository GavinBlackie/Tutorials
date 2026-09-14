namespace _6___UserInput
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Console.Write("What's your name?: ");
            String name = Console.ReadLine();

            Console.WriteLine("Hello & Welcome, " + name);

            Console.Write("What's your age?: ");
            bool isPrompting = true;
            uint age = 0;
            while (isPrompting)
            {
                try
                {
                    age = Convert.ToUInt32(Console.ReadLine());
                    isPrompting = false;
                }
                catch (FormatException)
                {
                    Console.WriteLine("That's not a valid integer");
                }
                catch (OverflowException)
                {
                    Console.WriteLine("That number is out of the int32 range");
                }
            }

            Console.WriteLine("You are " + age + " years old. ");

            Console.ReadKey();
        }
    }
}
