
import java.sql.SQLOutput;
import java.util.Scanner;

public class BookingManagement {
    Scanner input=new Scanner(System.in);
    public String CusName;
    private String CusPhone;
    private String CheckDate;
    private String DepartDate;
    public BookingManagement(){
    this.CusName="Ravin";
    this.CusPhone="0998877666";
    this.CheckDate="2024-02-20";
    this.DepartDate="2024-02-21";
    }
    public BookingManagement(String CusName, String CusPhone, String CheckDate, String DepartDate){
            this.CusName=CusName;
            this.CusPhone=CusPhone;
            this.CheckDate=CheckDate;
            this.DepartDate=DepartDate;
    }
    public String getCusName() {
        return CusName;
    }

    public String getCusPhone() {
        return CusPhone;
    }

    public String getCheckDate() {
        return CheckDate;
    }

    public String getDepartDate() {
        return DepartDate;
    }

    public void setCusName(String cusName) {
        CusName = cusName;
    }

    public void setCusPhone(String cusPhone) {
        CusPhone = cusPhone;
    }

    public void setCheckDate(String checkDate) {
        CheckDate = checkDate;
    }

    public void setDepartDate(String departDate) {
        DepartDate = departDate;
    }

    //Input Information;
    public void input(){
        int n=0;
        System.out.print("Enter CustomerName:");
        CusName=input.next();
        System.out.print("Enter CustomerPhone:");
        CusPhone=input.next();
        System.out.print("Enter CheckingDate:");
        CheckDate=input.next();
        System.out.print("Enter DepartureDate:");
        DepartDate=input.next();

        System.out.println("------------------------");
    }
    //Report of all Booking
    public void output(){
        System.out.printf("|%-15s|%-20s|%-15s|%-15s|%n",getCusName(),getCusPhone(),getCheckDate(),getDepartDate());
        System.out.printf("|____________________________________________________________________|%n");
    }
    //manu1;
    public void manu1(){
        System.out.println("===============Booking Management============");
        System.out.println("1.Booking Management");
        System.out.println("2.Room    Management");
        System.out.println("3.Report of all Booking");
        System.out.println("4.Report of all Rooms");
        System.out.println("0.Exit...");
    }
    //manu booking management;
    public void manu2(){
        System.out.println("1.Add  Booking Information");
        System.out.println("2.Searching of Booking Information");
        System.out.println("3.Edit Booking Information");
        System.out.println("4.Listing of Booking Type");
        System.out.println("5.Deleting the Booking type");
        System.out.println("0.Back To Home Page");
    }
    //LoginSystem
    public void loginSystem(){
        String username="dre11";
        String password="pass11";
        System.out.print("Enter Username:");
        String enterusername=input.next();
        System.out.print("Enter Password:");
        String enterpassword=input.next();
        if(enterusername.equals(username) && enterpassword.equals(password)){
            System.out.println("Login Success..");
        }else {
            System.out.println("Fail..");
            System.exit(0);
        }
    }
    public void Search(BookingManagement[] bookings, int n){
        String SCusphone;
        System.out.print("Input CustomerPhone to search:");
        SCusphone=input.next();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(bookings[i].getCusPhone().equals(SCusphone)){
                found=true;
                bookings[i].output();
                System.out.println("Search was found...");
            }
        }if (found=false){
            System.out.println("CustomerPhone not found....");
        }

    }
    public void  Update(BookingManagement[] bookings, int n) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input CustomerPhone to edit:");
        String upPhone = in.next();
        String upCusname;
        String upCuscheckdate;
        String upCusdepartdate;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (bookings[i].getCusPhone().equals(upPhone)) {
                b = 1;
                System.out.print("Input New CustomerName        :");
                upCusname = in.next();
                System.out.print("Input New CheckingDate    :");
                upCuscheckdate = in.next();
                System.out.print("Input New DapartureDate  :");
                upCusdepartdate = in.next();

                bookings[i].setCusName(upCusname);
                bookings[i].setCheckDate(upCuscheckdate);
                bookings[i].setDepartDate(upCusdepartdate);
            }
        }
        if (b == 0) {
            System.out.println("invalid room id");
        }
    }
    public void Delete(BookingManagement[] Bookings,int n){
        String DeCusPhone;
        int b=0;
        System.out.println("Input CustomerPhone to Delete:");
        DeCusPhone=input.next();
        for(int i=0;i<n;i++){
            if (Bookings[i].getCusPhone().equals(DeCusPhone)){
                for(int j=i;j<n-1;j++){
                    Bookings[j]=Bookings[j+1];
                }
                n=n-1;
                b=1;
            }
            System.out.println("Delete was completed...");
        }
        if(b==0){
            System.out.println("Delete wad failed...");
        }
    }

}