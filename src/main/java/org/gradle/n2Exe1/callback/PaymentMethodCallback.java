package org.gradle.n2Exe1.callback;

public class PaymentMethodCallback implements Callback {
	
	@Override
	public String call(int method) {
		String result = "";
		if (method == 1) {
			result = "tdc payment done";
		} else if (method == 2) {
			result = "paypal payment done";
		} else if (method == 3) {
			result = "bank payment donde";
		}

		return result;
	}

}
