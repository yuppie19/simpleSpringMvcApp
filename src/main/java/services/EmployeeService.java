package services;

import dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by rustem on 12.02.18.
 */

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void createNewEmployee() {
        System.out.println("NEW EMPLOYEE WAS CREATED");
        employeeRepository.saveEmployee();
    }

}
