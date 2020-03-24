package com.br.jirehconfeccoes.distribution_company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DistributionCompanyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DistributionCompanyService.class);
    private final IDistributionCompanyRepository iDistributionCompanyRepository;

    @Autowired
    public DistributionCompanyService(IDistributionCompanyRepository iDistributionCompanyRepository) {
        this.iDistributionCompanyRepository = iDistributionCompanyRepository;
    }

    public DistributionCompanyDTO save(DistributionCompanyDTO distributionCompanyDTO) {
        LOGGER.info("Saving data inserted");

        this.validate(distributionCompanyDTO);

        return DistributionCompanyDTO
                .withDTO(iDistributionCompanyRepository
                        .save(DistributionCompany
                                .withoutDTO(distributionCompanyDTO)));
    }

    private void validate(DistributionCompanyDTO distributionCompanyDTO) {
        LOGGER.info("validating inserted items");

        if (distributionCompanyDTO.getId() == null){
            validateforSave();
        }else {
            validateforUpdate();
        }
    }

    private void validateforUpdate() {
    }

    private void validateforSave() {
    }

    public DistributionCompanyDTO update(Long id, DistributionCompanyDTO distributionCompanyDTO) {
        LOGGER.info("Updating data inserted");

        this.validate(distributionCompanyDTO);

        Optional<DistributionCompany> distributionCompanyOptional = iDistributionCompanyRepository.findById(id);

        if (distributionCompanyOptional.isPresent()) {

            return DistributionCompanyDTO.withDTO(distributionCompanyOptional
                    .map(distributionCompany -> iDistributionCompanyRepository
                            .save(DistributionCompany
                                    .withoutDTO(distributionCompanyDTO)))
                    .get());
        }
        throw new IllegalArgumentException("This Distribution Company not found");
    }
}
