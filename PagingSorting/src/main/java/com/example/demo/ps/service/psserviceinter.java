package com.example.demo.ps.service;

import java.util.List;

import com.example.demo.ps.entity.psentity;

public interface psserviceinter {
	public List<psentity> getdetails(int pageno,int pagesize);
	
}
