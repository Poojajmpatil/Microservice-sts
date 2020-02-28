package com.cts.adb.dao;

import com.cts.adb.entity.ContactEntity;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntity,Long>{

}
