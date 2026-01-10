public class MainApp {

    public static void main(String[] args) {

        AuthService auth = new AuthService();
        UserService userService = new UserService();

        if (auth.login("admin", "1234")) {
            userService.displayUserProfile("admin");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}
