package com.mycompany

import org.apache.wicket.util.tester.WicketTester
import org.junit.jupiter.api.BeforeEach
import com.mycompany.WicketApplication
import com.mycompany.HomePage
import org.junit.jupiter.api.Test

/**
 * Simple test using the WicketTester
 */
class TestHomePage {

    private var tester: WicketTester? = null
    @BeforeEach
    fun setUp() {
        tester = WicketTester(WicketApplication())
    }

    @Test
    fun homepageRendersSuccessfully() {
        //start and render the test page
        tester!!.startPage(HomePage::class.java)

        //assert rendered page class
        tester!!.assertRenderedPage(HomePage::class.java)
    }
}