package com.platform.service.impl;

import com.platform.dto.PhotographerDTO;
import com.platform.entity.Photographer;
import com.platform.mapper.PhotographerMapper;
import com.platform.service.PhotographerService;
import org.springframework.beans.factory.annotation.Autowired;

public class PhotographerServiceImpl implements PhotographerService {

    @Autowired
    PhotographerMapper photographerMapper;

    @Override
    public Photographer photographerLogin(PhotographerDTO photographerDTO) {
        String account = photographerDTO.getAccount();
        String password = photographerDTO.getPassword();

        Photographer photographer = photographerMapper.getByAccount(account);

        if(photographer == null){
//            throw new Exception("\"账号不存在\"");
        }

        // 验证密码
        if(!password.equals(photographer.getPassword())){

        }

        return photographer;

    }
}
