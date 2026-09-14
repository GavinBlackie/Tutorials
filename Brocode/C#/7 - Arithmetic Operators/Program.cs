namespace _7___Arithmetic_Operators
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            uint friends = 4;

            Console.WriteLine("# of Friends: " + friends);
            friends = friends + 2;
            friends += 1;
            friends++;
            Console.WriteLine("# of Friends: " + friends);
            friends -= 2;
            friends--;
            Console.WriteLine("# of Friends: " + friends);

            //friends = friends * 5;
            friends *= 2;

            friends /= 3;
            // Remember integer division!!
            Console.WriteLine("# of Friends: " + friends);

            friends *= 3;
            friends += 2;
            uint remainder = friends % 3;
            Console.WriteLine("Rem: " + remainder);

            Console.ReadKey();
        }
    }
}
