package exercises.technology;

public class Computer extends AbstractEntity{

    private String cpuSpec;
    private String memorySize;
    private String diskCapacity;

    public Computer(String aCpuCapacity, String aMemorySize, String aDiskCapacity) {
        cpuSpec = aCpuCapacity;
        memorySize = aMemorySize;
        diskCapacity = aDiskCapacity;
        this.setUniquId();
    }

    public String getCpuSpec() {
        return cpuSpec;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public String getDiskCapacity() {
        return diskCapacity;
    }

    private void setCpuSpec(String cpuSpec) {
        this.cpuSpec = cpuSpec;
    }

    private void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    private void setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
    }
}
