package ict.kosovo.growth.kqzpartitepolitike.controllers.api;

import ict.kosovo.growth.kqzpartitepolitike.models.entities.Aktivitet;
import ict.kosovo.growth.kqzpartitepolitike.services.AbstractService;
import ict.kosovo.growth.kqzpartitepolitike.services.AktivitiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/aktivitetet")
public class AktivitetiApiController extends AbstractApiController<Aktivitet,Integer> {

    public AktivitetiApiController(AktivitiService service) {
        super(service);
    }
}
