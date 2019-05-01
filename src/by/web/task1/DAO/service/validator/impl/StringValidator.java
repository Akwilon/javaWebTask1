package by.web.task1.DAO.service.validator.impl;

import java.util.Optional;

import by.web.task1.service.util.Validator;

public class StringValidator implements Validator {

	@Override
	public boolean isString(String text) {
		boolean flag = Optional.of(text).isPresent() ? true : false;
		return flag;
	}	
}
