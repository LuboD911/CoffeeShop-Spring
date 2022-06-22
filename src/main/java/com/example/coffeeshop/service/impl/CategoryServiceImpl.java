package com.example.coffeeshop.service;

import com.example.coffeeshop.model.entity.CategoryEntity;
import com.example.coffeeshop.model.enumeration.CategoryEnum;
import com.example.coffeeshop.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initCategories() {
        if(categoryRepository.count() != 0){
            return;
        }

        Arrays.stream(CategoryEnum.values())
                .forEach(categoryEnum -> {
                    CategoryEntity category = new CategoryEntity();
                    category.setName(categoryEnum);
                    switch (categoryEnum){
                        case Cake -> category.setNeededTime(10);
                        case Drink -> category.setNeededTime(1);
                        case Coffee -> category.setNeededTime(2);
                        case Other -> category.setNeededTime(5);
                    }
                    categoryRepository.save(category);
                });

    }
}
