package demo;

public class Farmer extends Person implements Botanist
{
    private Tractor favoriteTractor;
    public Farmer(String name)
    {
        super(name);
        favoriteTractor=new Tractor();
        System.out.println(name+" contstructed");
    }
    @Override
    public void plant(Field field,String cropType, int cropRowNumbah)
    {
        cropType=cropType.toLowerCase();
        System.out.println("Planting a row of "+cropType+"...");
        Croprow[] workingField = field.getRowCrops();
        if(cropRowNumbah>workingField.length)
        {
            System.out.println("That crop row doesn't exist!");
            return;
        }
        Crop[] workingRow = workingField[cropRowNumbah].getCrops();
        int plantedCount = 0;
        switch(cropType) {
            case "tomato plant":
                for (int i = 0; i < workingRow.length; i++)
                {
                    workingRow[i] = new TomatoPlant();
                    plantedCount++;
                }
                System.out.println("Planted " + plantedCount + " tomato plants.");
                break;
            case "corn stalk":
                for (int i = 0; i < workingRow.length; i++)
                {
                    workingRow[i] = new CornStalk();
                    plantedCount++;
                }
                System.out.println(this.getName() + " planted " + plantedCount + " corn stalks.");
                break;
            default:
                System.out.println("I don't recognize that plant. Why don't I recognize it? im scared.");
        }
        field.setRowCrops(workingField);
    }
    public void plant(Field field, String cropType,int cropRowNumbah,int cropLocation)
    {   cropType=cropType.toLowerCase();
        System.out.println("Planting one "+cropType);
        Croprow[] workingField = field.getRowCrops();
        if(cropRowNumbah>workingField.length)
        {
            System.out.println("That crop row doesn't exist!");
            return;
        }
        Crop[] workingRow = workingField[cropRowNumbah].getCrops();
        if (cropLocation>workingField.length)
        {
            System.out.println("That space doesn't exist in croprow #"+cropRowNumbah);
            return;
        }
        switch(cropType)
        {
            case "tomato plant":
                    workingRow[cropLocation] = new TomatoPlant();
            case "corn stalk":
                    workingRow[cropLocation] = new CornStalk();
            default:
                System.out.println("I don't recognize that plant. Why don't I recognize it? im scared.");
        }
        workingField[cropRowNumbah].setCrops(workingRow);
        field.setRowCrops(workingField);
        System.out.println(this.getName()+" planted one "+cropType);
    }
    public Tractor getFavoriteTractor()
    {
        return favoriteTractor;
    }
    public void setFavoriteTractor(Tractor favoriteTractor)
    {
        this.favoriteTractor = favoriteTractor;
    }
    public void mount()
    {
        mount(favoriteTractor);
    }
}
