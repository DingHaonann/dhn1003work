package com.kgc.service.impl;

import com.kgc.mapper.PersonMapper;
import com.kgc.pojo.Person;
import com.kgc.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author shkstart
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    PersonMapper personMapper;

    @Override
    public List<Person> selall() {
        return personMapper.selectByExample(null);
    }

    @Override
    public int add(Person person) {
        return personMapper.insert(person);
    }
}
