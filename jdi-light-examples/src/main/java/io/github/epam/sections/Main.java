package io.github.epam.sections;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import org.openqa.selenium.WebElement;

public class Main extends Section {
	@Css("form#contact-form") public ContactForm contactForm;
	@XPath(".//button[@type='submit']") public WebElement calculate;

}