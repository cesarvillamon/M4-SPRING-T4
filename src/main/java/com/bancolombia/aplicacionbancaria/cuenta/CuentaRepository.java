package com.bancolombia.aplicacionbancaria.cuenta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, String> {
}
