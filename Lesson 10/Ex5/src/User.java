public class User {
    private String firstName;
    private String lastName;
    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }
        public void setLastName(String lastName) {
            if (lastName != null) {
                this.lastName = lastName;
            } else {
                this.lastName = "";
            }
        }

    public String getFullName() {
        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            return firstName + " " + lastName;
        } else if (firstName.isEmpty() && !lastName.isEmpty()) {
            return lastName;
        } else if (!firstName.isEmpty()) {
            return firstName;
        } else {
            return "Unknown";
        }
    }
}

