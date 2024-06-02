package com.bloodDonationMgmtSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bloodDonationMgmtSystem.model.DonarDetails;
import com.bloodDonationMgmtSystem.repositories.DonarDetailsRepository;


@Controller
public class DonarDetailsController {
    
	@Autowired
	DonarDetailsRepository donarDetailsRepository;
	
	@GetMapping("/donarDetails")
	public String getDonarDetails(@ModelAttribute("donarDetails") DonarDetails donarDetails) {
		return "donarDetails";
	}
	
	@PostMapping("/donarDetails")
	public String saveProject(@ModelAttribute("donarDetails") DonarDetails donarDetails, Model model) {
		donarDetailsRepository.save(donarDetails);
		model.addAttribute("message", "New donar is Created / Updated successfully");
		return "donarDetails";
	}
	
	@GetMapping("/donarsList")
	public String donarsPage(Model model) {
		List<DonarDetails> listOfDonars = donarDetailsRepository.findAll();
		model.addAttribute("donarDetails", listOfDonars);
		return "donarsList";
	}
	
	@GetMapping("/donarListApproval")
	public String getDonarListApproval(@ModelAttribute("donarDetails") DonarDetails donarDetails) {
		return "donarListApproval";
	}

	@PostMapping("/donarListApproval")
	public String approveDonar(@ModelAttribute("donarDetails") DonarDetails donarDetails, Model model) {
		donarDetailsRepository.save(donarDetails);
		model.addAttribute("message", "New donar is Created / Updated successfully");
		return "donarListApproval";
	}
	
	
	/*
	 * @GetMapping("/projectNames") public String projectNames(Model model) {
	 * List<String> listOfProjects = projectRepository.findProjects();
	 * model.addAttribute("projectNames", listOfProjects); return "projectNames"; }
	 */
}
