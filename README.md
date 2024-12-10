**30 July 2023** - Verified, working --> Step in report using ExtentCucumberAdapter.addTestStepLog; Report not generates for tag reason, what actually, don't know.

**29 July 2023** - Eureka!!!! Extent reporting is now working. Just had to place extent.properties in src/test/resources and add plugin - "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", also place extent-config.xml at the same path which is used by extent.properties

**29 July 2023** - Added ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();getDriver() is for normal driver init, getDriver1() is for trying to use ExtentCucumberAdapter.addTestStepLog, though not yet able to use, trying.

**28 July 2023** - Logger woring totally fine, just DEBUG also coming on console; Extent reporting not generating!  place log4j2.properties in src/test/resources

**25 July 2023** - Voila!! BrowserSet up vs Hooks, Before After working now finally. Cucumber reporting wth screenshots, TestNG Reporting with Screenshots, Cucumber with TestNG; and concept of Before and After hooks in Cucumber and TestNG; TestNG takes one scenario as one @Test as in TestNG itself, adding screenshots on scenario level, dealing with byteArray byte[], also attaching the image screenshot wrt its origin al height and width. Driver initilize and ts methods in Utilities class, everything working fine

**The folder** test-output can be deleted, but Target should not be deleted ever, it contains .class files which keeps all classes including the Runner file at classPath, so don't ever try to delete the Target folder or any of its files. Happy testing!

**Added cucumber steps**, with vertical column. Use horizontal table with header. Also, tabular form available. BrowserSet up vs Hooks, Before After working now finally

**8 Feb 2024** - Create and Run Maven Project from CMD,surefire reports

**1-Apr-2024** - updated to Selenium 4.17.0, removed WebDriverManager