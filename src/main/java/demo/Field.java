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
