namespace _10___Hypotenuse_Calc
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            // Hypotenuse Calculator Program!!!

            double a, b, c;

            Console.Write("Enter side A: ");
            a = Convert.ToDouble(Console.ReadLine());
            Console.Write("Enter side B: ");
            b = Convert.ToDouble(Console.ReadLine());

            // Perform hypotenuse calc
            c = Math.Sqrt(Math.Pow(a, 2) + (b * b) );

            Console.WriteLine("The hypoteneuse, c, is: " + c);

        }
    }
}
