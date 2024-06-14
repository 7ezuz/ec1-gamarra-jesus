package pe.edu.idat.ec1_gamarra_jesus.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlcoholController {

    @PostMapping("/verificarAlcoholemia")
    public AlcoholResponse verificarAlcoholemia(@RequestBody AlcoholRequest request) {
        double limiteAlcohol = obtenerLimiteAlcohol(request.getVehicleType());
        boolean positivo = request.getAlcoholLevel() > limiteAlcohol;
        AlcoholResponse alcoholResponse = new AlcoholResponse(positivo);
        return alcoholResponse;
    }

    private double obtenerLimiteAlcohol(String tipoVehiculo) {
        switch (tipoVehiculo.toLowerCase()) {
            case "m":
                return 0.5;
            case "c":
                return 0.3;
            case "a":
                return 0.2;
            case "y":
                return 0.8;
            default:
                return 0.5;
        }
    }
}
