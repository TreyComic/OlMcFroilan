package demo;

public class Field
{
    private Croprow[] rowCrops;
    public Field(int size)
    {
        rowCrops = new Croprow[size];
    }
    public Croprow[] getRowCrops()
    {
        return rowCrops;
    }

    public void setRowCrops(Croprow[] rowCrops)
    {
        this.rowCrops = rowCrops;
    }
}
