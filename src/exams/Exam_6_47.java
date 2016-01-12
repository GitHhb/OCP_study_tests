package exams;

/**
 * Created by L on 12/16/2015.
 */
    class CorbaComponent{
        String ior;
        CorbaComponent(){ startUp("IOR"); }
        void startUp(String s){ ior  =  "Parent"; }
        void print(){ System.out.println(ior); }
    }

    class OrderManager extends CorbaComponent{
        OrderManager(){  }
        void startUp(String s){  ior = getIORFromURL(s);   }
        String getIORFromURL(String s){  return "URL://"+s; }
    }

   public class Exam_6_47{
        public static void main(String args[]){ start(new OrderManager());

           // byte b = 65;
            //char c = 66;
            //c = (char)b;
            //float f = 1;
            //int i = 1;
            //f = i;
            //System.out.println(c);

                String String = "";   //This is valid.
                String:
                for (int i = 0; i < 10; i++) //This is valid too!
                {
                    for (int j = 0; j < 10; j++) {
                        if (i + j > 10) break String;
                    }
                    System.out.println("hello");
                }

        }
        static void start(CorbaComponent cc){ cc.print(); }
    }
