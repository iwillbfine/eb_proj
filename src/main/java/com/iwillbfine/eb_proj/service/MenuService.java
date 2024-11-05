package com.iwillbfine.eb_proj.service;

import com.iwillbfine.eb_proj.dto.MenuDTO;
import com.iwillbfine.eb_proj.entity.Menu;
import com.iwillbfine.eb_proj.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final MenuRepository menuRepository;
    private final ModelMapper mapper;

    @Autowired
    public MenuService(MenuRepository menuRepository, ModelMapper mapper) {
        this.menuRepository = menuRepository;
        this.mapper = mapper;
    }

    public MenuDTO findMenuByMenuCode(int menuCode) {
        Menu selectedMenu = menuRepository.findById(menuCode)
                .orElseThrow(IllegalArgumentException::new);
        return mapper.map(selectedMenu, MenuDTO.class);
    }
}
