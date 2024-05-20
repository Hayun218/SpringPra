package com.practice.myspring.service.impl;

import com.practice.myspring.domain.TbUser;
import com.practice.myspring.repository.TbUserRepository;
import com.practice.myspring.service.TbUserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TbUserServiceImpl implements TbUserService {

    private final TbUserRepository tbUserRepository;

    public TbUserServiceImpl(
            TbUserRepository tbUserRepository
    ) {
        this.tbUserRepository = tbUserRepository;
    }

    public Map<String, Object> create(Map<String, Object> param) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        System.out.println(param);
        TbUser tbUser = TbUser.of(param.get("username") + "", param.get("password") + "");
        tbUserRepository.save(tbUser);
        returnMap.put("id", tbUser.getId());
        return null;
    }

    public Map<String, Object> update(Map<String, Object> param) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        System.out.println(param);
        TbUser tbUser = tbUserRepository.findById(param.get("id") + "").orElseThrow(() -> new RuntimeException(""));
        if(param.get("name") != null) {
            tbUser.setName(param.get("name") + "");
        }
        if(param.get("nick") != null) {
            tbUser.setName(param.get("nick") + "");
        }
        if(param.get("birth") != null) {
            tbUser.setName(param.get("birth") + "");
        }
        if(param.get("phone") != null) {
            tbUser.setName(param.get("phone") + "");
        }

        tbUserRepository.save(tbUser);
        returnMap.put("id", tbUser.getId());
        return returnMap;
    }

    public Map<String, Object> get(String id) {
        Map<String , Object> returnMap = new HashMap<String, Object>();
        System.out.println(id);
        TbUser tbUser = tbUserRepository.findById(id).orElseThrow(() -> new RuntimeException(""));

        returnMap.put("id", tbUser.getId());
        returnMap.put("username", tbUser.getUsername());
        returnMap.put("name", tbUser.getName());
        returnMap.put("nick", tbUser.getNick());
        returnMap.put("birth", tbUser.getBirth());
        returnMap.put("phone", tbUser.getPhone());

        return returnMap;
    }
}
