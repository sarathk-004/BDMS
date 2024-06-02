package com.bloodDonationMgmtSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bloodDonationMgmtSystem.model.DonarDetails;
import com.bloodDonationMgmtSystem.model.RequestorDetails;
import com.bloodDonationMgmtSystem.repositories.DonarDetailsRepository;
import com.bloodDonationMgmtSystem.repositories.RequestorDetailsRepository;


@Controller
public class RequestorDetailsController {
    
	@Autowired
	RequestorDetailsRepository requestorDetailsRepository;
	
	@GetMapping("/requestorDetails")
	public String getDonarDetails(@ModelAttribute("requestorDetails") RequestorDetails requestorDetails) {
		return "requestorDetails";
	}
	
	@PostMapping("/requestorDetails")
	public String saveProject(@ModelAttribute("requestorDetails") RequestorDetails requestorDetails, Model model) {
		requestorDetailsRepository.save(requestorDetails);
		model.addAttribute("message", "New requestor is created / matched successfully");
		return "requestorDetails";
	}
	
	@GetMapping("/requestorsList")
	public String requestorsPage(Model model) {
		List<RequestorDetails> listOfRequestors = requestorDetailsRepository.findAll();
		model.addAttribute("requestorDetails", listOfRequestors);
		return "requestorsList";
	}
	
	@GetMapping("/requestorListMatcher")
	public String getDonarListApproval(@ModelAttribute("requestorDetails") RequestorDetails requestorDetails) {
		return "requestorListMatcher";
	}

	@PostMapping("/requestorListMatcher")
	public String approveDonar(@ModelAttribute("requestorDetails") RequestorDetails requestorDetails, Model model) {
		requestorDetailsRepository.save(requestorDetails);
		model.addAttribute("message", "New requestor is created / matched successfully");
		return "requestorListMatcher";
	}
	
	
	/*
	 * @GetMapping("/projectNames") public String projectNames(Model model) {
	 * List<String> listOfProjects = projectRepository.findProjects();
	 * model.addAttribute("projectNames", listOfProjects); return "projectNames"; }
	 */
}
