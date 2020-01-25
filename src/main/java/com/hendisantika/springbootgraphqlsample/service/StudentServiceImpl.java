package com.hendisantika.springbootgraphqlsample.service;

import com.hendisantika.springbootgraphqlsample.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/01/20
 * Time: 06.16
 */
@Service
public class StudentServiceImpl implements StudentService {
    private Map<String, Student> map = new HashMap<>();

    @Override
    public Student getStudentDetailsByName(String name) {
        return null != name ? map.get(name) : null;
    }
}
