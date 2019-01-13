import java.util.Scanner;
class process
{
    int tat,wt,at,rt,id,cpub;
    boolean flag;
    process()
    {
        tat=wt=at=rt=id=cpub=0;
        flag =false;
    }
    
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id : ");
        id = sc.nextInt();
        System.out.println("Enter at : ");
        at = sc.nextInt();
        System.out.println("Enter cpub : ");
        cpub = sc.nextInt();
        rt=cpub;
        flag=false;
        
    }
}

