package hello;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by vlad on 22.07.16.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
}
