public class Main {
    public static void main(String[] args) {

        ///Task1\\\

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763389;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        ///Task2\\\

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        ///Task3\\\

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        ///Task4\\\

        var friend = 19;

        System.out.println("friend = " + friend);

        friend = friend + 2;

        System.out.println("friend = " + friend);

        friend = friend / 7;

        System.out.println("friend = " + friend);

        ///Task5\\\

        var frog = 3.5;

        System.out.println("frog = " + frog);

        frog = frog * 10;

        System.out.println("frog = " + frog);

        frog = frog / 3.5;

        System.out.println("frog = " + frog);

        frog = frog + 4;

        System.out.println("frog = " + frog);

        ///Task6\\\

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;

        System.out.println("Масса боксёра 1 = " + weightBoxer1 + "кг");
        System.out.println("Масса боксёра 2 = " + weightBoxer2 + "кг");

        var weightBoxers = weightBoxer1 + weightBoxer2;

        System.out.println("Масса двух боксёров = " + weightBoxers + "кг");

        var differenceWeight = weightBoxer2 - weightBoxer1;

        System.out.println("Разница в весе = " + differenceWeight + "кг");

        ///Task7\\\

        var remainder = weightBoxer2 % weightBoxer1;

        System.out.println("Остаток от деления между двумя весами = " + remainder + "кг");

        ///Task8\\\

        var totalHours = 640;
        var oneWorker = 8;

        var totalWorkers = 640 / 8;

        System.out.println("Всего работников в компании = " + totalWorkers + " человек ");

        totalWorkers = totalWorkers + 94;

        var result = totalHours / totalWorkers;

        System.out.println("Если в компании работает = " + totalWorkers + " человека, то всего по = " + result + " часа работы может быть поделено между сотрудниками");






    }
}