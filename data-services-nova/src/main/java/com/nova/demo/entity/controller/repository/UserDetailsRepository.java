package com.nova.demo.entity.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nova.demo.entity.UserDetails;

public interface UserDetailsRepository  extends JpaRepository <UserDetails,Long>
{
	
}