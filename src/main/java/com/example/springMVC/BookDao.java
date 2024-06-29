package com.example.springMVC;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BookDao {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public int insert (Map<String, Object>map) {
        return this.sqlSessionTemplate.insert("book.insert", map);
    }

    public Map<String, Object> selectDetail(Map<String, Object> map) {
        //return this.sqlSessionTemplate.selectOne("book.select_detail", map);
        Map<String, Object> result = this.sqlSessionTemplate.selectOne("book.select_detail", map);

        System.out.println("SQL query result : " + result);

        return result;
    }

    public int update (Map<String, Object> map) {
        int result = this.sqlSessionTemplate.update("book.update", map);

        System.out.println("SQL query result : " + result);
        return result;
    }

    public int delete(Map<String, Object> map) {
        int result = this.sqlSessionTemplate.delete("book.delete", map);
        System.out.println("SQL query result : " + result);
        return result;
    }

    public List<Map<String, Object>> selectList(Map<String, Object> map) {
        return this.sqlSessionTemplate.selectList("book.select_list", map);
    }
}
