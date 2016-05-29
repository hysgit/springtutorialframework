package com.woslx.spring.dao.impl;

import com.woslx.spring.dao.PersonDAO;
import com.woslx.spring.vo.Person;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by hy on 16-5-29.
 */
public class JdbcTemplatePersonDAO implements PersonDAO{
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void insert(Person person) {
        jdbcTemplate.update(
                "INSERT INTO spring.person (id ,name) VALUES (NULL , ?)",
                person.getName());
        System.out.println("insert("+person+")");
    }
    @Override
    public int insertReturnId(final Person person){
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
                new PreparedStatementCreator()  {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps =
                                connection.prepareStatement("INSERT INTO spring.person (id ,name) VALUES (NULL , ?)", new String[] {"id"});
                        ps.setString(1, person.getName());
                        return ps;
                    }
                },
                keyHolder);
        System.out.println("insert("+person+") --> id: "+keyHolder.getKey().intValue());
        return keyHolder.getKey().intValue();

    }

    @Override
    public Person selectById(int id){
        Person person = this.jdbcTemplate.queryForObject("SELECT * FROM spring.person WHERE id = ?",
                new Object[]{id},
                new RowMapper<Person>(){
                    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Person person = new Person();
                        person.setId(Integer.parseInt(rs.getString("id")));
                        person.setName(rs.getString("name"));
                        return person;
                    }
                }
        );
        System.out.println("selectById("+id+") --> "+person);
        return person;
    }
    @Override
    public String selectPersonName(int id){
        String name = this.jdbcTemplate.queryForObject(
                "SELECT name FROM spring.person WHERE id = ?",
                new Object[]{id}, String.class);
        System.out.println("selectPersonName("+id+") --> name: "+name);
        return name;
    }
    @Override
    public int count(){
        int rowCount = this.jdbcTemplate.queryForInt("select count(*) from spring.person");
        System.out.println("count() --> "+rowCount);
        return rowCount;
    }
    @Override
    public List<Person> select() {
        List<Person> persons = this.jdbcTemplate.query(
                "SELECT * FROM spring.person",
                new RowMapper<Person>() {
                    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Person person = new Person();
                        person.setId(Integer.parseInt(rs.getString("id")));
                        person.setName(rs.getString("name"));
                        return person;
                    }
                });
        System.out.println("select() --> "+persons);
        return persons;
    }
    @Override
    public void batchUpdate(final List<Person> persons){
        jdbcTemplate.batchUpdate("update spring.person set name = ? where id = ?",
                new BatchPreparedStatementSetter() {
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, persons.get(i).getName());
                        ps.setInt(2, persons.get(i).getId());
                    }
                    public int getBatchSize() {
                        return persons.size();
                    }
                });
        System.out.println("batchUpdate("+persons+")");
    }
}
