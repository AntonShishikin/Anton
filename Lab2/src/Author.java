public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'M' || gender == 'F' || gender == 'U') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid gender. It must be 'M', 'F', or 'U'.");
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return String.format("%s(%s) at %s", name, gender == 'M' ? "m" : gender == 'F' ? "ms" : "", email);
    }
}

