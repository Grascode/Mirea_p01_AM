package homework2;

public class Passport implements Comparable<Passport>{
    private String fullName;
    private Integer number;
    private String profession;
    private Boolean access;

    public String getFullName() {
        return fullName;
    }
    public Integer getNumber() {
        return number;
    }

    @Override
    public int compareTo(Passport o) {
        return getFullName().compareTo(o.getFullName());
    }

    public Passport(String fullName, Integer number, String profession, Boolean access) {
        this.fullName = fullName;
        this.number = number;
        this.profession = profession;
        this.access = access;
    }
    @Override
    public String toString() {
        return fullName + ", " + number + ", " +
                profession + ", " + access;
    }
}
