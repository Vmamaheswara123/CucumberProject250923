import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	public WebDriver driver;
	private String goolgle = "https://www.google.co.in/";
	private String urlHome = "https://abstracta.us/blog/software-testing/best-demo-websites-for-practicing-different-types-of-software-tests/";

	public static void main(String[] args) {
		System.out.println("Hello");

		Browser j = new Browser();
		j.browsersetup();
		// j.homePage();
		// j.homePageTitle();
		// j.searchBox();
		// j.typeOfsoftwareSubMenubar();
		// j.tableOfContains();
		j.tableOFDemoEcommerceSites();
		j.tearDown();
	}

	private void browserExectionText() {
		System.out.println("---------------------");
		System.out.println("--Execution is Staring--");
		System.out.println("---------------------");

	}

	public void browsersetup() {

		browserExectionText();
		String path = "D:\\WorkSpace_Repo\\Automation_02\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("-----------Window is Opened");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * System.out.println(); lunchUrl(goolgle);
		 * System.out.println("------------I have successfully navigated to Google Page"
		 * ); System.out.println(); googleBar(); parLink();
		 */
		lunchUrl(urlHome);

	}

	public void lunchUrl(String url) {
		driver.navigate().to(url);
	}

	public WebElement googleBar() {
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		ele.clear();
		ele.sendKeys("demo site for testing");
		ele.sendKeys(Keys.ENTER);
		System.out.println("----------------I have entered Demo site for testing on Google search bar");
		System.out.println();
		return ele;
	}

	public WebElement parLink() {
		System.out.println();
		WebElement linkUrl = driver
				.findElement(By.xpath("//*[text()='Best Demo Websites for Practicing Software Testing | Abstracta']"));
		linkUrl.click();
		System.out.println("----------I have sucessfully clicked on Demo site testing link");
		System.out.println();
		return linkUrl;
	}

	public void homePage() {
		ArrayList<String> menubar = new ArrayList<String>();
		menubar.add("How We Work ");
		menubar.add("Solutions ");
		menubar.add("Industries ");
		menubar.add("Insights ");
		menubar.add("Why Us ");
		menubar.add("Contact Us");

		System.out.println("Menu Bar text's:" + menubar);

		Iterator<String> imenu = menubar.iterator();

		while (imenu.hasNext()) {

			String menu = imenu.next();
			String element = "//*[contains(text(),'" + menu + "')]";
			// System.out.println(element);

			WebElement homeWeWork = driver.findElement(By.xpath(element));
			homeWeWork.click();

			System.out.println();
			System.out.println("--------I Have Sucessfully navigated " + menu + " Page");
			System.out.println();
			lunchUrl(urlHome);

		}
	}

	public void homePageTitle() {

		String pageTitle = "Best Demo Websites for Practicing Different Types of Software Tests";
		WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'" + pageTitle + "')]"));
		String element = "//h2[contains(text(),'" + pageTitle + "')]";
		title.click();
		eWait(30, element);
		/*
		 * boolean titleDisplayed = title.isSelected();
		 * System.out.println(titleDisplayed); if (titleDisplayed) {
		 * System.out.println("Home Page title is Displayed"); System.out.println(); }
		 */
	}

	public void eWait(int time, String element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
	}

	public void searchBox() {
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search here...']"));
		searchBox.clear();
		System.out.println("------------Click on search Box ");
		searchBox.sendKeys("Demo");
		searchBox.sendKeys(Keys.ENTER);
		System.out.println("------------Navigated to Demo Page");
		System.out.println();
	}

	public void javaScriptExecutor(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println(element.getText());
	}

	public void typeOfsoftwareSubMenubar() {
		String sEle = "//h3[contains(text(),'Search')]";
		WebElement scrollText = driver.findElement(By.xpath(sEle));
		javaScriptExecutor(scrollText);

		WebElement metaDate = driver.findElement(By.xpath("//*[@class = 'post-meta-date sh-default-color']"));
		metaDate.click();
		lunchUrl(urlHome);
		implWait(60);
		WebElement sftwaretest = driver.findElement(By.xpath("//span[@class = 'post-meta-categories']"));
		sftwaretest.click();
		lunchUrl(urlHome);
		implWait(60);
		WebElement mesPost = driver.findElement(By.xpath("//a[@class = 'post-meta-comments']"));
		mesPost.click();
	}

	public void tableOfContainscroolView() {
		String text = "Test sites are always needed to practice, whether for courses, workshops, webinars, testing new tools, etc. That’s why, in this post, I want to leave you a list of the sites that we refer to when trying new tools for ";
		String sEle = "//p[contains(text(),'" + text + "')]";
		WebElement scrollText = driver.findElement(By.xpath(sEle));
		javaScriptExecutor(scrollText);

	}

	public void tableOfContains() {
		tableOfContainscroolView();

		List<WebElement> contains = driver
				.findElements(By.xpath("//li[@class='ez-toc-page-1 ez-toc-heading-level-2']"));
		System.out.println("lenght of table contains:  " + contains.size());

		for (int i = 0; i < contains.size(); i++) {

			System.out.println((i + 1) + ") List of table contains:  " + contains.get(i).getText());
		}

		/*
		 * for(WebElement gtext: contains) {
		 * System.out.println(" List of table contains:  "+gtext.getText()); }
		 */
	}

	public void tableOFDemoEcommerceSites() {
		tableOfContainscroolView();

		//a[contains(text(),'Example Systems')]//following-sibling::ul
		List<WebElement> contains = driver
				.findElements(By.xpath("//a[contains(text(),'Demo E-commerce Sites')]//following-sibling::ul"));
		System.out.println("lenght of table contains:  " + contains.size());

		for (int i = 0; i < contains.size(); i++) {

			System.out.println((i + 1) + ") List of table contains:  " + contains.get(i).getText());
		}
	}

	public void demoEcommerce() {
		WebElement demoEcommerceSites = driver.findElement(By.xpath("//a[contains(text(),'Demo E-commerce Sites')]"));
		demoEcommerceSites.click();
		implWait(300);
	}

	// li[@class='ez-toc-page-1 ez-toc-heading-level-2']//child::li[1]
	// a[contains(text(),'Demo E-commerce Sites')]//following-sibling::ul

	public void implWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void tWait(int time) {
		try {
			wait(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void tearDown() {
		driver.quit();
	}
}