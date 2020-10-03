package com.kgc.service;


import com.kgc.pojo.Person;

import java.util.List;

/**
 * @author shkstart
 */
public interface IndexService {
    List<Person> selall();
    int add(Person person);
}
