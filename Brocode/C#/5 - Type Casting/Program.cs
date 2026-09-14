namespace _5___Type_Casting
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // type casting => Converting a value of one type to another type value
            //
            //                 Useful when accepting user input (string), and
            //                 converting it into a number (int, float, etc.)
            //
            //                 Different data can do different things, and being
            //                 able to convert between different types is
            //                 extremely useful

            // Implicit casting => when compiler "implies" a cast
            // Explicit casting => when programmer "explicitly" says to cast,
            //                     especially when that cast is dangerous
            //                     (ie. may not work)

            double balance = -3.60;

            // Bewere: this doesn't cause an exception!
            //uint castedBalance = (uint) balance;

            // but Convert. methods raise OverflowExceptions!
            uint castedBalance;
            try
            {
                castedBalance = Convert.ToUInt32(balance);
            }
            catch (OverflowException e)
            {
                Console.WriteLine("Balance was not in uint32 number range");
                balance *= -1;
                castedBalance = Convert.ToUInt32(balance);
            }

            //int castedBalance = Convert.ToInt32(balance);

            Console.WriteLine("The balance is: $" + balance);
            Console.WriteLine("The casted balance is: $" + castedBalance);

            int roundedBalance = (int) Math.Round(balance);

            Console.WriteLine("The rounded balance is: $" + roundedBalance);

            Console.WriteLine(balance.GetType());
            Console.WriteLine(castedBalance.GetType());

            long bigNum = 4523424234243;
            Console.WriteLine(bigNum.GetType());

            short n = 432;
            // There is no .ToFloat, use .ToSingle (think of "single, double")
            float f = (float) Convert.ToSingle(n);
            Console.WriteLine(f + " " + f.GetType());


            String myStr = Convert.ToString(n);
            Console.WriteLine(myStr + " " + myStr.GetType());

            char currency = '€';

            // So special chars can be typed:
            Console.OutputEncoding = System.Text.Encoding.UTF8;

            Console.WriteLine("Currency: " + currency);

            try
            {
                char c = Convert.ToChar(myStr);
            }
            catch (FormatException e)
            {
                Console.WriteLine("Cannot convert >1 length string into a char!");
            }

            String student = "true";
            bool isStudent = Convert.ToBoolean(student);
            // remember bool literals are capitalized in C#
            Console.WriteLine(student + " " + isStudent);

            Console.ReadKey();
        }
    }
}
