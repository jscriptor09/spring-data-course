package com.ge.lcre;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

/**
 * Created by Mark on 10/3/2016.
 */
@NoRepositoryBean
public interface ReadOnlyRepository <T,ID extends Serializable> extends Repository<T, ID> {
    T findOne(ID id);
    Iterable<T> findAll();
}
