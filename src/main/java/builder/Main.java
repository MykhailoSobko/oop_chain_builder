package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Oles")
                .age(30)
                .occupation("UCU")
                .occupation("IPPMM")
                .lastName("Dobosevych")
                .build();
        System.out.println(user);
    }
}
