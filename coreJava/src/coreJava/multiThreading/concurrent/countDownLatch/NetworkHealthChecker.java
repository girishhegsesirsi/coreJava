package coreJava.multiThreading.concurrent.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class NetworkHealthChecker extends BaseHealthChecker
{
    public NetworkHealthChecker (CountDownLatch latch)  {
        super("Network Service", latch);
    }
     
    @Override
    public void verifyService() 
    {
        System.out.println("Checking " + this.getServiceName());
        try
        {
            Thread.sleep(3000);
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(this.getServiceName() + " is UP");
    }
}