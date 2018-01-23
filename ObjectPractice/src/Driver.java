import java.util.ArrayList;
public class Driver
	{

		public static void main(String[] args)
			{
				ArrayList <Car> garage = new ArrayList<Car>();
				
				garage.add(new Car("fkrt-87t6", 2624));
				garage.add(new Car("856yepf5623", 4001));
				
				for(int i = 0; i < garage.size(); i++)
					{
						System.out.println(garage.get(i).getPlate());
					}
			}

	}
