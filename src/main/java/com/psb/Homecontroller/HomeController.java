package com.psb.Homecontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psb.Entitys.Entitys;
import com.psb.Service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService s;

	@PostMapping("/emp")
	public String addemp(@RequestBody Entitys e) {

		s.addemp(e);
		return "added to data base ";

	}

	@DeleteMapping("/id/{id}")
	public String deleteById(@PathVariable Entitys id) {

		Entitys en = s.deleteById(id);
		return "data deleted in data base ";

	}

	@GetMapping("/id/{id}")
	public Optional<Entitys> selcetById(@PathVariable int id) {

		Optional<Entitys> e = s.selcetById(id);

		return e;

	}
	
	@GetMapping("/selectall")
	public List<Entitys> selcetAll() {

		List<Entitys> list = s.selcetAll();

		return list;

	}
	
	
	

}
