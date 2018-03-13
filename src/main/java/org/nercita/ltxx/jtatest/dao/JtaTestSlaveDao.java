package org.nercita.ltxx.jtatest.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class JtaTestSlaveDao{  
  
    @Resource(name="slaveJdbcTemplate")
    JdbcTemplate slaveJdbcTemplate;
     
      
    public String slave() {  
        slaveJdbcTemplate.execute("update student set name='slave' where id=1");              
        return "success";  
    }     
  
}  