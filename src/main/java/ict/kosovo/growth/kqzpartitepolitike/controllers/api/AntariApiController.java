package ict.kosovo.growth.kqzpartitepolitike.controllers.api;
import ict.kosovo.growth.kqzpartitepolitike.models.entities.Antari;
import ict.kosovo.growth.kqzpartitepolitike.services.AntariService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/antaret")
public class AntariApiController extends AbstractApiController<Antari,Integer> {
    public AntariApiController(AntariService service) {
        super(service);
    }

}
