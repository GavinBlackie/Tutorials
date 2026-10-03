namespace _44___Lists
{
    internal class Program
    {
        static void Main(string[] args)
        {

            // List = data structure representing a list of objects accessed by index
            //        Similar to an array, but can dynamically resize (grow/shrink)
            //  
            //  using System.Collections.Generic

            // an array:
            String[] fruits = new string[3];
            fruits[0] = "apple";
            fruits[1] = "pear";
            fruits[2] = "pineapple";
            try
            {
                fruits[3] = "peach";
            } catch (IndexOutOfRangeException)
            {
                Console.WriteLine("Can't add to index 3");
            }

            List<string> vegtables = new List<string>();
            List<double> grades = new();

            // Add => adds a single element
            vegtables.Add("carrot");
            vegtables.Add("broccoli");
            vegtables.Add("potato");
            vegtables.Add("rhubarb");

            // note: C# uses "in" instead of Java's ":" in these
            //       foreach loops (but java just uses for keyword)
            foreach (string vegtable in vegtables) {
                Console.WriteLine(vegtable);
            }

            grades.Add(3.5);
            grades.Add(2.1);
            double[] dubArr = { 4.0, 3.4, 3.5, 2.9, 2.7, 3.5 };

            // AddRange = Add an IEnumerable to the List
            grades.AddRange(dubArr);
            foreach (double d in dubArr)
                Console.WriteLine(d);

            // IndexOf = Return index of an element, -1 if it doesn't exist
            Console.WriteLine("\nIndex of potato: " + vegtables.IndexOf("potato"));
            Console.WriteLine("Index of tomato: " + vegtables.IndexOf("tomato"));

            // LastIndexOf = Return last occuring index of an element
            vegtables.Add("potato");
            Console.WriteLine("\nLast Index of potato: " + 
                                vegtables.LastIndexOf("potato")
                              );

            // Contains = Give a true or false if a value is contained
            Console.WriteLine(vegtables.Contains("banana"));
            Console.WriteLine(vegtables.Contains("broccoli"));

            // Sort = Sorts the List based on the type
            //        Can be configured
            foreach (string veg in vegtables)
                Console.Write(veg + ", ");
            Console.WriteLine();
            vegtables.Sort();
            foreach (string veg in vegtables)
                Console.Write(veg + ", ");
            Console.WriteLine();

            // Reverse = sorts in reverse order
            vegtables.Reverse();
            foreach (string veg in vegtables)
                Console.Write(veg + ", ");
            Console.WriteLine();

            // Clear = clears all elements
            vegtables.Clear();
            foreach (string veg in vegtables)
                Console.Write(veg + ", ");
            Console.WriteLine();

            // ToArray = convert to a basic array type
            double[] studentGrades = dubArr.ToArray();

            Console.WriteLine(studentGrades.GetType() );

            Console.ReadKey();
        }
    }
}
