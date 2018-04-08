package com.ll.gaokao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.gaokao.dao.RepoMajor;
import com.ll.gaokao.model.Major;

@Service
public class MgmtMajor {
	@Autowired
	private RepoMajor dao;
	
	public List<Major> findByZyType(String type) {
		return dao.findByZytype(type);
	}
}
