package com.cts.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.demo.Entity.ContactEntity;
@Repository
public interface ContactRepository extends JpaRepository<ContactEntity,String> {

}
