package com.quan.demo.service.impl;

import com.quan.demo.models.Render;
import com.quan.demo.repository.RenderRepository;
import com.quan.demo.service.RenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RenderServiceImpl implements RenderService {

    @Autowired
    private RenderRepository renderRepository;

    @Override
    public Iterable<Render> findAll() {
        return renderRepository.findAll();
    }

    @Override
    public Render getRender(Long id) {
        return renderRepository.findById(id).orElse(null);
    }
}
