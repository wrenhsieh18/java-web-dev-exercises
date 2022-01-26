package exercises.technology;

public class Laptop extends Computer {
    private String closeOpenStatus = "closed";

    public Laptop(String aCpuCapacity, String aMemorySize, String aDiskCapacity, String aCloseOpenStatus) {
        super(aCpuCapacity, aMemorySize, aDiskCapacity);
        closeOpenStatus = aCloseOpenStatus;
    }

    public String getCloseOpenStatus() {
        return closeOpenStatus;
    }

    public void setCloseOpenStatus(String closeOpenStatus) {
        this.closeOpenStatus = closeOpenStatus;
    }
}
