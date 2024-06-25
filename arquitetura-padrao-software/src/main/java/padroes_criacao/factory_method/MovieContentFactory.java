package padroes_criacao.factory_method;

public class MovieContentFactory {

    public static IMovieContent getContent(String content) {
        Class cls = null;
        Object object = null;
        try {
            cls = Class.forName("padroes_criacao.factory_method." + content);
            object = cls.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("nonexistent content");
        }

        return (IMovieContent) object;
    }

}
