package com.citi.gce.gls;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.gce.gls.entities.LiquiditySharingAccount;
import com.citi.gce.gls.entities.RelatedAccounts;
import com.citi.gce.gls.services.LiquiditySharingAccountService;
import com.citi.gce.gls.services.RelatedAccountsService;

@Controller
@RestController
public class TestController {

	@Autowired
	RelatedAccountsService service;
	
	@Autowired
	LiquiditySharingAccountService liquiditySharingAccountService;
	
	@POST
	@RequestMapping("/addRelatedAccounts")
	public void addRelatedAccounts(@RequestBody RelatedAccounts relatedAccounts ) {
		System.out.println("relation id from the post call: "+relatedAccounts);
		System.out.println("Adding data in related accounts");
		service.persist(relatedAccounts);
	}
	
	
	@GET
	@RequestMapping("/getRelatedAccounts")
	public List<RelatedAccounts> getAll() {
		System.out.println("Getting data from related accounts");
		for(int i = 0; i<10; i++) {
			service.persist();
		}
		return service.getAllRelatedAccounts();
	}
	
	@GET
	@RequestMapping("/getAllLiquiditySharingAccount")
	public List<LiquiditySharingAccount> getAllLiquiditySharingAccount() {
		System.out.println("Adding data in related accounts");
		for(int i = 0; i<10; i++) {
			liquiditySharingAccountService.persist();
		}
		return liquiditySharingAccountService.getAllLiquiditySharingAccount();
	}
	
	
	@POST
	@RequestMapping("/addLiquiditySharingAccount")
	public void addRelatedAccounts(@RequestBody LiquiditySharingAccount liquiditySharingAccount ) {
		liquiditySharingAccountService.persist(liquiditySharingAccount);
	}
	
}
