namespace _11___String_Methods
{
    internal class Program
    {
        public static void Main(string[] args)
        {

            String fullName = "Patrick Star";
            Console.WriteLine(fullName);

            fullName = promptStrInput("Enter your full name: ");
            Console.WriteLine("\n" + fullName);

            // ToUpper => convert to uppercase
            fullName = fullName.ToUpper();
            Console.WriteLine(fullName);
            // ToLower => convert to lowercase
            fullName = fullName.ToLower();
            Console.WriteLine(fullName);

            String phoneNumber = "123-456-7890";

            // Replace => replaces all string sequences matching the first
            //            string with the second string parameter
            phoneNumber = phoneNumber.Replace("-", "/");
            Console.WriteLine(phoneNumber);
            phoneNumber = phoneNumber.Replace("123", "321");
            Console.WriteLine(phoneNumber);
            // ^ remember that reassignment is required if you want to keep changes

            // Insert => inserts a character or string at a given index
            String fruit = "pineapple";

            // inserts a capital P at index 0, but does not save it!!
            fruit.Insert(0, "P");

            try
            {
                fruit.Insert(-1, "s");
            }
            catch (ArgumentOutOfRangeException)
            {
                Console.WriteLine("Cannot insert at index -1");
            }

            fruit = fruit.Insert(4, " A");

            Console.WriteLine(fruit);

            // Remove => remove a character or substring when given index(s)

            fruit = fruit.Remove(6, 1);
            Console.WriteLine(fruit);

            fruit = fruit.Remove(0, 1).Insert(0, "P");
            Console.WriteLine(fruit);

            fruit = fruit.Remove(4); // removes from index 4 to the end
            Console.WriteLine(fruit);

            Console.WriteLine("Length of fruit: " + fruit.Length);

            String anotherName = "Eugine Krabs";
            Console.WriteLine(anotherName);

            // Contains => returns a true or false value if a char or string exists
            if (anotherName.Contains(' '))
            {
                int spaceIndex = anotherName.IndexOf(' ');

                String first = anotherName.Substring(0, spaceIndex);
                // Add 1 to account for the space
                String last = anotherName.Substring(spaceIndex + 1);

                Console.WriteLine(first + ", length = " + first.Length);
                Console.WriteLine(last + ", length = " + last.Length);
            }


            Console.ReadKey();
        }

        static string promptStrInput(string promptMsg)
        {
            string userInput = "";
            bool isPrompting = true;
            while (isPrompting)
            {
                Console.Write(promptMsg);
                string? line = Console.ReadLine();
                if (line != "" && line is not null)
                {
                    userInput = line;
                    isPrompting = false;
                }
            }
            return userInput;
        }
    }
}
