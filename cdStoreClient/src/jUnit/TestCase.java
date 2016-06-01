package jUnit;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.ottawau.cdstore.jasonentity.ProcessOrderJason;

public class TestCase {
/*
 * 
 * 
 * 
 * Test case for checking if the objects received and retrieved from the
 * Jason purchase order are equal
 */
	@Test
	public void TC1() {
		
		String InputFirstName="bob";
		String InputLastName="josh";
		String InputZip="008";
		String InputCountry="ca";
		String InputEmail="hfdh@gmail.com";
		String mobile="9876345432";
		String InputAddress="xxx";
		String InputCity="ottawa";
		String InputState="ontario";
		String InputCCNumber="3245";
		String CCUsername="sd4456";
		String InputCCEXPDate="september 3";
		String InputCCEXPYr="2014";
		
		ProcessOrderJason objOrderJason = new ProcessOrderJason();
		String resultset;
		
		objOrderJason.InputFirstName = InputFirstName;
		objOrderJason.InputLastName = InputLastName;
		objOrderJason.InputZip = InputZip;
		objOrderJason.InputCountry = InputCountry;
		objOrderJason.InputEmail = InputEmail;
		objOrderJason.mobile = mobile;
		
		objOrderJason.InputAddress = InputAddress ;
		objOrderJason.InputCity = InputCity;
		objOrderJason.InputState = InputState;
		objOrderJason.InputCCNumber = InputCCNumber;
		objOrderJason.CCUsername = CCUsername;
		objOrderJason.InputCCEXPDate = InputCCEXPDate;
		objOrderJason.InputCCEXPYr = InputCCEXPYr;
			
		resultset = objOrderJason.getInputFirstName();
		assertEquals(resultset,"bob");
		
		resultset = objOrderJason.getInputLastName();
		assertEquals(resultset,"josh");
		
		resultset = objOrderJason.getInputZip();
		assertEquals(resultset,"008");
		
		resultset = objOrderJason.getInputCountry();
		assertEquals(resultset,"ca");
		
		resultset = objOrderJason.getInputEmail();
		assertEquals(resultset,"hfdh@gmail.com");
		
		resultset = objOrderJason.getMobile();
		assertEquals(resultset,"9876345432");
		
		resultset = objOrderJason.getInputAddress();
		assertEquals(resultset,"xxx");
		
		resultset = objOrderJason.getInputCity();
		assertEquals(resultset,"ottawa");
		
		resultset = objOrderJason.getInputState();
		assertEquals(resultset,"ontario");
		
		resultset = objOrderJason.getInputCCNumber();
		assertEquals(resultset,"3245");
		
		resultset = objOrderJason.getCCUsername();
		assertEquals(resultset,"sd4456");
		
		resultset = objOrderJason.getInputCCEXPDate();
		assertEquals(resultset,"september 3");
		
		resultset = objOrderJason.getInputCCEXPYr();
		assertEquals(resultset,"2014");
		
				}
		
	}

	