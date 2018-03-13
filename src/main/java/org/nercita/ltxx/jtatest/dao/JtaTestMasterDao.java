package org.nercita.ltxx.jtatest.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class JtaTestMasterDao{  
  
    @Resource(name="masterJdbcTemplate")
    JdbcTemplate masterJdbcTemplate;
  
    public String master() {  
        masterJdbcTemplate.execute("update teacher set name='master' where id=1");  
        return "success";  
    }  
  
    public void update() {  
        masterJdbcTemplate.execute("update teacher set name='8' where id=1");  
        System.out.println("update");  
        masterJdbcTemplate.execute("fff teacher set name=''6' where id=1");
    }  
  
}  