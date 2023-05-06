package com.example.demo.ps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.ps.entity.psentity;
import com.example.demo.ps.repository.psrepointer;
@Service
public class psservice implements psserviceinter {
@Autowired
private psrepointer r;
	@Override
	public List<psentity> getdetails(int pageno, int pagesize) {
		// TODO Auto-generated method stub
		Pageable page=PageRequest.of(pageno, pagesize,Direction.DESC,"id");
		return r.findAll(page).getContent() ;
	}

}


