package com.quan.demo.service;

import com.quan.demo.models.Render;
import com.quan.demo.models.TypeProduct;

public interface RenderService {
    Iterable<Render> findAll();

    Render getRender(Long id);
}
