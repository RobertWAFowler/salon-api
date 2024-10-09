package com.zenhog.salonapi.restcontroller;

import com.zenhog.salonapi.entity.SalonServiceDetail;
import com.zenhog.salonapi.repository.SalonServiceDetailRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/services/retrieveAvailableSalonServices",
        produces="application/json")
@CrossOrigin(origins="*")
public class RetrieveAvailableSalonServicesAPI {

    private final SalonServiceDetailRepository salonServiceDetailRepository;

    public RetrieveAvailableSalonServicesAPI(SalonServiceDetailRepository salonServiceDetailRepository) {
        this.salonServiceDetailRepository = salonServiceDetailRepository;
    }

    @GetMapping()
    public Iterable<SalonServiceDetail> getAvailableSalonServices() {
        return salonServiceDetailRepository.findAll();
    }
}
