package application;


	import java.io.File;

	import java.io.FileWriter;

	import java.io.IOException;

	import java.io.PrintWriter;

	import java.util.Scanner;

import model.UserCredentials;
import model.Users;

	public class Authentication {

	               //input data

	               private static Scanner keyboard;

	               private static Scanner input;

	               private static Scanner lockerInput;

	               //output data

	               private static PrintWriter output;

	               private static PrintWriter lockerOutput;

	               //model to store data.

	               private static Users users;

	               private static UserCredentials userCredentials;

	               public static void main(String[] args) {

	                              initApp();

	                              welcomeScreen();

	                              signInOptions();

	               }

	               public static void signInOptions() {

	                              System.out.println("1 . Registration ");

	                              System.out.println("2 . Login ");
	                              Scanner keyboard = new Scanner(System.in);

	               //            int option = sc.nextInt();
                                 int option = keyboard.nextInt();

	                              switch(option) {

	                                case 1 :

	                                       registerUser();

	                                          break;

	                                    case 2 :

	                                           loginUser();

	                                           break;

	                                        default :

	                                        System.out.println("Please select 1 Or 2");

	                                            break;

	                              }

	                              keyboard.close();

	                              input.close();

	               }

	              

	               public static void lockerOptions(String inpUsername) {

	                             

	                              Scanner keyboard = new Scanner(System.in);

	                             

	                              System.out.println("1 . FETCH ALL STORED CREDENTIALS ");

	                              System.out.println("2 . STORED CREDENTIALS ");

	                              int option = keyboard.nextInt();    

	                              switch(option) {

	                                             case 1 :

	                                                            fetchCredentials(inpUsername);

	                                                            break;

	                                             case 2 :

	                                                            storeCredentials(inpUsername);

	                                                            break;

	                                             default :

	                                                            System.out.println("Please select 1 Or 2");

	                                                            break;

	                              }

	               //            lockerInput.close();

	               }

	
	               public static void registerUser() {

	               System.out.println("==========================================");

	                              System.out.println("*                                                                 *");

	                              System.out.println("*   WELCOME TO REGISTRATION PAGE               *");

	                              System.out.println("*                                                                 *");

	               System.out.println("==========================================");

	                             

	                              System.out.println("Enter Username :");

	        Scanner keyboard = new Scanner(System.in);

	                              String username = keyboard.next();

	                System.out.println("&&&&&&&&&&&&&&7");

	    //       users.setUsername(username);
                          System.out.println("Enter Password :");

//	                           Scanner keyboard = new Scanner(System.in);

	               String password = keyboard.next();

	       System.out.println("&&&&&&&&&&&&&&7");

//	                           users.setPassword(password);

                              System.out.println("User Registration Successful !");

             }

	               public static void loginUser() {

	                              Scanner keyboard = new Scanner(System.in);

	               System.out.println("==========================================");

	                              System.out.println("*                                                                 *");

	                              System.out.println("*   WELCOME TO LOGIN PAGE          *");

	                              System.out.println("*                                                                 *");

	               System.out.println("==========================================");

	                              System.out.println("Enter Username :");

	                             

	                              Scanner keyboard1 = new Scanner(System.in);

	                              String inpUsername = keyboard.next();

	                              boolean found = false;

	                              while(input.hasNext() && !found) {

	                                       if(input.next().equals(inpUsername)) {

	                                                            System.out.println("Enter Password :");

	                                                            String inpPassword = keyboard.next();

	                                                       if(input.next().equals(inpPassword)) {

	                                                                           System.out.println("Login Successful ! 200OK");

	                                                                           found = true;

	                                                                           lockerOptions(inpUsername);

	                                                                           break;

	                                                            }

	                                             }

	                              }

	                              if(!found) {

	                                             System.out.println("User Not Found : Login Failure : 404");

	                              }
	               }
	                    public static void welcomeScreen() {

	                              Scanner keyboard = new Scanner(System.in);

	               System.out.println("==========================================");

	                              System.out.println("*                                                                 *");

	                              System.out.println("*   Welcome To LockMe.com                          *");

	                              System.out.println("*   Your Personal Digital Locaker     *");

	                              System.out.println("*                                                                 *");

	               System.out.println("==========================================");
               }

	               //store credentails

	               static Scanner siteName = new Scanner(System.in);

	               public static void storeCredentials(String loggedInUser) {

//	                           Scanner keyboard = new Scanner(System.in);

	                             

	               System.out.println("==========================================");

	                              System.out.println("*                                                                 *");

	                              System.out.println("*   WELCOME TO DIGITAL LOCKER STORE YOUR CREDS HERE          *");

	                              System.out.println("*                                                                 *");

	               System.out.println("==========================================");

	               System.out.println("&&&&&&&&&&&&&&&&&");

//	         userCredentials.setLoggedInUser(loggedInUser);

	                              System.out.println("Enter Site Name :");

	                              Scanner keyboard = new Scanner(System.in);

	                              String siteName = keyboard.next();

//	            userCredentials.setSiteName(siteName);

	                              System.out.println("Enter Username :");

	                              String username = keyboard.next();

//	            userCredentials.setUsername(username);

	               System.out.println("&&&&&&&&&&&&&&&&&");

	                     System.out.println("Enter Password :");

	                       String password = keyboard.next();

//	                        userCredentials.setPassword(password);
	               System.out.println("&&&&&&&&&&&&&&&&&");

                System.out.println("YOUR CREDS ARE STORED AND SECURED!");

	               }
            //fetch credentials

	               public static void fetchCredentials(String inpUsername) {
                    Scanner lockerInput = new Scanner(System.in);

	               System.out.println("==========================================");

	                              System.out.println("*                                                                 *");

	                              System.out.println("*   WELCOME TO DIGITAL LOCKER  *");

	                              System.out.println("*   YOUR CREDS ARE              *");

	                              System.out.println("*                                                                 *");

	               System.out.println("==========================================");

	                            System.out.println(inpUsername);

//	                           Scanner lockerInput = new Scanner(System.in);

	                              while(lockerInput.hasNext()) {

	                                             Scanner lockerInput1 = new Scanner(System.in);

//	                           System.out.println(lockerInput.hasNext());


	                              if(lockerInput.next().equals(inpUsername))

	                                                 System.out.println("&&&&&&&&&&");

	                                             {

	                                                            System.out.println("Site Name: "+lockerInput.next());

	                                                            System.out.println("User Name: "+lockerInput.next());

	                                                            System.out.println("User Password: "+lockerInput.next());

	                                             }
	                              }}
	                              public static void initApp() {
                              Scanner keyboard = new Scanner(System.in);

	                              File  dbFile = new File("database.txt");

	                              File  lockerFile = new File("locker-file.txt");

	                              try {

	                                             //read data from db file

	                                             input = new Scanner(dbFile);

	                                            

	                                             //red data from locker file

	                                             lockerInput = new Scanner(lockerFile);

	                                            

	                                             //read data from keyboard

	                                             keyboard = new Scanner(System.in);

	                                            

	                                             //out put

	                                             output = new PrintWriter( new FileWriter(dbFile,true));

	                                             lockerOutput = new PrintWriter( new FileWriter(lockerFile,true));

	                                            

	                                             users = new Users();

	                                             userCredentials  = new UserCredentials();

	                              } catch (IOException e) {

	                             }

	                              }
	}
	 
