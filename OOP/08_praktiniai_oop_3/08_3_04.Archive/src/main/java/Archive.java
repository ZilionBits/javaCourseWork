import java.util.Objects;

public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Archive archive = (Archive) o;
        return Objects.equals(identifier, archive.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, name);
    }
}
