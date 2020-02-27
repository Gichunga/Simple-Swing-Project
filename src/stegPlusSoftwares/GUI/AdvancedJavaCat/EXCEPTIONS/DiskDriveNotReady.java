package stegPlusSoftwares.GUI.AdvancedJavaCat.EXCEPTIONS;

public class DiskDriveNotReady extends Exception{
    public DiskDriveNotReady()
    {
        super ("Disk Drive Not Ready");
    }
    public DiskDriveNotReady(String message)
    {
        super(message);
    }

    public static void main(String [] args)
    {

        try {
            throw new DiskDriveNotReady();
            //throw new DiskDriveNotReady("Try another disk");
        }catch (DiskDriveNotReady e)
        {
            System.out.println(e.getMessage());
        }
    }
}
