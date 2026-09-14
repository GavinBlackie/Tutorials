namespace _9___Random_Numbers
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            // Random Numbers in C#!!!
            // (Pseudorandom - close to random, but not enough
            //                 for greasy nerds - but I'm not one of them :))) )

            Random random = new Random();

            // random whole integer between 0 and like 2 billion
            Console.WriteLine(random.Next());

            // You can specify a range:
            // [Inclusive, Exclusive)
            Console.WriteLine(random.Next(1, 7));

            // Generates a random decimal number between 0 and 1
            double num = random.NextDouble();
            Console.WriteLine(num);

            Console.WriteLine("\n****************\n");

            // Do 10 20-sided dice rolls
            for (int iRoll = 0; iRoll < 10; iRoll++)
            {
                Console.WriteLine(random.Next(1, 21));
            }

            Console.ReadKey();
        }
    }
}
