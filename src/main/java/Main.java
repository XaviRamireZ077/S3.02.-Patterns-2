public class Main {
    public static void main(String[] args) {

        clientNacional c1 = new clientNacional();
        clientInternacional c2 = new clientInternacional();
        notifyManager m = new notifyManager();
        m.add(c1);
        m.add(c2);
        c1.update(new Notify(" uno o varios productos de los que tiene contratados han sido actualizados,\n" +
                " puede ingresar en nuestra plataforma y consultar los nuevos valores de sus inversiones"));
        System.out.println("#########################################################################");
        c2.update(new Notify(" one or more products of which you have contracted have been updated,\n" +
                " you can enter our platform and check the new values of your investments"));


    }




    }
