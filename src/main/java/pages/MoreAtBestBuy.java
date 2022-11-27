package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import static common.CommonActions.*;

public class MoreAtBestBuy {
	WebDriver driver;
	CommonWaits waits;

	public MoreAtBestBuy(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span [@class= 'v-p-right-xxs utility-nav-drawer-btn-label']) [2]")
	WebElement tryMore;
	@FindBy(xpath = "(//a[@class= 'utility-menu-flyout-list-item']) [1]")
	WebElement giftIdea;
	@FindBy(xpath = "(//a[@class= 'cn-carousel-item']) [1]")
	WebElement retroGift;
	@FindBy(xpath = "(//a[@href='/site/polaroid-now-/6476147.p?skuId=6476147']) [2]")
	WebElement polaroidCam;
	@FindBy(css = ".c-button.c-button-primary.c-button-lg.c-button-block.c-button-icon.c-button-icon-leading.add-to-cart-button")
	WebElement addCart;
	@FindBy(css = ".c-button.c-button-secondary.c-button-sm.c-button-block")
	WebElement goCart;
	@FindBy(xpath = "css = \".btn.btn-lg.btn-block.btn-primary\"")
	WebElement checkout;

	public void more() {
		click(tryMore);
	}

	public void giftIdeas() {
		click(giftIdea);

		if (isPresent(giftIdea) && isDisplayed(giftIdea)) {
			selectDropdown(giftIdea, "Gift Ideas");
		}
	}

	public void retroGifts() {
		click(retroGift);
		if (isPresent(retroGift) && isDisplayed(retroGift)) {
			selectDropdown(retroGift, "Retro Gifts");
	}
	}

	public void polariodCamera() {
		click(polaroidCam);
	}

	public void addToCart() {
		click(addCart);
	}

	public void goToCart() {
		click(goCart);
	}

	public void checkOut() {
		click(checkout);
	}
}
