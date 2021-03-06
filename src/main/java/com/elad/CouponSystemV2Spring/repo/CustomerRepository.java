package com.elad.CouponSystemV2Spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elad.CouponSystemV2Spring.beans.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	  Customer findByEmail(String email);

	    Customer findById(int id);

	    boolean existsByEmailAndPassword(String email, String password);
}
