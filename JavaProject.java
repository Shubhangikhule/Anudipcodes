import java.util.*;
import java.io.*;


class Sign_In extends Quiz
{
	String Name,Email_ID,Mobile_No,Password;
	void sign_in_info()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Your Name :");
		System.out.print("\t\t\t");
		Name=sc.nextLine();
		System.out.println("\nEnter Your Email ID :");
		System.out.print("\t\t\t");
		Email_ID=sc.nextLine();
		System.out.println("\nEnter Your Mobile No. :");
		System.out.print("\t\t\t");
		Mobile_No=sc.nextLine();
		System.out.println("\nCreate Your Password :");
		System.out.print("\t\t\t");
		Password=sc.nextLine();
		System.out.println("\n \n \t\t\tSIGN IN SUCCESSFULLY !!!\n\n");
		Sign_In s1=new Sign_In();
		s1.Aptitude_test();	
	}
}
class Quiz
{
	public void Aptitude_test()
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String ans;
		System.out.println(" \t\t\t***************** Onlin Interiew Quiz Software ***************** \n\n\n ");
		System.out.println("1. Which of the following is not a Java features??\n");
		System.out.println(" A.Dynamic\n B. Architecture Neutral\n C.Use of pointers \n D.Object-oriented\n ");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("C" ))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
			 //System.out.println("There are 8 ty");
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n");	 
			System.out.println("Correct answer:c.use of pointers");
		}	 
		System.out.println("2. What does the expression float a = 35 / 0 return?\n");
		System.out.println("A. 0 \nB.Not a number\nC.infinity\nD.runtime exception");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("D"))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			System.out.println("correct answer:D.runtime exception");
		} 	 
		System.out.println("3. Which operator can be used to compare two values ?\n");
		System.out.println(" A.<> \n B.= \n C. >< \n D. ==");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("D"))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n");
			System.out.println("correct answer:D.== ");
		}
		System.out.println("4. To declare Array in java,define the variable type with \n");
		System.out.println(" A.() \n B.{}  \n C. [] \n");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("C"))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			System.out.println("correct answer:C.[]");
		}
	  	System.out.println("5. Where is System Class defined ? \n");
		System.out.println(" A.java.util \n B.java.lang   \n C.java.io \n D. java.awtI \n");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("B"))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			System.out.println("correct answer:B.java.lang");
		}	
		System.out.println("6. Which statement is used to stop a loop  ?\n");
		System.out.println(" A.exit \n B. break \n C. stop \n D. return \n");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("B"))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			System.out.println("correct answer:B.break");
		}  
		System.out.println("7.Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?  \n");
		System.out.println(" A.javap tool\n B.javaw command  \n C. Javadoc tool\n D.javah command \n");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("C"))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			System.out.println(" Correct answer:javadoc tool");
		} 
		System.out.println("8.Which exception is thrown when java is out of memory?. ? \n public class GPS{}\n ");
		System.out.println(" A.MemoryError  \n B. OutOfMemoryError  \n C. MemoryOutOfBoundsException\n D. MemoryFullException  \n");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("B"))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n"); 
            System.out.println("correct answer:B.outofmemoryError");
		}	
		System.out.println("9.Exception created by try block is caught in which block ?\n ");
		System.out.println(" A.catch  \n B. throw  \n C. final \n D. none \n");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("a"))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			System.out.println("correct answer:A.catch");
	 	}
		System.out.println("10.Which of the following is used to find and fix bugs in the program ?\n ");
		System.out.println(" A.JVM  \n B. JDB  \n C. JRE \n D. JDK \n");
		System.out.println("\nSelect Your ans :\n");
		ans=sc.next();
		if(ans.equalsIgnoreCase("b"))
		{
			System.out.println("\t\t\tCorrect Answer !!!\n");
			count=count+1;
		}
		else
		{
			System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			System.out.println("correct answer:B.jdb");
	 	}
		System.out.println("\n\n********************** RESULT ********************** ");
		System.out.println("You Got "+count+" Marks Out of 10 !!!!");
		System.out.println("***************************************************");
		
		if(count >=6 )
		{count=0;
			System.out.println("\nCongratulations !!! You Have Selected For LEVEL 2!!!!");
			System.out.println(" \t\t\t***************** Online Interiew Quiz Software ***************** \n\n\n ");
			System.out.println("1. Number of primitive data types in Java  ?\n");
			System.out.println(" A.SIX \n B. SEVEN \n C.EIGHT \n D.NINE \n ");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("c" ))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			 	
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n");	 
				System.out.println("There are 8 types of primitive data types- int, char, boolean, byte, long, float, short, double.\n");
		    }	 

			System.out.println("2. Find The Output Of Following Code ?\n");
			System.out.println("int Integer = 24;\nchar String  = 'I';\nSystem.out.print(Integer);\nSystem.out.print(String);");
			System.out.println(" A. Compile Time Error \n B.Throws Exception \n C. I \n D.24 I \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("24 I Will be Printed \n");
			}
			System.out.println("3. String Method compareTo() returns ?\n");
			System.out.println(" A.True \n B.False \n C. int Value \n D. None");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("C"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n");
				System.out.println("compareTo() returns an int value !!!\n ");
			}
			System.out.println("4. When is the finalize() method called? \n");
			System.out.println(" A.Before Garbage Collection \n B.Before an object goes out of space  \n C. Before an object goes out of space \n D.None I \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("A"))
			{	
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("finalize() method is called before garbage collection. \n");
			}
			System.out.println("5.Which of the following is true about the anonymous inner class? \n");
			System.out.println(" A.It has only methods \n B.Objects can't be created  \n C.It has a fixed class name\n D.It has no class name \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("System class is defined in java.lang.package\n");
			}	
        	System.out.println("6. What is the use of final keyword in Java  ?\n");
			System.out.println(" A.When a class is made final,a subclass of it can not be created \n B. When a method is final,it can not be overridden \n C. When a variable is final ,it can be assigned value only once \n D. All of the Above  \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}	
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			}
        	System.out.println("7. Output of Math.floor(3.6) ? \n");
			System.out.println(" A.3  \n B.3.0  \n C. 4\n D.4.0 \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("B"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println(" floor returns largest integer that is less than or equal to the given number.\n");
			} 
			System.out.println("8.Identify the correct way of declaring constructor. ? \n public class GPS{}\n ");
			System.out.println(" A.GPS(){}  \n B. public GPS(){}  \n C. GPS(void){}\n D. Both A and B  \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			}	
			System.out.println("9.Exception created by try block is caught in which block ?\n ");
			System.out.println(" A.catch  \n B. throw  \n C. final \n D. none \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("a"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("Exception created by try block is caught in catch block !!");
	 		}
			System.out.println("10. An interface with no fields or methods is known as a ______.\n ");
			System.out.println(" A. Runnable Interface  \n B. Marker Interfacetln\n C.Abstract Interface");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("b"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("Java Debugger (JDB) is used to find and fix bugs in the program !!");
	 		}
	
	
			System.out.println("\n\n********************** RESULT ********************** ");
			System.out.println("You Got "+count+" Marks Out of 10 !!!!");
			System.out.println("***************************************************");
		}
		else
		System.out.println("you are not selected for level 2");
		if(count>=8)
		{
			
			System.out.println("\nCongratulations !!! You Have Selected For LEVEL 3!!!");
			System.out.println(" \t\t\t***************** Online Interiew Quiz Software ***************** \n\n\n ");
			System.out.println("1. Number of primitive data types in Java  ?\n");
			System.out.println(" A.SIX \n B. SEVEN \n C.EIGHT \n D.NINE \n ");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("d" ))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			 	//System.out.println("There are 8 types of primitive data types- int, char, boolean, byte, long, float, short, double.");
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n");	 
				System.out.println("There are 8 types of primitive data types- int, char, boolean, byte, long, float, short, double.\n");
			}	 

			System.out.println("2. Find The Output Of Following Code ?\n");
			System.out.println("int Integer = 24;\nchar String  = 'I';\nSystem.out.print(Integer);\nSystem.out.print(String);");
			System.out.println(" A. Compile Time Error \n B.Throws Exception \n C. I \n D.24 I \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("24 I Will be Printed \n");
			}
			System.out.println("3. String Method compareTo() returns ?\n");
			System.out.println(" A.True \n B.False \n C. int Value \n D. None");
			System.out.println("\nSelect Your ans :\n");
				ans=sc.next();
			if(ans.equalsIgnoreCase("C"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n");
				System.out.println("compareTo() returns an int value !!!\n ");
			}
			System.out.println("4. When is the finalize() method called? \n");
			System.out.println(" A.Before Garbage Collection \n B.Before an object goes out of space  \n C. Before an object goes out of space \n D.None I \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("A"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}	
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("finalize() method is called before garbage collection. \n");
			}
			System.out.println("5.Which of the following is true about the anonymous inner class? \n");
			System.out.println(" A.It has only methods \n B.Objects can't be created  \n C.It has a fixed class name\n D.It has no class name \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("System class is defined in java.lang.package\n");
			}	
        	System.out.println("6. What is the use of final keyword in Java  ?\n");
			System.out.println(" A.When a class is made final,a subclass of it can not be created \n B. When a method is final,it can not be overridden \n C. When a variable is final ,it can be assigned value only once \n D. All of the Above  \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			}
        	System.out.println("7. Output of Math.floor(3.6) ? \n");
			System.out.println(" A.3  \n B.3.0  \n C. 4\n D.4.0 \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("B"))
			{
					System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}	
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println(" floor returns largest integer that is less than or equal to the given number.\n");
			} 
			System.out.println("8.Identify the correct way of declaring constructor. ? \n public class GPS{}\n ");
			System.out.println(" A.GPS(){}  \n B. public GPS(){}  \n C. GPS(void){}\n D. Both A and B  \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("D"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
			}	
			System.out.println("9.Exception created by try block is caught in which block ?\n ");
			System.out.println(" A.catch  \n B. throw  \n C. final \n D. none \n");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("a"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("Exception created by try block is caught in catch block !!");
	 		}
			System.out.println("10. An interface with no fields or methods is known as a ______.\n ");
			System.out.println(" A. Runnable Interface  \n B. Marker Interfacetln\n C.Abstract Interface");
			System.out.println("\nSelect Your ans :\n");
			ans=sc.next();
			if(ans.equalsIgnoreCase("b"))
			{
				System.out.println("\t\t\tCorrect Answer !!!\n");
				count=count+1;
			}
			else
			{
				System.out.println("\t\t\tIncorrect Answer !!!\n"); 
				System.out.println("Java Debugger (JDB) is used to find and fix bugs in the program !!");
	 		}
			System.out.println("\n\n********************** RESULT ********************** ");
			System.out.println("You Got "+count+" Marks Out of 20 !!!!");
			System.out.println("***************************************************"); 
	    }
		else
	    System.out.println("sorry you are not selected for level 3");
	}
}
class Login extends Sign_In 
{
	String username,password;
	void login_info()
	{	
		Scanner sc1=new Scanner(System.in);
		Login L1=new Login();
		System.out.println("\t\t\t *************** Welcome to LOGIN !!! ***************");
		System.out.println("\n\nEnter Your User Name :");
		System.out.print("\t\t\t");
		username=sc1.nextLine();
		System.out.println("Enter Your Password :");
		System.out.print("\t\t\t");
		password=sc1.nextLine();	
		if(Name.equals(username) && Password.equals(password))
		{
			System.out.println("\n\t\t\t\tLOGIN SUCCESSFULLY !!!\n\n");
			L1.Aptitude_test();	
		}
			
		else 
		{
			System.out.println("\t\t\tIncorrect Password !!!");
		}
	}	
}	
interface About_us
{
	void About();												
}
class JavaProject extends Login implements About_us
{
		
	public void About()
	{
    System.out.println("\n\n\t\t\t****WELCOME TO JAVA QUIZ**** ");
	System.out.println("\n\n\t\t\t*** COMPUTER ENGINEERING ****");
	System.out.println("\n\n\t\t\t** NAME OF STUUDENT **");
	System.out.println(" \n\t\t\t1.SHUBHANGI KHULE\n\t\t\t2.KARAN MANE\n\t\t\t");
	System.out.println("\n\n\t\t\t\t\tGUIDANCE BY :PROF. KAJAL MOGHE");
	System.out.println("\n\n\t\t\tPRESS ANY KEY TO CONTINUE.......");
//	Console.pause();
	}
	public static void main(String args[]) throws IOException
	{
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch;
		
		JavaProject j1=new JavaProject();
		j1.About();
		System.out.println("\n\n\t\t\t **********\t!!!!!!!! WELCOME IN JAVA QUIZ    !!!!!!!!\t**********");
		do
		{
			System.out.println(" 1. SIGN UP \n 2. LOG IN  \n 3. ABOUT US \n 4. EXIT \n\n\n Enter Your Choice :");
			System.out.print("\t\t\t");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
				j1.sign_in_info();
				break;
				case 2:
				j1.login_info();
				break;
				case 3:
				j1.About();
				break;
				case 4:
				System.out.println("\t\t\t\tThanks For using Our Software !!!!!!");
				break;
				default :
				System.out.println("\t\t\t\tINVALID CHOICE !!!");
			}
		}
		while(ch!=4);
	}
}
