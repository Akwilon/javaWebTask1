package by.web.task1.DAO.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import by.web.task1.DAO.AdminDAO;
import by.web.task1.DAO.exception.DAOException;

public class FileAdminDAO implements AdminDAO{

	@Override
	public boolean signIn(String login, String pass) throws DAOException {
		try {
			List<String> logPass = Files.readAllLines(Paths.get("C:/Users/Даниил/eclipse-workspace/javaWebTask1/src/by/web/task1/resources/AdminList.txt"));
			logPass = splitter(logPass);
			if(logPass.indexOf(pass) - logPass.indexOf(login) == 1) {
				return true;
			}
		} catch (IOException e) {
			throw new DAOException("FilesException",e);
		}
		return false;
	}

	
	private static List<String> splitter(List<String> words) {
		List<String> res = new ArrayList<>();
		for(String line : words) {
			String[] buff = line.split("\\s+");
				for(String word : buff) {
					res.add(word);
				}
		}
		return res;
	}
	
	
}
