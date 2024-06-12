package padroes_comportamentais.template_method;

public class Soccer extends Game {

    @Override
    String loadingGame() {
        return "Setting up soccer field and teams...";
    }

}
