package org.gradle.n2Exe1.callback;

public class PayentMethodCallback implements Callback {
	
	@Override
	public String call(String method) {
		String result = "";
		if (method.equalsIgnoreCase("tdc")) {
			result = "tdc payment done";
		} else if (method.equalsIgnoreCase("paypal")){
			result = "paypal payment done";
		} else if (method.equalsIgnoreCase("bank")) {
			result = "bank payment donde";
		}

		return result;
	}

}
