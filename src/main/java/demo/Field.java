package demo;

public class Field
{
    private Croprow[] rowCrops;
    public Field(int size)
    {
        rowCrops = new Croprow[size];
        for (int i=0;i<size;i++)
        {
            rowCrops[i]=new Croprow();
        }
        System.out.println("Field of "+size+" rows of 10 crops constructed");
    }
    public Field(int size,int rowSize)
    {
        rowCrops = new Croprow[size];
        for (int i=0;i<rowSize;i++)
        {
            rowCrops[i]=new Croprow(rowSize);
        }
        System.out.println("Field of "+size+" rows of "+rowSize+ " crops constructed");
    }
    public Croprow[] getRowCrops()
    {
        return rowCrops;
    }
    public Croprow getRowCrops(int cropRow)
    {
        return rowCrops[cropRow];
    }
    public void setRowCrops(Croprow[] rowCrops)
    {
        this.rowCrops = rowCrops;
    }
    public void setRowCrops(int cropRow, Croprow rowCrops)
    {
        this.rowCrops[cropRow] = rowCrops;
    }
}
