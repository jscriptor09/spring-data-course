package com.ge.lcre;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;

import java.text.ParseException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ParseException {
//Java
//		try(AnnotationConfigApplicationContext context
//					= new AnnotationConfigApplicationContext(DataConfiguration.class)) {
//			BookService service = context.getBean(BookService.class);
//			Book book = new Book("First Book", new Date(), 33, new BigDecimal("26.00"));
//			service.save(book);
//		}
// 		    BookService service = context.getBean(BookService.class);
//			Book book = new Book("First Book", new Date(), 33, new BigDecimal("26.00"));
//			service.save(book);
//
//XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		BookRepository repository = context.getBean(BookRepository.class);

//		//Find a book
//		Book book = repository.findOne(1L);
//		System.out.println(book);
//		//find ALL
//		List<Book> books = repository.findAll();
//		for(Book bk : books){
//			System.out.println(bk);
//		}
//
//		//find selected id
//		List<Book> bks = repository.findAll(new ArrayList<Long>(){{
//			add(1L);
//			add(3L);
//			add(7L);
//		}});
//		for(Book bk : bks){
//			System.out.println(bk);
//		}
//
//		//add a new book
//		Book aBook = new Book();
//		aBook.setTitle("Title");
//		aBook.setPageCount(100);
//		aBook.setPrice(new BigDecimal("100.00"));
//		aBook.setPublishDate(new Date());
//
//		repository.save(aBook);
//		books = repository.findAll();
//		for(Book bk : books){
//			System.out.println(bk);
//		}
//		//
//		//Add a bunch of books
//		List<Book> bookss = BookUtil.create(5);
//		repository.save(bookss);
//		//
//		//Update a Book
//		book = repository.findOne(1L);
//		System.out.println(book);
//		book.setTitle("Ware and Peace");
//		repository.save(book);
//		book = repository.findOne(1L);
//		System.out.println(book);
//		//
//		//delete a book by id
//		repository.delete(8L);
//		books = repository.findAll();
//		for(Book bk : books){
//			System.out.println(bk);
//		}
//		//Delete book by entit
//		repository.delete(repository.findOne(7L));
//		books = repository.findAll();
//		for(Book bk : books){
//			System.out.println(bk);
//		}
//		//
//		//Delete a list of books
//		repository.delete(repository.findAll(new ArrayList<Long>(){{
//			add(5L);
//			add(3L);
//		}}));
//		books = repository.findAll();
//		for(Book bk : books){
//			System.out.println(bk);
//		}
//		//
//		//Delete in Batch, more efficient
//		repository.deleteInBatch(repository.findAll(new ArrayList<Long>(){{
//			add(10L);
//			add(11L);
//		}}));
//		books = repository.findAll();
//		for(Book bk : books){
//			System.out.println(bk);
//		}
//		//
//		//Delete all (all deleteInBatch ... more efficient)
//		repository.deleteAll();
//		books = repository.findAll();
//		for(Book bk : books){
//			System.out.println(bk);
//		}

		//Derived Qries
		//System.out.println(repository.findByTitle("War and Peace"));
		//
		//String Operators

//		for(Book b: repository.findByTitleLike("%of%")){
//			System.out.println(b);
//		}
//
//		for(Book b: repository.findByTitleContaining("%of%")){
//			System.out.println(b);
//		}
//
//		for(Book b: repository.findByTitleStartingWith("O%")){
//			System.out.println(b);
//		}
//
//		for(Book b: repository.findByTitleEndingWith("s")){
//			System.out.println(b);
//		}
//
//		for(Book b: repository.findByTitleIgnoreCase("ANIMAL FARM")){
//			System.out.println(b);
//		}

		//Relational Operators
//		for(Book b: repository.findByPageCountEquals(300)){
//			System.out.println(b);
// 		}
//		for(Book b: repository.findByPageCountLessThan(150)){
//			System.out.println(b);
//		}
//		for(Book b: repository.findByPageCountBetween(150, 220)){
//			System.out.println(b);
//		}
		//
		//Logical Operator
//		for(Book b: repository.findByTitleContainingAndPageCountGreaterThan("of", 125)){
//			System.out.println(b);
//		}
//		for(Book b: repository.findByTitleContainingOrTitleContaining("of", "and")){
//			System.out.println(b);
//		}
//		for(Book b: repository.findByTitleNot("Animal Farm")){
//			System.out.println(b);
//		}
		//
		//Date
//		Date date = new SimpleDateFormat("MM/dd/yyyy").parse("10/22/1995");
//		Date date2 = new SimpleDateFormat("MM/dd/yyyy").parse("10/22/1997");
// 		for(Book b: repository.findByPublishDateAfter(date)){
//			System.out.println(b);
//		}
//		for(Book b: repository.findByPublishDateBefore(date)){
//			System.out.println(b);
//		}
//		for(Book b: repository.findByPublishDateBetween(date, date2)){
//			System.out.println(b);
//		}
		//
		//Ordering Results
//		for(Book b: repository.findByTitleContainingOrderByTitleAsc("%a%")){
//			System.out.println(b);
//		}
//		for(Book b: repository.findByTitleContainingOrderByTitleDesc("%a%")){
//			System.out.println(b);
//		}
		//
		//Limit results
		//
		//Ordering Results
//		for(Book b: repository.findFirstByOrderByPageCountDesc()){
//			System.out.println(b);
//		}
//		for(Book b: repository.findTop5ByOrderByPriceDesc()){
//			System.out.println(b);
//		}
//		for(Book b: repository.findByTitleContainingOrderByTitleAsc("%a%")){
//			System.out.println(b);
//		}
//		for(Book b: repository.findByTitleContainingOrderByTitleAsc("Animal")){
//			System.out.println(b);
//		}

		//Traversing an entity
//		for(Book b: repository.queryOne()) {
//			System.out.println(b);
//		}
//		for(Book b: repository.queryTwo(200)){
//			System.out.println(b);
//		}
//
//		for(Book b: repository.queryThree("Animal Farm")){
//			System.out.println(b);
//		}

		//
		//Paging ... one way
		// (1st page ... 3 items per page)
		for(Book b: repository.findAll(new PageRequest(0,3))) {
			System.out.println(b);
		}
		//2nd page
		for(Book b: repository.findAll(new PageRequest(1,3))) {
			System.out.println(b);
		}
		//3rd page
		for(Book b: repository.findAll(new PageRequest(2,3))) {
			System.out.println(b);
		}
		//
		//Paging ... 2nd way.. add a method to the intergace with pagable
		// (1st page ... 3 items per page)
		for(Book b: repository.findAll(new PageRequest(0,3))) {
			System.out.println(b);
		}
		//2nd page
		for(Book b: repository.findAll(new PageRequest(1,3))) {
			System.out.println(b);
		}
		//3rd page
		for(Book b: repository.findAll(new PageRequest(2,3))) {
			System.out.println(b);
		}
		//
		//Pageing a 2nd way ... add paging to interface ... better way
		for(Book b: repository.findByPageCountGreaterThan(150,new PageRequest(1,3))) {
			System.out.println(b);
		}
		//
		//Sorting
		for(Book b: repository.findAll(new Sort(Sort.Direction.DESC,"pageCount"))) {
			System.out.println(b);
		}
		for(Book b: repository.findAll(new Sort(Sort.Direction.ASC,"author.lastName","pageCount"))) {
			System.out.println(b);
		}
		for(Book b: repository.findAll(new Sort(Sort.Direction.ASC,"author.lastName").and(new Sort(Sort.Direction.DESC,"pageCount")))) {
			System.out.println(b);
		}
		//
		//Sorting , 2nd way ... using Repo Signature
//		for(Book b: repository.findByPageCountGreaterThan(220,new Sort(Sort.Direction.ASC,"author.firstName"))) {
//			System.out.println(b);
//		}
		//
		//Paging
		//Page page = repository.findByPageCountGreaterThan(220, new Sort(Sort.Direction.DESC,"pageCount"), new PageRequest(1,3));
		Slice slice = repository.findByPageCountGreaterThan(220, new Sort(Sort.Direction.DESC,"pageCount"), new PageRequest(1,3));
		//slice.hasNext()   /// use to iterate
		for(Book b: repository.findByPageCountGreaterThan(220, new PageRequest(1,3))) {
			System.out.println(b);
		}
	}
}
