package com.psb.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.psb.Entitys.Entitys;
import com.psb.dao.dao;

@Component
public class HomeService {

	@Autowired
	dao d;

	public void addemp(Entitys e) {
		
		d.save(e);
		
	}

	public Entitys deleteById(Entitys id) {
		
		d.delete(id);
		
		return null;
	}

	public Optional<Entitys> selcetById(int id) {
		
		Optional<Entitys> e2 = d.findById(id);
		if (e2.isPresent()){
			e2.get();
			return e2;
		}
		
		return null;
	}

	public List<Entitys> selcetAll() {
		
		List<Entitys> list = d.findAll();
		return list;
	}
	
	
	
}
