package com.ptp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ptp.tracking.summary.adaptor.TrackingAdaptor;
import com.ptp.tracking.summary.adaptor.TrackingAdaptorDummyImpl;

@Configuration
public class PtpTestingConfig {
	
	@Bean
	public TrackingAdaptor trackingAdapter() {
		return new TrackingAdaptorDummyImpl();
	}

}
