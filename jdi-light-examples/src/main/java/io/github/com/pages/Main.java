package io.github.com.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import io.github.com.sections.ContactForm;
import org.openqa.selenium.WebElement;

public class Main {
	@Css("form#contact-form") public ContactForm contactForm;
	@XPath(".//button[@type='submit']") public WebElement calculate;

}