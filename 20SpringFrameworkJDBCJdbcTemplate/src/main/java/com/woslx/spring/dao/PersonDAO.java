package com.woslx.spring.dao;

import com.woslx.spring.vo.Person;

import java.util.List;

/**
 * Created by hy on 16-5-29.
 */
public interface PersonDAO {
    public void insert(Person person);
    public int insertReturnId(Person person);
    public Person selectById(int id);
    public String selectPersonName(int id);
    public List<Person> select();
    public void batchUpdate(final List<Person> persons);
    public int count();
}
