package com.dailycodework.dreamshops.service.category;

import com.dailycodework.dreamshops.model.Category;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category udpateCategory(Category category, Long id);
    void deleteCategoryById(Long id);
}
