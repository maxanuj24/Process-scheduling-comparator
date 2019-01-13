
import java.util.Scanner;


public class StartMain {
    public static void main(String args[]){
 /*       process p = new process();
        p.getdata();
        pschedule ref;
 */
        
       int t,n;
        process p[],q[],r[],s[];
        Scanner sc = new Scanner(System.in);
        
       // Console con =System.console();
        System.out.println("Enter the number of process:-");
        n = sc.nextInt();
    //n=5;
        p=new process[n+1];
        for(int i=1;i<=n;i++)
        {
            p[i]=new process();
            p[i].getdata();
        }
        q=(process [])p.clone();
        r=(process [])p.clone();
        s=(process [])p.clone();
        
        int c=0,st=0,wt=0;
        pschedule ref,ref2,ref3,ref1;
       fcfs f ;
        
        /*for(int i=1;i<=2;i++) {
            switch(i){
                case 2: ref = new sjf(p,n);
                       // ref.setPriority(10);
                        ref.start();
                        //break;
                case 1: ref = new fcfs(p,n);
                        //ref.setPriority(2);
                        ref.start();
                        break;
                default : System.out.println("reh gye");
            }
        }*/
                       f = new fcfs(s,n);
                        ref1 = new rr(q,n);
                        ref2 = new sjf(r,n);
                       
                      
                        //ref3.print();
                       
                       ref1.run();
                       f.run();
                       ref2.run();
                       ref1.print();
                       
                       //ref2.evalute();
                      // ref2 = new sjf(r,n);
                       ref2.print();                       
                       //ref3.evalute();
                      
                        
           
        
    }
}
