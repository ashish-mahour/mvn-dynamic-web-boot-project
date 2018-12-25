package com.mdwbp.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mdwbp.dao.UsersDAO;
import com.mdwbp.dtos.User;
import com.mdwbp.entity.Users;
@Component
@RestController
public class BaseController {

	Logger log = Logger.getLogger(BaseController.class.getName());

	@Autowired
	private UsersDAO userserv;

	@RequestMapping(value = "/homepage")
	public String getHomePage() {
		return "homepage";
	}

	@RequestMapping(value = "/storeData", method = RequestMethod.POST)
	public String storeData(HttpServletRequest request) {
		String name = request.getParameter("fname");
		try {
			Part p = request.getPart("file1");
			InputStream inputStream = p.getInputStream();
			FileOutputStream fileOutputStream = new FileOutputStream("D:/MyFile/" + p.getSubmittedFileName());
			int data;
			while ((data = inputStream.read()) != -1) {
				fileOutputStream.write(data);
			}
			fileOutputStream.flush();
			fileOutputStream.close();

		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
		log.info("Api Hit");
		log.info("This is name : " + name);
		userserv.saveUser(new Users(0, name));
		return "redirect:homepage";
	}

	@RequestMapping(value="/api/getdata",method=RequestMethod.POST)
	public ResponseEntity<?> getData(@RequestBody String data) {
		try {
			JSONObject json = new JSONObject(data);
			log.info(json.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>(new String("Success"),HttpStatus.OK);
	}
}
