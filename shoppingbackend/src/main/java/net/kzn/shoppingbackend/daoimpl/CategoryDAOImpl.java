package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList<>();
	
	static
	{
		Category category=new Category();
		category.setId(1);
		category.setDescription("This is Something about Television");
		category.setName("Television");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		 category=new Category();
			category.setId(2);
			category.setDescription("This is Something about Mobile");
			category.setName("Mobile");
			category.setImageURL("CAT_2.png");
			categories.add(category);
			
			 category=new Category();
				category.setId(3);
				category.setDescription("This is Something about Laptop");
				category.setName("Laptop");
				category.setImageURL("CAT_3.png");
				categories.add(category);	
		
		
	}
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
			for (Category category : categories) {
				if(category.getId()==id)
				{
					return category;
				}
	      	}
		return null;
	}

}
