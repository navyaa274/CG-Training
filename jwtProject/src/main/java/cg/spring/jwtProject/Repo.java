package cg.spring.jwtProject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Customer, Integer> {
    Customer findByUsername(String username);
    boolean existsByUsername(String username);
    Customer findByAccountNo(String accNo);
}
