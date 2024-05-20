package com.practice.myspring.repository;

import com.practice.myspring.domain.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbUserRepository extends JpaRepository<TbUser, String> {

}
