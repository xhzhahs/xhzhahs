class Program 
{

    public static void Main(String[] args)
    {
        Console.Write(">>>>");  // java print 와 같다.
        Console.WriteLine("Hello, World!"); // java println 과 같다.
        /*
            범위 주석
         */
        // 한줄 주석


        int[] arr = { 1, 2, 3, 4, 5 };
        foreach(int i in arr)
        {
            Console.WriteLine(i + ", ");
        }

        test(); // static 메소드에서는 static만 쓸 수 있다.
    }


    static void test()
    {
        Console.WriteLine("test");
    }


}


