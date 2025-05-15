package controller;

import java.util.ArrayList;
import java.util.List;

import models.User;
import models.UserModel;
import views.UserView;

public class UserController {
	
	private UserView vista;
	private List<User> usuarios = new ArrayList<>();
	
	public UserController() {
		
		vista = new UserView();
	}
	
	public void index() {
		
		UserModel um = new UserModel();
		
		usuarios = um.getAll();
		
		vista.index(usuarios);
		
	}

}