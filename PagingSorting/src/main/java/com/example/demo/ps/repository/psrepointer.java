package com.example.demo.ps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ps.entity.psentity;

@Repository
public interface psrepointer extends CrudRepository<psentity,Integer>, PagingAndSortingRepository<psentity, Integer> {

}
