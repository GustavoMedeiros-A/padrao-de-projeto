package padroes_estruturais.facede;

public class Sound extends MovieSector {

    private static Sound sound;

    private Sound() {
    }

    public static Sound getInstance() {
        if (sound == null) {
            sound = new Sound();
        }
        return sound;
    }

}
