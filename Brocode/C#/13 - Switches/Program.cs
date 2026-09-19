namespace _13___Switches
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            // switch = an efficient alternative to many else if statements
            //
            // "switch on a literal"

            Console.Write("What day is it today?: ");
            String? day = Console.ReadLine();

            day = day?.Trim();

            switch (day)
            {
                case "monday":
                    Console.WriteLine("It's Monday!");
                    break;
                case "tuesday":
                    Console.WriteLine("It's Tuesday!");
                    break;
                case "wednesday":
                    Console.WriteLine("It's Wednesday!");
                    break;
                case "thursday":
                    Console.WriteLine("It's Thursday!");
                    break;
                case "friday":
                    Console.WriteLine("It's Friday!");
                    break;
                case "saturday":
                    Console.WriteLine("It's Saturday!");
                    break;
                case "sunday":
                    Console.WriteLine("It's Sunday!");
                    break;
            }
            switch (day)
            {
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                case "friday":
                    Console.WriteLine("It is a weekday.");
                    break;
                case "saturday":
                case "sunday":
                    Console.WriteLine("It is the weekend!");
                    break;
            }

            Console.ReadKey();
        }
    }
}
