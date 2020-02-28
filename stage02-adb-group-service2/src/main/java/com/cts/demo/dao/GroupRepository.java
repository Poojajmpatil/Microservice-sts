package com.cts.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.demo.Entity.GroupEntity;



@Repository
public interface GroupRepository extends JpaRepository<GroupEntity,String> {

}
//not using service here directly controller communicates with dao as it is an example