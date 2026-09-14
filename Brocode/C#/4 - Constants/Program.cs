namespace _4___Constants
{
    internal class Program
    {
        static readonly string[] nums = { "a" };

        public static void Main(string[] args)
        {

            // constants => immutable, or unchangable, values known at compile time
            //              and do not change for the life of the program

            const double pi = 3.1459;

            // Will not work with const!!
            //pi = 42069;

            // REMEMBER: const is only applied at COMPILE TIME
            //
            //  This means if you want "constant" or read-only values for
            //  more complex stuff, you need to use static readonly!

            // const int[] nums = { 1, 2, 3, 4, 5, 6, -1 }; // does not work
            
            // This also does not work - it must be a field attribute
            // static readonly string[] nums = { "a"};

            Console.WriteLine(nums);

            Console.WriteLine(pi);

            Console.ReadKey();
        }
    }
}
