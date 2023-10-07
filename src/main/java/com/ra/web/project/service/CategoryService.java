package com.ra.web.project.service;

import com.ra.web.project.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> fillAll();
    Category finId(String id);
    void add(Category ca);
    void edit(Category ca);
    Category delete(String id);
}
