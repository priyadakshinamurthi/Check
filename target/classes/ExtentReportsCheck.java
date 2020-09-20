package resources;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportsCheck {

	
	public static ExtentReports reportMethod()
	{
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter spark = new ExtentSparkReporter(path);
	spark.config().setReportName("Web Results");
	spark.config().setDocumentTitle("Results");
	ExtentReports report= new ExtentReports();
	report.attachReporter(spark);
	report.setSystemInfo("Tester", "Priya");
	return report;
	}
	
}
