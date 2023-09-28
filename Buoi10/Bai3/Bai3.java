//Vegetable interface class
interface Vegetable
{
    public String getInfo();
}

//Implements classes
class Carrot implements Vegetable
{
    private String type;

    //Constructor with all attributes
    public Carrot(String type)
    {
        this.type = type;
    }

    public String getInfo()
    {
        return "Carrot[type = " + this.type + "]";   
    }
}

class Cabbage implements Vegetable
{
    private String type;
    private double weight;

    //Constructor with all attributes
    public Cabbage(String type, double weight)
    {
        this.type = type;
        this.weight = weight;
    }

    public String getInfo()
    {
        return "Cabbage[type = " + this.type + ", weight = " + this.weight + "]";
    }
}

class Pumpkin implements Vegetable
{
    private double weight;

    //Constructor with all attributes
    public Pumpkin(double weight)
    {
        this.weight = weight;
    }

    public String getInfo()
    {
        return "Pumpkin[weight = " + this.weight + "]";
    }
}

//FactoryPattern class
class VegetableFactory
{
    public Vegetable getVegetable(String type)
    {
        if(type.equalsIgnoreCase("carrot"))
        {
            return new Carrot(type);
        }
        else if(type.equalsIgnoreCase("cabbage"))
        {
            return new Cabbage(type, 0.0);
        }
        else if(type.equalsIgnoreCase("pumpkin"))
        {
            return new Pumpkin(0.0);
        }
        else
        {
            throw new IllegalArgumentException("Invalid vegetable type");
        }
    }
}

//Main class 
public class Bai3
{
    public static void main(String[] args)
    {
        //Initiate VegetableFactory
        VegetableFactory vf = new VegetableFactory();

        //Initiate Carrot by VegatableFactory
        Vegetable carrot = vf.getVegetable("carrot");
        System.out.println(carrot.getInfo());

        //Initiate Cabbage by VegatableFactory
        Vegetable cabbage = vf.getVegetable("cabbage");
        System.out.println(cabbage.getInfo());

        //Initiate Pumpkin by VegetableFactory
        Vegetable pumpkin = vf.getVegetable("pumpkin");
        System.out.println(pumpkin.getInfo());
    }
}
