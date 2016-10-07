package com.ge.lcre;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Mark on 10/2/2016.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    //
    //Derived Queries  .... findBy and Title.
    //JPA will auto understand that this is a qry to finad a book by title
    //bo further SQL is required.
    public Book findByTitle(String title);

    //by string
    public List<Book> findByTitleLike(String title);
    public List<Book> findByTitleContaining(String title);
    public List<Book> findByTitleStartingWith(String title);
    public List<Book> findByTitleEndingWith(String title);
    public List<Book> findByTitleIgnoreCase(String title);

    //Relational Operators
    public List<Book> findByPageCountEquals(int pageCount);
    public List<Book> findByPageCountGreaterThan(int pageCount);
    public List<Book> findByPageCountGreaterThanEqual(int pageCount);
    public List<Book> findByPageCountLessThan(int pageCount);
    public List<Book> findByPageCountLessThanEqual(int pageCount);
    public List<Book> findByPageCountBetween(int min, int max);
    //
    //Logical Operator
    public List<Book> findByTitleContainingOrTitleContaining(String title, String title2);
    public List<Book> findByTitleContainingAndPageCountGreaterThan(String title, int PageCount);
    public List<Book> findByTitleNot(String title);
    //
    //Date Comparison
    public List<Book> findByPublishDateAfter(Date date);
    public List<Book> findByPublishDateBefore(Date date);
    public List<Book> findByPublishDateBetween(Date date, Date date2);
    //
    //Ordering Results
    public List<Book> findByTitleContainingOrderByTitleAsc(String title);
    public List<Book> findByTitleContainingOrderByTitleDesc(String title);

    public List<Book> findTopByOrderByPageCountAsc(); // same as First
    public List<Book> findFirstByOrderByPageCountDesc();

    public List<Book> findTop5ByOrderByPriceDesc();
    public List<Book> findTop5ByTitleOrderByPriceAsc(String title);

    //
    //Traversin Nested Properties
    public List<Book> findByAuthorFirstName(String firstName);
    public List<Book> findByAuthor_Country(String country); // the _ tells Spring Data to look at author field in Book first and the traverse to County
    public List<Book> findByAuthor_CountryContaining(String country); // the _ tells Spring Data to look at author field in Book first and the traverse to County
    //
    //JPQL
    //@Query("select b from Book b")  // made named query ... don't use this approach
    public List<Book> queryOne();

    //@Query("Select b from Book b where b.pageCount > ?1")  // made named query ... don't use this approach
    public List<Book> queryTwo(int pageCount);

    //@Query("Select b from Book b where b.title = :title")  // made named query ... don't use this approach
    public List<Book> queryThree(@Param("title") String title);
    //
    //Pageable
    public List<Book> findByPageCountGreaterThan(int pageCount, Pageable pageable);
}
