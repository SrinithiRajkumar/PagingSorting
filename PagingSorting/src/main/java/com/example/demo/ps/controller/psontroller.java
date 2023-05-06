package com.example.demo.ps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ps.entity.psentity;
import com.example.demo.ps.service.psservice;

@RestController
public class psontroller {
	@Autowired
	private psservice p;
	@GetMapping("/pagesort")
	public List<psentity>getdetails (@RequestParam int pageno,@RequestParam int pagesize){
		return p.getdetails(pageno, pagesize);
	}

}
