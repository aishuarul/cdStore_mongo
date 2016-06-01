package cdStoreMaven;

import static org.junit.Assert.*;

import javax.persistence.Column;
import com.ottawau.cdstore.orderProcessing.entity.*;
import org.junit.Test;
public class Testcase {

	/*
	 * 
	 * 
	 * 
	 * Test case for checking if the objects received and retrieved from the
	 * Address checks are equal
	 */
		@Test
		public void TC1() {
			
			String street="bank";
			String province="ontario";
			String country="ca";
			String zip="098";
			String phone="1234567890";
			
			Address objaddr = new Address();
			String resultset;
			
			objaddr.street=street;
			objaddr.province=province;
			objaddr.country=country;
			objaddr.zip=zip;
			objaddr.phone=phone;
			
				
			resultset = objaddr.getStreet();
			assertEquals(resultset,"bank");
			
			resultset = objaddr.getProvince();
			assertEquals(resultset,"ontario");
			
			resultset = objaddr.getCountry();
			assertEquals(resultset,"ca");
			
			resultset = objaddr.getZip();
			assertEquals(resultset,"098");
			
			resultset = objaddr.getPhone();
			assertEquals(resultset,"1234567890");
			
			}
			
		}