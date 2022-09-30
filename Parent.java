package CoreJava;
/*
Ques :create a class parent with default constructor and void sing method.print something inside the constructor and method
Create child class which will inherit the property of parent and has methods void speak and void dance.print something inside the two methods.
Create another class inheritance and object of class and call all the methods.also mention the type of inheritance on the top of the program. 
Program: 
@author: Sushma
@date: 29th sept 2022
*/

class Parent
	{   
		//creating a default Constructor 
		 Parent()
		 { 
			System.out.println("Hi");
		 }
	
       public void sing()
	 { 
		 System.out.println("He sings"); 
	 }
}
     //class Child inherit class Parent 
        class Child extends Parent
      {  
        public void speak()
     {
	    System.out.println("He speaks");
      }
       public void dance()
    {
	 System.out.println("He is dancing");
    }
}

        class a extends Child 
       {
            public static void main(String[] args)
        	{  
                //creating the object of Child class in main class 
            	Child a= new Child();
        		//calling the methods 
        		a.sing();
        		a.speak();
        		a.dance();
        	}
       }
       

			 
				 
			
		
			 class main {
			 public static void main(String[] args) {
			   // object created
			   PopSong emp1 = new PopSong();
			   Classic emp2 = new Classic();

			   System.out.println("total time:");
			   emp1.dance();

			   System.out.println("total time:");
			   emp2.speak();

			   // total time
			   emp1.dance();
			   emp2.speak();

			   System.out.println("total time after adding both:");
			   emp1.dance();

			   System.out.println("totoal timr after both:");
			   emp2.speak();
			 }
			}
			

	}

}
