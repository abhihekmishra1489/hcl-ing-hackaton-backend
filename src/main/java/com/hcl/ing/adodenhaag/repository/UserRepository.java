package com.hcl.ing.adodenhaag.repository;

import com.hcl.ing.adodenhaag.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
