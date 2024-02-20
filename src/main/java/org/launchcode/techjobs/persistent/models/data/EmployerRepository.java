package org.launchcode.techjobs.persistent.models.data;

import jakarta.validation.Valid;
import org.launchcode.techjobs.persistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;

@Repository
public interface EmployerRepository extends CrudRepository <Employer, Integer> {


}
