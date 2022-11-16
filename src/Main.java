public class Main {
    public static void main(String[] args) {
        //ДЗ 1: Задача 1
        System.out.println("ДЗ 1: Задача 1");
        int age = 39;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!!!");
        }
        if (age < 18) {
            System.out.println("Подожди немного! Возраст совершеннолетия ещё не наступил.");
        }

        //ДЗ 1: Задача 2
        System.out.println("ДЗ 1: Задача 2");
        //ребенок ходит в школу, если его возраст равен или больше 7 годам
        //человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        //человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
        int yearsOld = 29;
        if (yearsOld < 7) {
            System.out.println("Ты еще малыш!");
        }
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ты ходишь в школу.");
        }
        if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Поздравляем! Ты закончил школу! Тепрь ты можешь поступать в университет.");
        }
        if (yearsOld >= 24) {
            System.out.println("Поздравляем! Ты окончил университет! Пора искать первую работу.");
        }

        //ДЗ 1: Задача 3
        System.out.println("ДЗ 1: Задача 3");
        //Вместимость одного вагона поезда составляет 102 человека.
        //Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.
        //Напишите программу, которая выводит в консоль сообщение о том, есть ли место в вагоне:
        // сидячее или стоячее или вагон уже полностью забит.
        int wagonCapacity = 102;
        int seatingPlaces = 60;
        int yourTicketNumber = 106;
        if (yourTicketNumber <= seatingPlaces) {
            System.out.println("В вагоне есть свободные сидячие места. Вы можете занять одно из них.");
        }
        if (yourTicketNumber > seatingPlaces && yourTicketNumber <= wagonCapacity) {
            System.out.println("Все сидячие места в вагоне заняты, но осталить свободные стоячие места. Вы можете занять одно из них");
        }
        if (yourTicketNumber > wagonCapacity) {
            System.out.println("К сожалению, вагон полностью занят. Свободных мест нет!");
        }

        //ДЗ 2: Задача 1
        System.out.println("ДЗ 2: Задача 1");
        int userAge = 17;
        if (userAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием!!!");
        } else {
            System.out.println("Подожди немного! Возраст совершеннолетия ещё не наступил.");
        }

        //ДЗ 2: Задача 2
        System.out.println("ДЗ 2: Задача 2");
        //ребенок ходит в школу, если его возраст равен или больше 7 годам
        //человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        //человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
        int userYearsOld = 29;
        if (userYearsOld < 7) {
            System.out.println("Ты еще малыш!");
        }
        if (userYearsOld >= 7 && userYearsOld < 18) {
            System.out.println("Ты ходишь в школу.");
        }
        if (userYearsOld >= 18 && userYearsOld < 24) {
            System.out.println("Поздравляем! Ты закончил школу! Тепрь ты можешь поступать в университет.");
        } else {
            System.out.println("Поздравляем! Ты окончил университет! Пора искать первую работу.");
        }

        //ДЗ 2: Задача 3
        System.out.println("ДЗ 2: Задача 3");
        //Вместимость одного вагона поезда составляет 102 человека.
        //Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.
        //Напишите программу, которая выводит в консоль сообщение о том, есть ли место в вагоне:
        // сидячее или стоячее или вагон уже полностью забит.
        int capacityOfAnotherWagon = 102;
        int seatingPlacesAnotherWagon = 60;
        int yourOtherTicketNumber = 16;
        if (yourOtherTicketNumber <= seatingPlacesAnotherWagon) {
            System.out.println("В вагоне есть свободные сидячие места. Вы можете занять одно из них.");
        } else {
            if (yourOtherTicketNumber > seatingPlacesAnotherWagon && yourOtherTicketNumber <= capacityOfAnotherWagon) {
                System.out.println("Все сидячие места в вагоне заняты, но осталить свободные стоячие места. Вы можете занять одно из них");
            } else {
                System.out.println("К сожалению, вагон полностью занят. Свободных мест нет!");
            }
        }

        //ДЗ 3: Задача 1
        System.out.println("ДЗ 3: Задача 1");
        //Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад;
        //Если человек от 7 до 18 лет, то ему нужно ходить в школу;
        //Если человеку больше 18 лет, но меньше 24, то его место в университете;
        //А если человеку больше 24, то ему пора ходить на работу
        //При выполнении каждого условия программа должна выводить в консоль сообщение в формате :
        // "Если возраст человека равен … , то ему нужно ходить … (в зависимости от возраста дописать нужное)"
        int personsAge = 33;
        boolean needToGoToKindergarten = personsAge >= 2 && personsAge <= 6;
        //System.out.println(needToGoToKindergarten);
        boolean needToGoToSchool = personsAge >= 7 && personsAge <= 18;
        //System.out.println(needToGoToSchool);
        boolean needToGoToUniversity = personsAge > 18 && personsAge <= 24;
        //System.out.println(needToGoToUniversity);
        boolean needToGoToWork = personsAge > 24;
        //System.out.println(needToGoToWork);
        if (needToGoToKindergarten) {
            System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в детский сад");
        } else {
            if (needToGoToSchool) {
                System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в школу");
            } else {
                if (needToGoToUniversity) {
                    System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить в университет");
                } else {
                    System.out.println("Если возраст человека равен " + personsAge + ", то ему нужно ходить на работу");
                }
            }
        }

        //ДЗ 3: Задача 2
        System.out.println("ДЗ 3: Задача 2");
        //Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        //Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого.
        // Если взрослого нет, то кататься нельзя.
        //Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        //Напишите программу, которая выводит в консоль сообщение о том,
        // можно ли ребенку кататься одному или в сопровождении взрослого в зависимости от того, сколько ему лет.
        int childAge = 15;
        boolean canRideTheAttractionAlone = childAge >= 14;
        boolean canRideTheAttractionWithAnAccompany = childAge >= 5 && childAge < 14;
        if (canRideTheAttractionAlone) {
            System.out.println("Ты можешь кататься на аттракционе без сопровождения взрослого");
        } else {
            if (canRideTheAttractionWithAnAccompany) {
                System.out.println("Ты можешь кататься на аттракционе, но только в сопровождении взрослого");
            } else {
                System.out.println("Ты не можешь кататься на аттракционе!");
            }
        }

        //ДЗ 3: Задача 3
        System.out.println("ДЗ 3: Задача 3");
        int one = 5;
        int two = 2;
        int three = 3;
        if (two > one && two > three) {
            System.out.println(two);
        } else {
            if (three > one && three > two) {
                System.out.println(three);
            } else {
                System.out.println(one);
            }
        }

        }
}