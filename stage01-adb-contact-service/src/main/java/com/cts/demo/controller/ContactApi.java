package com.cts.demo.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.demo.Entity.ContactEntity;
import com.cts.demo.dao.ContactRepository;
import com.cts.demo.model.ContactModel;
import com.cts.demo.model.GroupModel;


@RestController
@RequestMapping("/contacts")
public class ContactApi {
	@Autowired
	private ContactRepository contactRepo;
	
	@GetMapping("/{id}")
	public ResponseEntity<ContactModel> getContactById(@PathVariable(name="id") String contactId){
		ResponseEntity<ContactModel> result;
		ContactEntity entity = contactRepo.findById(contactId).orElse(null);
		if(null!=entity) {
			ResponseEntity<GroupModel> response = new RestTemplate().getForEntity("http://localhost:9100/groups/{id}",
					GroupModel.class, Collections.singletonMap("id",entity.getGroupCode()));
			ContactModel model = new ContactModel(entity,response.getBody());
			result= new ResponseEntity<ContactModel>(model,HttpStatus.OK);
		}else {
			result = new ResponseEntity<ContactModel>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
}