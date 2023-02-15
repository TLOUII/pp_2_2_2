package web.Dao;

import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1, "Honda", "green"));
        carList.add(new Car(2, "Toyota", "Red"));
        carList.add(new Car(3, "Cadillac", "Black"));
        carList.add(new Car(4, "Suzuki", "White"));
        carList.add(new Car(5, "Volkswagen", "Gray"));
    }

    @Override
    public List<Car> getListCar() {
        return carList;
    }

    @Override
    public List<Car> getCertainAmountCars(int n) {
        if (n < 0) {
            n = 0;
        } else if (n > carList.size()) {
            return carList;
        }
        return carList.subList(0, n);
    }

}
