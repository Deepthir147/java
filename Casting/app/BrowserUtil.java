package com.xworkz.allprojects.app.inheritance.Casting.app;

public class BrowserUtil extends Browser {
	public void internet(Browser browser) {
		
		if(browser instanceof Edge)
		{
			System.out.println("Invoking in Edge in util");
			Edge edge=(Edge)browser;
			System.out.println(edge.newsPaper);
			System.out.println("edge.browserNmae");
			edge.music();
			edge.search();
			
			
		}
		if(browser instanceof ChromeBrowser)
		{
			System.out.println("Invoking in Edge in util");
			ChromeBrowser chromeBrowser=(ChromeBrowser)browser;
			System.out.println(chromeBrowser.browserNmae);
			System.out.println("ChromeBrowser.browserNmae");
			chromeBrowser.videoSearch();
			chromeBrowser.search();	
		}
		if(browser instanceof Firefox)
		{
			System.out.println("Invoking in Edge in util");
			Firefox firefox=(Firefox)browser;
			System.out.println(firefox.searchDate);
			System.out.println("firefox.browserNmae");
			firefox.typeOfInfo();;
			firefox.search();	
		}
		if(browser instanceof MicrosoftEdge)
		{
			System.out.println("Invoking in Edge in util");
			MicrosoftEdge microsoftEdge=(MicrosoftEdge)browser;
			System.out.println(microsoftEdge.acces);
			System.out.println("microsoftEdge.browserNmae");
			microsoftEdge.getpdf();;
			microsoftEdge.search();	
		}
		
	}

}
