
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=0,op1,op2;
        String st1,st2;
        boolean exit=false;
        BookingManagement b1=new BookingManagement();//for manu
        //b1.loginSystem();
        BookingManagement[] bookings=new BookingManagement[100000];
        do{
            b1.manu1();
            System.out.print("which one do you want choose:");
            op1=input.nextInt();
            switch (op1){
                //Booking Management;
                case 1:{
                    do{
                        b1.manu2();
                        System.out.print("Pls Choose One:");
                        op2=input.nextInt();
                        switch(op2){
                            //add booking information;
                            case 1:{
                                System.out.print("Input N:");
                                n=input.nextInt();
                                int i;
                                for(i=0;i<n;i++){
                                    bookings[i]=new BookingManagement();
                                    bookings[i].input();
                                }
                                System.out.print("Enter [any key] To Continues...");
                            }break;
                            //edit booking information;
                            case 2:{
                                BookingManagement b= new BookingManagement();
                                System.out.printf("|--------------------------------------------------------------------|%n");
                                b.Search(bookings,n);
                            }break;
                            case 3:{
                                BookingManagement b = new BookingManagement();
                                b.Update(bookings,n);
//                                   Update(bookings,n);
                                System.out.print("Enter [any key] To Continues...");
                            }break;
                            //listing of booking type;
                            case 4:{

                                System.out.print("Enter [any key] To Continues...");
                            }break;
                            //deleting the booking type;
                            case 5:{
                                BookingManagement b=new BookingManagement();
                                b.Delete(bookings,n);

                                System.out.print("Enter [any key] To Continues...");
                            }break;
                            case 0 :{
                                System.out.println("Typing exit:");

                            }break;
                            default:{
                                System.out.println("Invalid choice...");
                            }
                        }
                        st1=input.next();
                    }while(!st1.equals("exit") );
                }break;
                //Room Management;
                case 2:{

                }break;
                //Report of all Booking;
                case 3:{
                    System.out.printf("|--------------------------------------------------------------------|%n");
                    System.out.printf("|%-15s|%-20s|%-15s|%-15s|%n","CustomerName","CustomerPhone","ChekingDate","DepartuerDate");
                    System.out.printf("|____________________________________________________________________|%n");
                    for (int i=0;i<n;i++){
                        bookings[i].output();
                    }
                }break;
                //Report of all Rooms
                case 4:{

                }break;
                case 0:{
                    System.exit(0);
                }
            }
            System.out.println(" ");
            System.out.print("press [any key] to continues:");
            st2=input.next();
        }while(!st2.equals("exit"));
    }
}