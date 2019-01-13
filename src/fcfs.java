class fcfs extends pschedule
{
int c=0,e,t=1;
process pr[];

public static process getshortest(process pc[],int e,int t)
    {
        process s = new process();
        s.at=1000;
        
        //s.flag=false;
        for(int i=1;i<=e;i++)
        {
            if(pc[i].at<=t&&pc[i].flag==false)
            {
                s=pc[i];
            return s;
            }
            //return s;
        }
    return s;
    }

    @Override
    public void evalute() {
     
     
        System.out.println("ID\tAT\tCPUB\tTAT\tWT"+"\talgo_fcfs");
     while(c<=e)
     {
         process x = new process();
         x=getshortest(pr,e,t);
         if(x.at==1000)
             t++;
         else
         {
             c++;
             x.flag=true;
             t=t+x.cpub;
             x.tat=t-x.at;
             x.wt=x.tat-x.cpub;
             System.out.println(""+x.id+"\t"+x.at+"\t"+x.cpub+"\t"+x.wt+"\t"+x.tat);
         }
     }
        return;
    }
    public fcfs(process p[],int k)
    {
        pr=(process [])p.clone();
        
       /*         pr[1].at=1;
        pr[1].id=1;
        pr[1].cpub=2;
        pr[2].id=2;
        pr[2].at=1;
        pr[2].id=3;
        */
        e=k;
       
    }
    public void run()
    {
        evalute();
    }
    public void print()
    {
        for(int i=1;i<=e;i++)
        {
            System.out.println("at_fcfs "+i+" = "+pr[i].at);
        }
    }
    
}