package com.marika.H2GlassfishTest.service;

import java.util.List;

import com.marika.H2GlassfishTest.exception.TestNotFound;
import com.marika.H2GlassfishTest.model.Test;

public interface TestService {
	public Test create(Test test);
	public Test delete(int id) throws TestNotFound;
	public List<Test> findAll();
	public Test update(Test test) throws TestNotFound;
	public Test findById(int id);
}
