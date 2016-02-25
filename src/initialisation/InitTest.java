package initialisation;

/**
 * Created by leandro on 24-2-2016.
 */
// From:
// http://www.javaworld.com/article/2075796/java-platform/java-101--class-and-object-initialization.html?page=2

    class ClassInitializationDemo5
    {
        final static double PI;
        static int zero;
        static
        {
            PI = 3.14159;
            int i;
            for (i = 0; i < 5; i++)
                System.out.println (i);
        }
        //static int j = i;
        public static void main (String [] args)
        {
            System.out.println ("PI = " + PI);
            System.out.println("Zero = " + zero);
        }
    }

// TEST: final field (PI in this example) must be assigned a value
// It does not get initialised to 0.0 by default in <clinit>