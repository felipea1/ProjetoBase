package br.com.projeto.controller;

import br.com.projeto.model.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExecutarController {
	
	@GetMapping("/primeiro")
	public List<String> primeiro(){
		// Array of strings
		String[] strArray = {"Delhi", "Mumbai", "Kolkata", "Chennai"};
		// Initialize an immutable list from array using asList method
		List<String> myList = Arrays.asList(strArray);
		// Print the list
		return myList;
	}
	@GetMapping("/segundo")
	public List<String> segundo(){
		
		List<String> list=new ArrayList<String>();
		//Adding elements in the list
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		return list;
	}
	@GetMapping("/terceiro")
	public List<Book> terceiro(){
		// Creating list of Books
		List<Book> list=new ArrayList<Book>();
		// Creating books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data communications and Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103, "Operating System","Galvin","Wiley",6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		return list;
	}
	
}
