package com.test.runner;
import com.google.threadclasses.GoogleFeatureThread;
/**
 * 
 * @author NaveenKhunteta
 *
 */
public class GoogleTestRunner {

	public static void main(String ar[]) {

		// Thread t1 = new GoogleFeatureThread("chrome thread", "chrome");
		// Thread t2 = new GoogleFeatureThread("firefox thread", "firefox");
		//
		// System.out.println("threads started.....");
		//
		// t1.start();
		// t2.start();

		int chromeCount = Integer.parseInt(System.getProperty("chrome"));
		int firefoxCount = Integer.parseInt(System.getProperty("firefox"));
		
		System.out.println("total chrome : " + chromeCount + " and " + "total firefox : " + firefoxCount);

		for (int i = 0, j = 0; i < chromeCount || j < firefoxCount; i++, j++) {
			System.out.println("threads started.....");

			new GoogleFeatureThread("chrome thread", "chrome").start();
			new GoogleFeatureThread("firefox thread", "firefox").start();

			System.out.println("thread got ended....");
		}

	}

}
