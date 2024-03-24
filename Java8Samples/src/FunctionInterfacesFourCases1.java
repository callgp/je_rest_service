	//@FunctionalInterface
  interface FunctionInterfacesFourCases1 {
	public void m1();
	}

/*	public Demo implemments FunctionInterfacesFourCases1{
			public void m1() {
				System.out.println("normal impl");
			}
	}

	class*/ Test1{
		
		public static void main(String[] args) {
			{
				FunctionInterfacesFourCases1 i= new Demo();
				i.m1();
			}
		}
	}