public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 2: Переменные");
        //task 1
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //task 2
        System.out.println("Задание 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //task 3
        System.out.println("Задание 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //task 4
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        //task 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /=3.5;
        System.out.println("frog = " + frog);
        frog +=4;
        System.out.println("frog = " + frog);

        //task 6
        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов = " + totalBoxerWeight);
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе бойцов = " + differenceWeight);

        //task 7
        System.out.println("Задание 7");
        var methodOneForDifferenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе бойцов, посчитанная первым способом = " + methodOneForDifferenceWeight);
        var methodTwoForDifferenceWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе бойцов, посчитанная вторым способом = " + methodTwoForDifferenceWeight);

        //task 8
        System.out.println("Задание 8");
        var totalHours = 640;
        var timeForOneEmployeer = 8;
        var totalEmployeers = totalHours / timeForOneEmployeer;
        System.out.println("Всего работников в компании – " + totalEmployeers + " человек");
        var newTotalEmployeers = totalEmployeers + 94;
        var newTotalHours = newTotalEmployeers * timeForOneEmployeer;
        System.out.println("Если в компании работает " + newTotalEmployeers + " человека, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}