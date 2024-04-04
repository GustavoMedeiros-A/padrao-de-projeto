package padroes_estruturais.facede;

public class Video extends MovieSector {

    private static Video video;

    private Video() {
    }

    public static Video getInstance() {
        if (video == null) {
            video = new Video();
        }
        return video;
    }
}
