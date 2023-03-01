import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IssuesGlobalPage;
import pages.LoginPage;
import pages.MainPage;

public class CheckIssueTypesTest extends ConfigTest {

    @Test
    public void checkIssueTypesTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("skrmnyi", "*******");
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToIssuesGlobalPage();
        IssuesGlobalPage issuesGlobalPage = new IssuesGlobalPage(driver);
        List<String> expectedIssueTypes = new ArrayList<>();
        expectedIssueTypes.addAll(Arrays.asList("Created", "Assigned", "Mentioned"));
        Assert.assertEquals(expectedIssueTypes, issuesGlobalPage.getIssueTypes());
    }
}
