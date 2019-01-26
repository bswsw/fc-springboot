package com.baegood.fcspringboot.repositories;

import com.baegood.fcspringboot.domains.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void findAll_test() throws Exception {

        for (Employee employee : employeeRepository.findAll()) {

            System.out.println(employee.getName());
        }
    }

    @Test
    public void findAllFetched_test() throws Exception {
        for (Employee employee : employeeRepository.findAllFetched()) {
            System.out.println(employee.getName());
        }

    }

    @Test
    public void findById_test() throws Exception {
        Employee employee = employeeRepository.findById(7654L).orElseThrow(Exception::new);
    }
}
