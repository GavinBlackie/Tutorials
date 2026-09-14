namespace _8___Math_Class
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            // Math class => useful math functions builtinto C#

            double x = 7;
            double y = 5;

            double a = Math.Pow(x, 2);
            Console.WriteLine(x);

            double b = Math.Sqrt(113);
            Console.WriteLine(b);

            double c = Math.Abs(-432423424.43242342);
            Console.WriteLine(c);

            // Remember the capitalization of these functions!!
            double d = Math.Round(45.54353);
            Console.WriteLine(d);

            double e = Math.Ceiling(3.1);
            Console.WriteLine(e);

            double f = Math.Floor(2.9);
            Console.WriteLine(f);

            double h = Math.Max(x, y);
            Console.WriteLine(h);

            // sin(pi) == 0/1 == 0
            // Note: this has floating point errors!!
            Console.WriteLine(Math.Sin(Math.PI));

            Console.ReadKey();
        }
    }
}
