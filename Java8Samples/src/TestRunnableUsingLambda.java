

   class TestRunnableUsingLambda{

      

      public static void main(String[] args) {

            Runnable r= ()->{
            	for (int i = 0; i < 10; i++) {
					System.out.println("child thread i is"+i);
				}
            };

   
            Thread t=new Thread(r);
            t.start();
            for (int i = 0; i < 20; i++) {
            	System.out.println("main thread i is"+i);
			}
      
   }
   }
