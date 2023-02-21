import java.util.*;


class banksystem{
    private String Name;
    private int phone_no;
    private int acc_no;
    private int balance;
    
    
    Scanner sc = new Scanner(System.in);
    
    public void setter(String name,int phoneno,int Balance,int accno){
        System.out.println("");
        System.out.println("");
        this.Name = name;
        this.acc_no = accno;
        this.phone_no = phoneno;
        this.balance = Balance;
        
         System.out.println("Your details: ");
        System.out.println("name: "+ this.Name);
        System.out.println("phone no: "+this.phone_no);
        System.out.println("Bank Balance: "+this.balance);
        System.out.println("Account no: "+this.acc_no);
        
    }
    
    public void new_user(){
        System.out.println("");
        System.out.println("");
        System.out.println("enter your name: ");
        Name = sc.next();
        System.out.println("enter your phone no: ");
        phone_no = sc.nextInt();
        System.out.println("Enter money your want credit: ");
        balance = sc.nextInt();
       
        Random rand = new Random();
        int upperbound = 1000000;
        int acc_no = rand.nextInt(upperbound); 
        System.out.println("Your details: ");
        System.out.println("name: "+ Name);
        System.out.println("phone no: "+phone_no);
        System.out.println("Bank Balance: "+balance);
        System.out.println("Account no: "+acc_no);
    }
    
    public void bank_balance(){
        System.out.println("");
        System.out.println("");
       
        System.out.println(balance);
        
    }
    
    public void withdraw(){
        System.out.println("");
        System.out.println("");
       
        int tempmoney;
        
            System.out.println("Enter cash you want to withdraw");
            tempmoney = sc.nextInt();
            if(tempmoney > balance){
                System.out.println("Insufficient balance");
            }
            else{
                balance = balance-tempmoney;
                System.out.println("Please take your cash");
            }
        }
        

        public void credit(){
            System.out.println("");
            System.out.println("");
            int tempmoney;
            System.out.println("Enter cash you want to credit");
            tempmoney = sc.nextInt();
            balance += tempmoney;
            System.out.println("Your cash successfully credited");
        }
        public void details(){
            System.out.println("Your details: ");
            System.out.println("name: "+ Name);
            System.out.println("phone no: "+phone_no);
            System.out.println("Bank Balance: "+balance);
            System.out.println("Account no: "+acc_no);
        }
}
  
    
    


public class banksystemm {
    static int k=0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        banksystem a[] = new banksystem[10];
        String name[]=new String[10];
        while(true){
            System.out.println("Enter option: ");
            System.out.println("1.new user");
            System.out.println("2.withdraw amount");
            System.out.println("3.credit");
            System.out.println("4.bank balance");
            int choice = sc.nextInt();
            
            System.out.println("");
        System.out.println("");
            switch(choice){
                case 1:{
                    System.out.println("enter your name: ");
                    String Name = sc.next();
                    System.out.println("enter your phone no: ");
                    int phone_no = sc.nextInt();
                    System.out.println("Enter money your want credit: ");
                    int balance = sc.nextInt();
                    
                        Random rand = new Random();
                        int upperbound = 1000000;
                        int acc_no = rand.nextInt(upperbound); 
                        
                    a[k] = new banksystem();
                    a[k].setter(Name, phone_no, balance,  acc_no);
                   
                    name[k] = Name;
                    k++;
                    
                }
                      break;
                case 2:{
                    System.out.println("enter your name: ");
                    String tempname = sc.next();
                    int i=0;
                    boolean flag=true;
                    while(!tempname.equals(name[i])){
                        i++;
                        if(i > name.length){
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        a[i].withdraw();
                    else
                        System.out.println("Please create your account"+a[i]);
                }
                        break;
                case 3: {
                    System.out.println("enter your name: ");
                    String tempname = sc.next();
                    int i=0;
                    boolean flag=true;
                    while(!tempname.equals(name[i])){
                        i++;
                        if(i > name.length){
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        a[i].credit();
                    else
                        System.out.println("Please create your account");
                }
                           break;
               
                           
                case 4: {
                    System.out.println("enter your name: ");
                    String tempname = sc.next();
                    int i=0;
                    boolean flag=true;
                    while(!tempname.equals(name[i])){
                        i++;
                        if(i > name.length){
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        a[i].details();
                    else
                        System.out.println("Please create your account");
                }
                        break;
                case 5: {
                    System.out.println("enter your name: ");
                    String tempname = sc.next();
                    int i=0;
                    boolean flag=true;
                    while(!tempname.equals(name[i])){
                        i++;
                        if(i > name.length){
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        a[i].bank_balance();
                    else
                        System.out.println("Please create your account");
                }
                        break;
                default: System.out.println("please enter correct choice");
            }
            
            
        }
        
    }
    
}
