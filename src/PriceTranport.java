public class PriceTranport {
    public static void main (String [] args){
        Honda crv = new Honda();
        crv.kindOfTranspert();
        crv.modelCar();
        crv.price();
        crv.driveUnit();
        crv.maxSpeed();
        crv.color();


        Mazda mazda = new Mazda();
        mazda.kindOfTranspert();
        mazda.modelCar();
        mazda.price();
        mazda.driveUnit();
        mazda.maxSpeed();
        mazda.color();

        Nissan nissan = new Nissan();
        nissan.kindOfTranspert();
        nissan.modelCar();
        nissan.price();
        nissan.driveUnit();
        nissan.maxSpeed();
        nissan.color();

        Forward forward = new Forward();
        forward.kindOfTranspert();
        forward.modelBike();
        forward.price();
        forward.style();
        forward.maxSpeed();
        forward.color();

        Kama kama = new Kama();
        kama.kindOfTranspert();
        kama.modelBike();
        kama.price();
        kama.style();
        kama.maxSpeed();
        kama.color();

        Ural ural = new Ural();
        ural.kindOfTranspert();
        ural.modelBike();
        ural.price();
        ural.style();
        ural.maxSpeed();
        ural.color();

        Kawasaki kawasaki = new Kawasaki();
        kawasaki.kindOfTranspert();
        kawasaki.modelMotorcycle();
        kawasaki.price();
        kawasaki.style();
        kawasaki.maxSpeed();
        kawasaki.color();

        Suzuki suzuki = new Suzuki();
        suzuki.kindOfTranspert();
        suzuki.modelMotorcycle();
        suzuki.price();
        suzuki.style();
        suzuki.maxSpeed();
        suzuki.color();

        Yamaha yamaha = new Yamaha();
        yamaha.kindOfTranspert();
        yamaha.modelMotorcycle();
        yamaha.price();
        yamaha.style();
        yamaha.maxSpeed();
        yamaha.color();

        System.out.println(crv);
        System.out.println(mazda);
        System.out.println(nissan);
        System.out.println(forward);
        System.out.println(kama);
        System.out.println(ural);
        System.out.println(kawasaki);
        System.out.println(suzuki);
        System.out.println(yamaha);
    }
}
