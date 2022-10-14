public class clientInternacional implements Client {

    @Override
    public void update(Notify n) {
        System.out.println("Dear customer," + n.getMessageContent());
    }
}
