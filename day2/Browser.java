package week1.day2;

public class Browser {
String launchBrowser(String browserName){
System.out.println("Browser launched successfully");
	return "Edge";
	}
public void loadUrl() {
	System.out.println("Application url loaded successfully");	
}
public static void main(String[] args) {
	Browser obj = new Browser();
	obj.launchBrowser("Google");
	String toprint = obj.launchBrowser("Google");
	System.out.println(toprint);
	obj.loadUrl();
}



}
