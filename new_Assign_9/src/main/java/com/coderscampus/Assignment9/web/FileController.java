package com.coderscampus.Assignment9.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment9.repository.Recipe;
import com.coderscampus.Assignment9.service.FileService;

@RestController
public class FileController {

	//Create endpoints inside of a RestController that will filter data
	
		@Autowired
		private ApplicationContext appContext;
		
		@Autowired
		private FileService fileService;
		
		@GetMapping("")
		public List<Recipe> loadRecipes() throws IOException  {
			FileService fileService = appContext.getBean(FileService.class);
			return fileService.readFile("recipes.txt");
		}
		
		// these below will be calling methods that filters for each category from the file service
		
		//The gluten-free endpoint will only return a subset of the full Collection of glutenFree recipes
		@GetMapping("/gluten-free") 
		public List<Recipe> glutenFree() throws IOException {
			FileService fileService = appContext.getBean(FileService.class);
			fileService.glutenFree().forEach(System.out::println);
			return fileService.glutenFree();
		}
		
		//The vegan endpoint will only return a subset of the full Collection of vegan recipes
		@GetMapping("/vegan") 
		public List<Recipe> vegan() throws IOException {
			FileService fileService = appContext.getBean(FileService.class);
			fileService.vegan().forEach(System.out::println);
			return fileService.vegan();
		}
		
		//The vegan-and-gluten-free endpoint will only return a subset of the full Collection of glutenFree and vegan recipes
		@GetMapping("veganandglutenfree")
		public List<Recipe> veganAndGlutenFree() throws IOException {
			FileService fileService = appContext.getBean(FileService.class);
			fileService.veganAndGlutenFree().forEach(System.out::println);
			return fileService.veganAndGlutenFree();
		}
		
		//The vegetarian endpoint will only return a subset of the full Collection of vegetarian recipes
		@GetMapping("/vegetarian") 
		public List<Recipe> vegetarian() throws IOException {
			FileService fileService = appContext.getBean(FileService.class);
			fileService.vegetarian().forEach(System.out::println);
			return fileService.vegetarian();
		}
		
		//The all-recipes endpoint will not filter the data at all. 
		@GetMapping("/all-recipes") 
		public List<Recipe> allRecipes() throws IOException  {
			FileService fileService = appContext.getBean(FileService.class);
			fileService.allRecipes().forEach(System.out::println);
			return fileService.allRecipes();
		}
	
}
