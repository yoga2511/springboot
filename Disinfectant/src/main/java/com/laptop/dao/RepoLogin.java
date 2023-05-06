package com.laptop.dao;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.model.ModelLogin;

	


	public interface RepoLogin extends JpaRepository<ModelLogin, Integer> {

		ModelLogin findByuname(String uname);
	}

