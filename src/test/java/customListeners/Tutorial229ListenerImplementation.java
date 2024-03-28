package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Tutorial229ListenerImplementation implements ITestListener {
	
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

 		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    	
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	System.setProperty("org.uncommons.reportng.escape-output","false");
    	System.out.println("Capture Screenshot on failed " + arg0.getName());
    	Reporter.log(" <a href=\"C:\\Users\\91976\\eclipse-workspace\\SeleniumWithTestNG\\screenshot\\below.jpg\" target=\"_blank\"> Screenshot Link </a>");
        		
    }		

   	
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

  		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    	
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	System.setProperty("org.uncommons.reportng.escape-output","false");
    	System.out.println("Capture Screenshot on success " + arg0.getName());
    	Reporter.log(" <a href=\"C:\\Users\\91976\\eclipse-workspace\\SeleniumWithTestNG\\screenshot\\right.jpg\" target=\"_blank\"> <img height=200 width=200 src=\"C:\\Users\\91976\\eclipse-workspace\\SeleniumWithTestNG\\screenshot\\below.jpg\"> </a>");
        		
    }	

}
