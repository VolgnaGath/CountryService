package countryService.CountryService.controller;

import countryService.CountryService.domain.Country;
import countryService.CountryService.service.CountryService;
import countryService.CountryService.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/internal")
public class MainController {
    private final ICountryService cs;
    @Autowired
    public MainController(ICountryService cs) {
        this.cs = cs;
    }

    @GetMapping("/country")
    public Country getCountry() {
        return cs.getCountry();
    }

    @GetMapping("/all")
    public List<Country> countryList() {
        return cs.getAllCountries();
    }
}
