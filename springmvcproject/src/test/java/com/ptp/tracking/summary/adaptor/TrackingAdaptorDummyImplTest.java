package com.ptp.tracking.summary.adaptor;

import junit.framework.TestCase;

public class TrackingAdaptorDummyImplTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetCustomerItemSummarys() {

        TrackingAdaptorDummyImpl trackingAdaptorDummyImpl = new TrackingAdaptorDummyImpl();
        String trackingAdaptorSummary = trackingAdaptorDummyImpl.getCustomerItemSummarys();
        
        assertNotNull(trackingAdaptorSummary);
		
	}

}
