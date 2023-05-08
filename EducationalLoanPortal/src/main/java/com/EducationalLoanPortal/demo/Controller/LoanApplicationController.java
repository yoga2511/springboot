package com.EducationalLoanPortal.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.EducationalLoanPortal.demo.Service.LoanApplicationService;
import com.EducationalLoanPortal.demo.model.LoanApplicationModel;

@RestController
@RequestMapping("/admin")
public class LoanApplicationController {
	@Autowired
	LoanApplicationService laSer;
	@GetMapping(value="/getAllLoans")
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laSer.get();
		return l;
	}
	@PostMapping(value="/postadmin")
	public LoanApplicationModel saveUser(@RequestBody LoanApplicationModel l)
	{
		return laSer.saveUser(l);
	}
	@DeleteMapping(value="/deleteadmin/{id}")
	public void Del(int id)
	{
		laSer.Del(id);
	}
	@PutMapping("/updateadmin")
	public LoanApplicationModel updateUser(@RequestBody LoanApplicationModel l)
	{
		return laSer.updateUser(l);
	}
	
}
