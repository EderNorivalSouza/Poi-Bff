package com.br.xy.inc.bff.controller;

import model.PoiFilterDto;
import model.PoiFormDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class BffController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/pois")
    public ResponseEntity listAllPois(){
        ResponseEntity resultAll = restTemplate.getForEntity("http://localhost:8080/pois", String.class);
        return resultAll;
    }
    @GetMapping("/pois/id")
    public ResponseEntity searchPoiForId(@RequestParam Long id){
        ResponseEntity resultPoi = restTemplate.getForEntity("http://localhost:8080/pois/id?id="+id, String.class);
        return resultPoi;
    }

    @PostMapping("/filter")
    public ResponseEntity listFilteredPois(@RequestBody PoiFilterDto form){
        restTemplate = new RestTemplate();
        ResponseEntity resultFilter = restTemplate.postForEntity("http://localhost:8080/pois/filter",form, String.class);
        return resultFilter;
    }
    @PostMapping("/adding")
    public ResponseEntity addPoi(@RequestBody PoiFormDto form){
        restTemplate = new RestTemplate();
//        UriComponentsBuilder uriComponentsBuilder;
//        ObjectMapper objectMapper = new ObjectMapper();
        ResponseEntity response = restTemplate.postForEntity("http://localhost:8080/pois",form, String.class);
//        Poi poi = objectMapper.readValue(response.toString(),Poi.class);
//        URI uri = uriComponentsBuilder.path("/added/{id}").buildAndExpand(poi.getId()).toUri();
        return response;
    }
}
