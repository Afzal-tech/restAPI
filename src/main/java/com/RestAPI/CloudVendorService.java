package com.RestAPI;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorService {
	CloudVendor cloudvendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getVendorDetails(String vendorId) {
	
		return  cloudvendor;
	}
	@PostMapping
	public String CreateVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor= cloudvendor;
		
		return "Vendor details created sucessfully";
	}
	
	@PutMapping
	public String UpdateVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor= cloudvendor;
		
		return "Vendor details updated sucessfully";
	}
	@DeleteMapping("{vendorId}")
	public String deleteVendorDetails(String vendorId) {
		this.cloudvendor= null;
		
		return "Vendor details deleted sucessfully";
	}

	

}
