package com.platform.service;

import com.platform.dto.PhotographerDTO;
import com.platform.entity.Photographer;

public interface PhotographerService {
    Photographer photographerLogin(PhotographerDTO photographerDTO);

}
