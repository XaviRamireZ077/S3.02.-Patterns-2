public class clientNacional implements Client {

    @Override
    public void update(Notify n) {
        System.out.println("Estimado cliente," + n.getMessageContent());
    }
}
