package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class podcastTest {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver obj = new ChromeDriver();
        obj.get("https://qapodcastpage.ccbp.tech/");
        List <WebElement> podcastItems = obj.findElements(By.xpath("//div[@class = 'details-card']"));
        System.out.println("Podcast available: "  + podcastItems.size());
        // First podcast
        WebElement firstPodcast = obj.findElement(By.xpath("(//div[@id = 'sectionHomePage']/div[2]/div/div/img)[position() =1]"));
        firstPodcast.click();
        Thread.sleep(3000);
        List <WebElement>  firstpodcast = obj.findElements(By.xpath("//p[@class = 'podcast-duration']"));
        int episodes = 4;
        int firstPodcastSize = firstpodcast.size();
        if (firstPodcastSize==episodes){
            System.out.println("All Four Episodes Found");
        }else {
            System.out.println("Only Episodes Found");
        }
        WebElement backFirstPodcast = obj.findElement(By.xpath("//button[@class = 'button']"));
        backFirstPodcast.click();
        Thread.sleep(3000);
        // Second podcast
        WebElement SecondPodcast = obj.findElement(By.xpath("(//div[@id = 'sectionHomePage']/div[2]/div/div)[position() = 2]/img"));
        SecondPodcast.click();
        Thread.sleep(3000);
        List <WebElement>  secondpodcast = obj.findElements(By.xpath("//p[@class = 'podcast-duration']"));
        int secondPodcastSize = secondpodcast.size();
        if (secondPodcastSize==episodes){
            System.out.println("All Four Episodes Found");
        }else {
            System.out.println("Only Episodes Found");
        }
        WebElement backSecondPodcast = obj.findElement(By.xpath("//button[@class = 'button']"));
        backSecondPodcast.click();
        Thread.sleep(3000);
        // Third podcast
        WebElement thirdPodcast = obj.findElement(By.xpath("//div[@id = 'sectionHomePage']/div[2]/div[2]/div[1]/img"));
        thirdPodcast.click();
        List <WebElement>  thridpadcast = obj.findElements(By.xpath("//p[@class = 'podcast-duration']"));
        int thirdPodcastSize = thridpadcast.size();
        if (thirdPodcastSize==episodes){
            System.out.println("All Four Episodes Found");
        }else {
            System.out.println("Only Episodes Found");
        }
        WebElement backThirdPodcast = obj.findElement(By.xpath("//button[@class = 'button']"));
        backThirdPodcast.click();
        Thread.sleep(3000);
        // Fourth podcast
        WebElement fourthPodcast = obj.findElement(By.xpath("//div[@id = 'sectionHomePage']/div[2]/div[2]/div[2]/img"));
        fourthPodcast.click();
        List <WebElement>  fourthpodcast = obj.findElements(By.xpath("//p[@class = 'podcast-duration']"));
        int fourthPodcastSize = fourthpodcast.size();
        if (fourthPodcastSize==episodes){
            System.out.println("All Four Episodes Found");
        }else {
            System.out.println("Only Episodes Found");
        }
        WebElement backFourthPodcast = obj.findElement(By.xpath("//button[@class = 'button']"));
        backFourthPodcast.click();
        Thread.sleep(3000);
        obj.quit();
    }
}
