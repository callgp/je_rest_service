   //@FunctionalInterface

  interface FunctionInterfacesFourCases30 {

   public int squareIt(int x);

   }



	/*
	 * public Demo implemments FunctionInterfacesFourCases1{
	 * 
	 * public void m1() {
	 * 
	 * System.out.println("normal impl");
	 * 
	 * }
	 * 
	 * }
	 */


 public  class Test3{

      

      public static void main(String[] args) {

         {

            FunctionInterfacesFourCases30 i= x-> x*x;
           System.out.println( i.squareIt(4));
            

         }

      }

   }

