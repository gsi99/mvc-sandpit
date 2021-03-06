package com.ptp.testing.controller.springxd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ptp.tracking.summary.adaptor.TrackingAdaptor;


@Controller  
public class SummaryController {
	
	@Autowired
	TrackingAdaptor trackingAdapter;
	
    String message = "Welcome to Summary Controller";  
    
    @RequestMapping("/summary")  
    public ModelAndView showMessage() {  
        System.out.println("from summary controller");
        
        message = trackingAdapter.getCustomerItemSummarys();
        return new ModelAndView("summary", "message", message);  
    }

}
