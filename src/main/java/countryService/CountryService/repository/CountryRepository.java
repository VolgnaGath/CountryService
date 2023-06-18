package countryService.CountryService.repository;

import countryService.CountryService.domain.entity.CountryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface CountryRepository extends CrudRepository<CountryEntity, UUID> {
    CountryEntity findByCode(String code);
    List<CountryEntity> findAll();
}
