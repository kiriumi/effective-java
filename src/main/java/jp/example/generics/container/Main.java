package jp.example.generics.container;

public class Main {

    public static void main(String[] args) {

        final Container container = new Container();

        final Example example = new Example();

        final PersonAnnotation personAnnotation = example.getClass().getAnnotation(PersonAnnotation.class);
        container.put(PersonAnnotation.class, personAnnotation);

        final RoleAnnotation roleAnnotation = example.getClass().getAnnotation(RoleAnnotation.class);
        container.put(RoleAnnotation.class, roleAnnotation);

        // ----------------

        final PersonAnnotation personInfo = container.get(PersonAnnotation.class);
        System.out.println(personInfo.name() + personInfo.age());

        final RoleAnnotation roleInfo = container.get(RoleAnnotation.class);

        for (final String role : roleInfo.value()) {
            System.out.print(role);
        }

    }

}
