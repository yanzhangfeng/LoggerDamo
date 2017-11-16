package org.yzf.loggerDamo.service.impl;

import org.springframework.stereotype.Component;
import org.yzf.loggerDamo.service.ServiceTest;

@Component("ServiceTest")
public class ServiceTestImpl implements ServiceTest {

	@Override
	public void test() throws Exception {
			aaa();
	}

	private void aaa() throws Exception {
		System.out.println(1/0);
	}
}
