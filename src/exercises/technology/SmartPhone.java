package exercises.technology;

public class SmartPhone extends Computer {
    private String number;

    public SmartPhone(String aCpuCapacity, String aMemorySize, String aDiskCapacity, String aNumber) {
        super(aCpuCapacity, aMemorySize, aDiskCapacity);
        number = aNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
