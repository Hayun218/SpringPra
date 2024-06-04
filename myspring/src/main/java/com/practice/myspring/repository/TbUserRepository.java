package com.practice.myspring.repository;

import com.practice.myspring.domain.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// <TbUser, String> => String: ID 타입
@Repository
public interface TbUserRepository extends JpaRepository<TbUser, String> {

}
