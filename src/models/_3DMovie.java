package models;

public class _3DMovie implements Movie {
    private String title;

    public _3DMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "3D";
    }
}
