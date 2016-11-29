/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DesiredCapabilities
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType

waiting {
	timeout = 2
}

environments {
	
	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}
	
	// run via “./gradlew firefoxTest”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		driver = { new FirefoxDriver() }
	}

    phantomJs {
        driver = { new PhantomJSDriver() }
    }

    appium {
        driver = {
            DesiredCapabilities capabilities = new DesiredCapabilities()
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android")
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device")
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome")
            new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities)
        }
    }

}

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "http://gebish.org"
