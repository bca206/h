//single level inhertnace
import java.util.*;
class departemnt{
    double salary,bonus,totalsalary;
    public void  diplaytotalsalary(String name){
         System.out.println("Name="+name+"  Salary="+salary+"  bonus="+bonus+"  totalsalary="+totalsalary);
    }
}
class account extends departemnt{

    public void calsaray(int sal){
        salary=sal;
        bonus=sal*0.3;
        totalsalary=sal + bonus;
    }
}

class lab08{
    public static void main(String[] args) {
        account acc=new account(); 
        acc.calsaray(10000);
        acc.diplaytotalsalary("Azhar");
 }
}