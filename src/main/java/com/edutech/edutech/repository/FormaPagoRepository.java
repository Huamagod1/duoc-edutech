package com.edutech.edutech.repository;

import com.edutech.edutech.model.FormaPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagoRepository extends JpaRepository<FormaPago, Integer> {
}
