package PlayWright;

import com.microsoft.playwright.*;

public class PlayWrightExecution {

	
	public static void main(String[] args) {
		PlayWrightMethods playWrightMethods=new PlayWrightMethods();
		playWrightMethods.launchBrowser();
		playWrightMethods.lauchUrl("https://www.amazon.in");
		playWrightMethods.checkElementIsEnable();
		playWrightMethods.checkElementIsVisible();
		playWrightMethods.getTitle();
		playWrightMethods.closeBrowser();
		playWrightMethods.closePlayWright();
		
	}

}
