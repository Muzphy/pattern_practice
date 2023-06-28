package flyweight.chess;

public enum Color {
    BLACK("黑色"),WHITE("白色");

    private String alias;

    Color(String alias) {
        this.alias= alias;
    }

    public String getAlias() {
        return alias;
    }
}
