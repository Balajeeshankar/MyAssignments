package week1.day1;

public class Browser {
	
	public String launchbrowser(String browsername) {
		
		return browsername;
		
	}
	
	public void loadurl() {
		
		System.out.println("Application url loaded successfully");
		
	}
	
	public static void main(String[] args) {
		
		Browser Chrome = new Browser();
		
		String launchbrowser = Chrome.launchbrowser("Browser Loaded Successfully");
		System.out.println(launchbrowser);
		Chrome.loadurl();
	}

}
