package exercises.technology;

public class Program {

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("2.4 GHz Dual-Core Intel Core i5", "8 GB", "256 GB", "open");
        SmartPhone mySmartPhone = new SmartPhone("A11 Bionic x64", "3 GB", "64 GB", "130958616534");

        System.out.println(String.format("Wren's laptop specs:\nCPU: %s\nMemory: %s\nDisk capacity: %s\nStatus: %s\nSerial number: %s", myLaptop.getCpuSpec(), myLaptop.getMemorySize(), myLaptop.getDiskCapacity(), myLaptop.getCloseOpenStatus(), myLaptop.getUniquId()));
        System.out.println("**********");
        System.out.println(String.format("Wren's smart phone specs:\nCPU: %s\nMemory: %s\nDisk capacity: %s\nNumber: %s\nSerial number: %s", mySmartPhone.getCpuSpec(), mySmartPhone.getMemorySize(), mySmartPhone.getDiskCapacity(), mySmartPhone.getNumber(), mySmartPhone.getUniquId()));
    }

}
