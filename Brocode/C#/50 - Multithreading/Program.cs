using System.Threading;

namespace _50___Multithreading
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // thread = an execution path of a program
            //          Processes are made up of many threads.
            //          We can use multiple threads to perform
            //          different tasks of a program simultaneously.
            //
            //          Current thread running is "main" thread by default.
            //          using System.Threading;

            Thread mainThread = Thread.CurrentThread;
            mainThread.Name = "Main Thread";
            Console.WriteLine(mainThread.Name);

            // Scenario: Two timers cocurrently (at same time), 
            //           one counting up while the other counts down

            //Thread thread1 = new Thread(CountDown);
            //Thread thread2 = new Thread(CountUp);

            // Pass in a lambda expression if you need func arguments
            Thread thread1 = new Thread( () => CountDown("Timer #1") );
            Thread thread2 = new Thread( () => CountUp("Timer #2") );

            thread1.Start();
            thread2.Start();

            //Func<null> a;
            // a = () => { CountDown("Timer #3"); Console.Beep(); };

            Thread thread3 = new Thread(
                () =>
                {
                    CountDown("Timer #3");
                    Console.Beep(); // beeps at the end
                }
            );
            thread3.Start();

            Console.ReadKey();
        }

        static void CountDown(String name)
        {
            for (int iCount = 10; iCount >= 0; iCount--)
            {
                Console.WriteLine($"Timer #1 : {iCount} seconds");
                Thread.Sleep(1000); // sleep this thread for 1000ms
            }
            Console.WriteLine($"{name} is complete!");
        }
        static void CountUp(String name)
        {
            for (int iCount = 0; iCount < 10; iCount++)
            {
                Console.WriteLine($"Timer #2 : {iCount} seconds");
                Thread.Sleep(1000); // sleep this thread for 1000ms
            }
            Console.WriteLine($"{name} is complete!");
        }
    }
}
