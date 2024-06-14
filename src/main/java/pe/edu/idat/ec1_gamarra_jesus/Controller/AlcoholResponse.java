package pe.edu.idat.ec1_gamarra_jesus.Controller;

public class AlcoholResponse {
    private boolean positive;

    public AlcoholResponse(boolean positive) {
        this.positive = positive;
    }

    public boolean isPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }
}
