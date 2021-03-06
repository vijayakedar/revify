package com.revify.service;

import com.revify.dto.CategoryDTO;
import com.revify.entity.Category;

import java.util.List;

/**
 * Created by jchengottusseriy on 3/11/2015.
 */
public interface CategoryService {

    public List<CategoryDTO> findAllCategories();

    public Long getCategoryID(String categoryName);
}
