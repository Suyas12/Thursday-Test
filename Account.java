class Myaccount
{
int number;
String name;
String email;
int amount;


public int getNumber() {
    return number;
}
public void setNumber(int num) { 
    this.number = num;
}
public String getName() {
    return name;
}
public void setName(String n) { 
    this.name = n;
}
public String getEmail() {
    return email;
}
public void setEmail(String e) { 
    this.email = e;
}
public int getAmount() {
    return amount;
}
public void setAmount(int a) { 
    this.amount = a;
}
}

public class Account {
public static void main(String[] args) { 
Myaccount my = new Myaccount(); 
my.setNumber(8780);
my.setName("Suyas Awasthi");
my.setEmail("suyasawasthi7003@gmail.com");
my.setAmount(70000);  
System.out.println("My Account details are: "+"\n"+my.getNumber()+"\n"+my.getName()+"\n"+my.getEmail()+"\n"+my.getAmount()); 
}
}

