package countryService.CountryService.domain;

import countryService.CountryService.domain.entity.CountryEntity;

import java.util.UUID;

public class Country {
    private UUID id;
    private String code;
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setCountryName(String countryName) {
        this.name = countryName;
    }
    public static Country fromCountryEntity(CountryEntity ce) {
        Country country = new Country();
        country.setId(ce.getId());
        country.setCode(ce.getCode());
        country.setCountryName(ce.getName());
        return country;
    }
}
