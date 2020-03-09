package Kalasnikov;
import java.util.Scanner;
public class Kalashnikov {
    private String shiftLever;
    private int clip;
    public int shots;
    public Kalashnikov (String shiftLever, int clip){
        this.shiftLever = "oneShot";
        this.clip = 30;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("При вводе '1' - автомат стреляет.");
        System.out.println("При вводе '2' - автомат переключается на автоматическую стрельбу (5 пуль выстрел)");
        System.out.println("При вводе '3' - автомат переключается на режим 'Одиночный выстрел'");
        Kalashnikov kalashnikov = new Kalashnikov("oneShot", 30);
        for (int i = 1000000000; i >2; i--){
        int shots = scanner.nextInt();
        if (shots ==1) kalashnikov.trigger();
        else if (shots ==2) kalashnikov.ShiftLeverAuto();
        else if (shots ==3) kalashnikov.ShiftLeverOne();
        else if (shots ==4) kalashnikov.newClip();
        else  System.out.println("Введите команду '1' или '2' или '3'");
        }
    }


    public void trigger() {
        if (shiftLever == "oneShot")
            oneShot();

        else if (shiftLever == "autoShot")
            autoShot();

        else
            System.out.println("Введите команду");

    }
    private void ShiftLeverAuto() {
        shiftLever = "autoShot";
    }

    private void ShiftLeverOne() {
        shiftLever = "oneShot";
    }

    private void oneShot (){
        if (clip > 0) {
            clip--;
            System.out.println("В обойме -" + " " + clip + " " + "пуль");
        }
        else System.out.println("В обойме -" + " " + clip + " " + "пуль, для перезарядки нажмите '4'");


    }
    private void autoShot (){
        if (clip == 0)
        { System.out.println("В обойме -" + " " + clip + " " + "пуль, для перезарядки нажмите '4'"); }
        else if ( clip <=5) {
            clip = clip - clip;
                System.out.println("В обойме -" + " " + clip + " " + "пуль");
                 }
        else if (clip >= 5 ){
            clip = clip - 5;
                System.out.println("В обойме -" + " " + clip + " " + "пуль");
                 }
        }
    public void newClip (){
        if (clip == 0) { clip = 30; System.out.println("В обойме -" + " " + clip + " " + "пуль, вы перезарядились");}
        else System.out.println("В обойме еще есть патроны");


    }

}
