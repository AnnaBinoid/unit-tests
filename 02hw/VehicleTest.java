package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {

    Car car = new Car("Dodge", "Ram", 2010);
    Motorcycle moto = new Motorcycle("Yamaha", "FZ6", 2015);

    /**
     * - Проверить, что экземпляр объекта Car также является экземпляром
     * транспортного средства (используя оператор instanceof).
     */

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof  Vehicle);
    }

    /**
     * - Проверить, что объект Car создается с 4-мя колесами
     */

    @Test
    public void testIsCarWith4Wheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    /**
     * - Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    public void testMotoWith2Wheels(){
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    /**
     * - Проверить, что объект Car развивает скорость 60
     * в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void TestCarSpeed60InTestDrive(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * - Проверить, что объект Motorcycle развивает скорость 75
     * в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void TestMotoSpeed60InTestDrive(){
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }
    /**
     * - Проверить, что в режиме парковки (сначала testDrive,
     * потом park, т.е. эмуляция движения транспорта)
     * машина останавливается (speed = 0).
     */
    @Test
    public void TestCarSpeed0InPark(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    /**
     * - Проверить, что в режиме парковки (сначала testDrive,
     * потом park, т.е. эмуляция движения транспорта)
     * мотоцикл останавливается (speed = 0).
     */

    @Test
    public void TestMotoSpeed0inPark(){
        moto.testDrive();;
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}