package countryService.CountryService.service;

import countryService.CountryService.domain.Country;

import java.util.List;

public interface ICountryService {
    Country getCountry();
    List<Country> getAllCountries();
}
