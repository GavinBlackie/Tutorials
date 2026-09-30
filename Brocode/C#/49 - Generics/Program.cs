namespace _49___Generics
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // generic = "not specific to a particular data type"
            //            add <T> to: classes, methods, fields, etc.
            //            allows for code reusability for different data types
            //             
            //         part of Parametric Polymorphism
            //
            //          "Some generic type T"

            // generic => generic, boring data type (could be anything)
            //            not specific to any data type

            int[] intArr = { 1, 2, 3};
            double[] dubArr = { 1.0, 2.0, 3.0};
            String[] strArr = { "1", "2", "3" };

            displayElements(intArr);
            displayElements(dubArr);
            displayElements(strArr);

            // Calls to generics have implied <type>
            displayAllElements<int>(intArr);
            displayAllElements(dubArr);
            displayAllElements(strArr);

            Console.ReadKey();
        }

        // With Generics:
        public static void displayAllElements<Thing>(Thing[] arr)
        {
            foreach (Thing item in arr)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine(arr.GetType());
        }


        // Normally: declare overloaded funcs
        public static void displayElements(int[] arr)
        {
            foreach (int item in arr)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();
        }
        public static void displayElements(double[] arr)
        {
            foreach (double item in arr)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();
        }
        public static void displayElements(String[] arr)
        {
            foreach (String item in arr)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();
        }
    }
}
