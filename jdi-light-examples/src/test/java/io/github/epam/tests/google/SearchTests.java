package io.github.epam.tests.google;

import io.github.com.custom.SearchResult;
import io.github.epam.StaticTestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.tools.PrintUtils.print;
import static io.github.com.pages.Header.epamLogo;
import static io.github.com.pages.Header.search;
import static io.github.com.pages.SearchPage.search3;
import static io.github.com.pages.SearchPage.searchS;
import static io.github.epam.tests.recommended.steps.Preconditions.shouldBeLoggedIn;
import static org.testng.Assert.assertEquals;

/**
 * Created by Roman_Iovlev on 3/2/2018.
 */
public class SearchTests extends StaticTestsInit {
    @BeforeMethod
    public void before() {
        shouldBeLoggedIn();
        epamLogo.click();
        search("jdi");
    }

    @Test
    public void printResultTest() {
        String result = search3.get(1).print();
        assertEquals(result, "SearchResult{NAME=JDI OWNER CONTACT; DESCRIPTION=Write an email directly to Framework owner and main architect Iovlev Roman; LINK=mailto:roman.iovlev.jdi@gmail.com}");
    }
    @Test
    public void printResultListTest() {
        String results = print(search3, SearchResult::print);
        assertEquals(results,
         "SearchResult{NAME=JDI SKYPE; DESCRIPTION=JDI Skype group with active JDI users; LINK=https://join.skype.com/u2Cel0MWHkAO}," +
            "SearchResult{NAME=JDI OWNER CONTACT; DESCRIPTION=Write an email directly to Framework owner and main architect Iovlev Roman; LINK=mailto:roman.iovlev.jdi@gmail.com}," +
            "SearchResult{NAME=JDI TEST SITE; DESCRIPTION=JDI Site for testing; LINK=https://epam.github.io/JDI/}," +
            "SearchResult{NAME=JDI YOUTUBE CHANNEL; DESCRIPTION=JDI Tutorial Official Youtube; LINK=https://www.youtube.com/channel/UCck0VgwbPVgXht5h6PGCdgg/videos?view_as=subscriber}," +
            "SearchResult{NAME=JDI DOCUMENTATION; DESCRIPTION=JDI Documentation; LINK=https://jdi-docs.github.io/jdi-light}," +
            "SearchResult{NAME=JDI PARTNERS GROUP - COMA QA; DESCRIPTION=Minsk Testing community Coma QA; LINK=https://www.facebook.com/comaqa.by/}");
        searchS.is().size(8);
        search3.clear();
        String results2 = print(search3, SearchResult::print);
        assertEquals(results2,
         "SearchResult{NAME=JDI SKYPE; DESCRIPTION=JDI Skype group with active JDI users; LINK=https://join.skype.com/u2Cel0MWHkAO}," +
            "SearchResult{NAME=JDI OWNER CONTACT; DESCRIPTION=Write an email directly to Framework owner and main architect Iovlev Roman; LINK=mailto:roman.iovlev.jdi@gmail.com}," +
            "SearchResult{NAME=JDI TEST SITE; DESCRIPTION=JDI Site for testing; LINK=https://epam.github.io/JDI/}," +
            "SearchResult{NAME=JDI YOUTUBE CHANNEL; DESCRIPTION=JDI Tutorial Official Youtube; LINK=https://www.youtube.com/channel/UCck0VgwbPVgXht5h6PGCdgg/videos?view_as=subscriber}," +
            "SearchResult{NAME=JDI DOCUMENTATION; DESCRIPTION=JDI Documentation; LINK=https://jdi-docs.github.io/jdi-light}," +
            "SearchResult{NAME=JDI VK GROUP; DESCRIPTION=Russian Community VK group; LINK=https://vk.com/jdi_framework}," +
            "SearchResult{NAME=JDI FACEBOOK GROUP; DESCRIPTION=English Community Facebook group; LINK=https://www.facebook.com/groups/jdi.framework/}," +
            "SearchResult{NAME=JDI PARTNERS GROUP - COMA QA; DESCRIPTION=Minsk Testing community Coma QA; LINK=https://www.facebook.com/comaqa.by/}");
    }
}
