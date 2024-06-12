package padroes_comportamentais.template_method;

public class Adventure extends Game {

    @Override
    String loadingGame() {
        return "Loading adventure storyline and characters...";
    }

}
