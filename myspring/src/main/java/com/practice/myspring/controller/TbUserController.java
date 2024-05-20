package com.practice.myspring.controller;

import com.practice.myspring.service.TbUserService;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RequestMapping("/api/tbuser")
@RestController
public class TbUserController {
    private final TbUserService tbUserService;

    public TbUserController(
            TbUserService tbUserService
    ) {
        this.tbUserService = tbUserService;
    }

    @PostMapping("")
    public Map<String, Object> create(@RequestBody Map<String, Object> param) {
        System.out.println(param);
        return tbUserService.create(param);
    }

    @PutMapping("")
    public Map<String, Object> update(@RequestBody Map<String, Object> param) {
        System.out.println(param);
        return tbUserService.update(param);
    }

    @GetMapping("get/{id}")
    public Map<String, Object> detail(@PathVariable("id") String id) {
        System.out.println(id);
        return tbUserService.get(id);
    }



}
