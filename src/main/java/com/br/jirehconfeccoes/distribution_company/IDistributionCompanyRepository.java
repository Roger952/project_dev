package com.br.jirehconfeccoes.distribution_company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDistributionCompanyRepository extends JpaRepository<DistributionCompany, Long> {
}
