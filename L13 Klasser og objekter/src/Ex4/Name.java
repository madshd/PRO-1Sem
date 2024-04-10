package Ex4;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = null;
        this.lastName = lastName;
    }
    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFullName() {
        String fullName = this.firstName + " " + this.middleName + " " + this.lastName;
        return fullName;
    }

    public String username() {
        String username;
        String firstTwo = this.firstName.substring(0,2);
        int noMid;
        String lastTwo = this.lastName.substring(lastName.length() - 2);

        if (this.middleName == null) {
            noMid = 0;
        } else {
            noMid = this.middleName.length();
        }

        username = firstTwo.toUpperCase() + noMid + lastTwo.toLowerCase();

        return username;
    }

    public String getInits() {
        String inits;
        if (middleName == null) {
            inits = String.valueOf(this.firstName.charAt(0) + "." + this.lastName.charAt(0));
        } else {
            inits = String.valueOf(this.firstName.charAt(0) + "." + this.middleName.charAt(0) + "." + this.lastName.charAt(0));
        }
        return inits;
    }

    public String getCryptoInits(int count) {
        char ch1 = (char) (firstName.charAt(0) + count);
        char ch3 = (char) (lastName.charAt(0) + count);
        if (middleName == null) {
            return "" + ch1 + ch3;
        } else {
            char ch2 = (char) (middleName.charAt(0) + count);
            return "" + ch1 + ch2 + ch3;
        }
    }
    @Override
    public String toString() {
        return "Name | " +
                "First name: '" + firstName + '\'' +
                " | Middle name: '" + middleName + '\'' +
                " | Last name: '" + lastName + '\'';
    }
}