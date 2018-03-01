package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    WebDriver webDriver;

    public DashboardPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void action() throws InterruptedException {

        WebElement fieldDashboard = webDriver.findElement(By.cssSelector("li[data-submenu='1']"));
        fieldDashboard.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldOrder = webDriver.findElement(By.cssSelector("li[data-submenu='3']"));
        fieldOrder.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldCatalog = webDriver.findElement(By.cssSelector("li[data-submenu='9']"));
        fieldCatalog.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldClients = webDriver.findElement(By.cssSelector("li[data-submenu='23']"));
        fieldClients.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldSupport = webDriver.findElement(By.cssSelector("li[data-submenu='27']"));
        fieldSupport.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldStatistics = webDriver.findElement(By.cssSelector("li[data-submenu='31']"));
        fieldStatistics.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldModules = webDriver.findElement(By.cssSelector("li[data-submenu='42']"));
        fieldModules.click();
        PrintRefreshPrint(webDriver);



        WebElement fieldDesign = webDriver.findElement(By.cssSelector("li[data-submenu='46']"));
        fieldDesign.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldDelivery = webDriver.findElement(By.cssSelector("li[data-submenu='52']"));
        fieldDelivery.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldPaymentMathod = webDriver.findElement(By.cssSelector("li[data-submenu='55']"));
        fieldPaymentMathod.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldInternational = webDriver.findElement(By.cssSelector("li[data-submenu='58']"));
        fieldInternational.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldShopParameters = webDriver.findElement(By.cssSelector("li[data-submenu='73']"));
        fieldShopParameters.click();
        PrintRefreshPrint(webDriver);


        WebElement fieldConfiguration = webDriver.findElement(By.cssSelector("li[data-submenu='95']"));
        fieldConfiguration.click();
        PrintRefreshPrint(webDriver);

        Thread.sleep(5000);
    }

    public static void PrintRefreshPrint(WebDriver webDriver) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Раздел - " + webDriver.getTitle());
        webDriver.navigate().refresh();
        Thread.sleep(1000);
        System.out.println("Раздел после обновления - " + webDriver.getTitle() + "\n");
    }
}