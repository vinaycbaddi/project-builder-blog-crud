package service;

import java.io.IOException;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hamcrest.core.IsEqual;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>();
	
	
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		list.add(blog);
		list.sort((m1,m2)->m1.getBlogTitle().compareTo(m2.getBlogTitle()));
		list.stream().forEach(a->a.getBlogTitle());
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
		list.add(blog);
		return list;
	
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		list.remove(blog);
		return null;
		
	}
	
	
}
