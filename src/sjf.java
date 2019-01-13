
import java.util.Scanner;


class sjf extends pschedule
{
int t=1,m;
process pr[];
 public sjf(process p[],int k)
    {
        pr=p;
         pr=(process [])p.clone();
       
        /*pr[1].at=1;
        pr[1].id=1;
        pr[1].cpub=2;
        pr[2].id=2;
        pr[2].at=1;
        pr[2].id=3;
        */
        m=k;
    }    

    @Override
    public void evalute() {
        
        int c=0,st=0,wt=0;
        
        System.out.println("ID\tAT\tCPUB\tTAT\tWT"+"\talgo_sjf");
        while(c<=m)
        {
            process x = new process();
            x=getshortest(t,pr,m);
            if(x.at==1000)t++;
            else
            {
                t+=x.cpub;
                x.tat=t-x.at;
                x.wt=x.tat-x.cpub;
                x.flag=true;
                st+=x.tat;
                wt+=x.wt;
                c++;
                System.out.println(x.id+"\t"+x.at+"\t"+x.cpub+"\t"+x.tat+"\t"+x.wt+"\tsjf");
            }
        }
    }

    public static process getshortest(int t,process pr[],int m)
    {
        process s = new process();
        s.at=1000;
        s.cpub=1000;
        s.flag=false;
        for(int i=1;i<=m;i++)
        {
            if(pr[i].at<=t&&pr[i].flag==false)
            {
                if(pr[i].cpub<s.cpub)
                s=pr[i];
                else if(pr[i].cpub==s.cpub)
                {
                    if(pr[i].at<s.at)
                    s=pr[i];
                  }
            }
        }
        return s;
    }
   
@Override
    public void run()
    {
        evalute();
    }
public void print()
    {
        for(int i=1;i<=m;i++)
        {
            System.out.println("at_sjf "+i+" = "+pr[i].at);
        }
    }
}