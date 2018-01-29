package com.katliwap.netfloristbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.katliwap.netfloristbackend.dao.CategoryDAO;
import com.katliwap.netfloristbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		category.setId(1);
		category.setName("Television");
		category.setDescription("asdasd");
		category.setImageURL("image1");

		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Television");
		category.setDescription("asdasd");
		category.setImageURL("image1");
		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Television");
		category.setDescription("asdasd");
		category.setImageURL("image1");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
