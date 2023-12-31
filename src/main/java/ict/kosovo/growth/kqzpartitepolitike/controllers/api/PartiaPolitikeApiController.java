package ict.kosovo.growth.kqzpartitepolitike.controllers.api;

import ict.kosovo.growth.kqzpartitepolitike.models.entities.PartiaPolitike;
import ict.kosovo.growth.kqzpartitepolitike.services.PartiaPolitikeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:9090/api/partitepolitike
@RequestMapping(value = "api/partitepolitike")
public class PartiaPolitikeApiController extends AbstractApiController<PartiaPolitike,String> {
   // private final PartiaPolitikeService service;

    public PartiaPolitikeApiController(PartiaPolitikeService service) {
       // this.service = service;
        super(service);
    }
 /*   //GET http://localhost:9090/api/partitepolitike
    @GetMapping(value = "")
    public List<PartiaPolitike> getAll(){
        return service.getAll();
    }
    //GET http://localhost:9090/api/partitepolitike/pnk
    @GetMapping(value = "/{id}")
    public PartiaPolitike getById(@PathVariable String id) {
        return service.getById(id);
    }
    @PostMapping("")
    //POST http://localhost:9090/api/partitepolitike
    public boolean post(@RequestBody PartiaPolitike partiaPolitike) {
        return service.add(partiaPolitike);
    }
    //PUT http://localhost:9090/api/partitepolitike/pnk
    @PutMapping(value = "/{id}")
    public boolean put(@PathVariable String id,@RequestBody PartiaPolitike partiaPolitike) {
        if (!id.equals(partiaPolitike.getId())) return false;
        return service.modify(partiaPolitike);
    }
    //DELETE http://localhost:9090/api/partitepolitike/pnk
    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable String id) {
        return service.remove(id);
    } */
}
