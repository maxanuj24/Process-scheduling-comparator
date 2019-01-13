import java.util.Scanner;

/**
 *
 * @author D
 */
import java.util.Scanner;

public class rr extends pschedule {
    int y,t=1;
    process pr[];
    
 public rr(process p[],int k)
 {
     pr=(process [])p.clone();
         /*    pr[1].at=1;
        pr[1].id=1;
        pr[1].cpub=2;
        pr[2].id=2;
        pr[2].at=1;
        pr[2].id=3;
        */
     y=k;
 }
public void evalute()
{
        process p[];
        int c=0,st=0,wt=0,q=2;
        
        System.out.println("I1D\tAT\tCPUB\tTAT\tWT\talgo_rr");
        while(c<y)
        {
            for(int i=1;i<=y;i++)
            {
               if(pr[i].at<=t)
               {
                if(pr[i].rt<=q&&pr[i].flag==false)
                {
                t+=pr[i].rt;
                pr[i].rt=0;
                pr[i].flag=true;      
                pr[i].tat=t-pr[i].at;
                pr[i].wt=pr[i].tat-pr[i].cpub;
                c++;
                System.out.println(pr[i].id+"\t"+pr[i].at+"\t"+pr[i].cpub+"\t"+pr[i].tat+"\t"+pr[i].wt+"\trr");
                }
                else
                {
                t+=q;
                pr[i].rt=pr[i].rt-q;
                }
              }
               else
                   t++;
            }
        }
       
    }
public void run()
{
    evalute();
}

public void print()
    {
        for(int i=1;i<=y;i++)
        {
            System.out.println("at_rr"+i+" = "+pr[i].at);
        }
    }
}
    
