package com.github.ymiani.citesapi.countries.repository;

import com.github.ymiani.citesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
