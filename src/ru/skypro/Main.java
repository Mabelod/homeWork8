package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Author joanneRowling = new Author("Джоан", "Роулинг");
        Author rogerZelazny = new Author("Роджер", "Желязны");
        Author z = new Author("Роджер", "Желязны");

        Book theChroniclesOfAmber = new Book("Хроники Амбера", 1970, rogerZelazny);
        Book harryPotter = new Book("Гарри Поттер", 1997, joanneRowling);
        Book x = new Book("Гарри Поттер", 1997, joanneRowling);

        System.out.println("theChroniclesOfAmber.getPublicationYear() = " + theChroniclesOfAmber.getPublicationYear());
        theChroniclesOfAmber.setPublicationYear(1999);
        System.out.println("theChroniclesOfAmber.getPublicationYear() = " + theChroniclesOfAmber.getPublicationYear());

        System.out.println("harryPotter.getPublicationYear() = " + harryPotter.getPublicationYear());
//        harryPotter.setPublicationYear(2022);
        System.out.println("harryPotter.getPublicationYear() = " + harryPotter.getPublicationYear());

        System.out.println(rogerZelazny);
        System.out.println(theChroniclesOfAmber);
        System.out.println(rogerZelazny.equals(z));
        System.out.println(harryPotter.equals(x));
    }
}
