package dao;

import org.springframework.stereotype.Repository;

/**
 * Created by rustem on 12.02.18.
 */

@Repository
public class EmployeeRepository {
    public void saveEmployee() {
        System.out.println("NEW EMPLOYEE SAVED TO DB");
    }
}
