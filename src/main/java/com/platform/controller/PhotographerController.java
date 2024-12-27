package com.platform.controller;

import com.platform.dto.PhotographerDTO;
import com.platform.entity.Photographer;
import com.platform.result.Result;
import com.platform.service.PhotographerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "摄影师相关")
@RestController
@RequestMapping("/photographer")
@Slf4j
public class PhotographerController {
    @Autowired
    private PhotographerService photographerService;

    @PostMapping("/login")
    @ApiOperation("摄影师登录")
    public Result<Photographer> login(@RequestBody PhotographerDTO photographerDTO) {
        log.info("");
        Photographer photographer = photographerService.photographerLogin(photographerDTO);

        // 登录成功 生成jwt用于下次登录


        return Result.success(photographer);

    }
}
