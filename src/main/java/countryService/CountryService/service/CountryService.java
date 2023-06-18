package countryService.CountryService.service;

import countryService.CountryService.domain.Country;
import countryService.CountryService.domain.entity.CountryEntity;
import countryService.CountryService.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService implements ICountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country getCountry() {
        return Country.fromCountryEntity(countryRepository.findByCode("RUS"));
    }

    @Override
    public List<Country> getAllCountries() {
        List<CountryEntity> countryList = countryRepository.findAll();
        List<Country> countries = new ArrayList<>();
        for (CountryEntity countryEntity : countryList) {
            countries.add(Country.fromCountryEntity(countryEntity));
        }
        return countries;
    }
}
